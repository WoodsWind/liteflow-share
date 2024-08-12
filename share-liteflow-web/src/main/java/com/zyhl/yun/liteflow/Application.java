package com.zyhl.yun.liteflow;

import com.yomahub.liteflow.builder.el.LiteFlowChainELBuilder;
import com.yomahub.liteflow.core.FlowExecutor;
import com.zyhl.yun.liteflow.application.context.*;
import com.zyhl.yun.liteflow.domain.entity.FileEntity;
import com.zyhl.yun.liteflow.domain.entity.OutLinkEntity;
import com.zyhl.yun.liteflow.domain.entity.UserDomainEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.Environment;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import java.net.InetAddress;
import java.nio.channels.FileChannel;
import java.util.Arrays;
import java.util.Collection;

/**
 * @author 25538
 */
@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
@EnableConfigurationProperties
public class Application {

	private static final Logger log = LoggerFactory.getLogger(Application.class);

	@Resource
	private Environment env;

	@PostConstruct
	public void initApplication() {
		log.info("Running with Spring profile(s) :{} ", Arrays.asList(env.getActiveProfiles()));
		Collection<String> activeProfiles = Arrays.asList(env.getActiveProfiles());
		if (activeProfiles.contains(ConfigConstant.SPRING_PROFILE_DEVELOPMENT) && activeProfiles.contains(ConfigConstant.SPRING_PROFILE_PRODUCTION)) {
			log.error("You have error configured your application! It should not run " +
					"with both the 'dev' and 'prod' profiles at the same time.");
		}
		if (activeProfiles.contains(ConfigConstant.SPRING_PROFILE_DEVELOPMENT) && activeProfiles.contains(ConfigConstant.SPRING_PROFILE_CLOUD)) {
			log.error("You have error configured your application! It should not" +
					"run with both the 'dev' and 'cloud' profiles at the same time.");
		}
	}

	/**
	 * Main method, used to run the application.
	 *
	 * @param args the vo line arguments
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {

		SpringApplication app = new SpringApplication(Application.class);

		ApplicationContext appContext = app.run(args);

		Environment env = appContext.getEnvironment();

		FlowExecutor flowExecutor = appContext.getBean(FlowExecutor.class);

		log.info("\n----------------------------------------------------------\n\t" +
						"Application '{}' is running! Access URLs:\n\t" +
						"Local: \t\thttp://localhost:{}\n\t" +
						"External: \thttp://{}:{}\n----------------------------------------------------------",
				env.getProperty("spring.application.name"),
				env.getProperty("server.port"),
				InetAddress.getLocalHost().getHostAddress(),
				env.getProperty("server.port"));

		//LiteFlowChainELBuilder.createChain().setEL("THEN(userInfo)").setChainId("chain1").build();
		// 用户
		UserDomainEntity userDomainEntity = new UserDomainEntity(12345L,"phone");
		UserContext userContext = UserContext.builder().userInfo(userDomainEntity).build();
		// 操作
		OprContext oprContext = new OprContext();
		// 权益
		BenefitContext benefitContext = new BenefitContext();
		// 文件
		FileEntity fileEntity = FileEntity.builder().fileId("fileA").build();
		FileContext fileContext = FileContext.builder().fileInfo(fileEntity).build();
		// 分享的文件
		AssetsContext assetsContext = new AssetsContext();
		// 外链
		OutLinkEntity outLinkEntity = new OutLinkEntity();
		OutLinkContext outLinkContext = new OutLinkContext(outLinkEntity);

		flowExecutor.execute2Future("create-link","", userContext, oprContext, benefitContext, fileContext, assetsContext, outLinkContext);
	}
}

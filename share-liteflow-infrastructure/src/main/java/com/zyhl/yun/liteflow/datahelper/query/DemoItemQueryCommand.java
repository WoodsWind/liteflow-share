package com.zyhl.yun.liteflow.datahelper.query;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.zyhl.yun.liteflow.datahelper.validated.GetListGroupA;
import com.zyhl.yun.liteflow.datahelper.validated.GetListGroupB;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.NotNull;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DemoItemQueryCommand {


	private Long infoId;

}

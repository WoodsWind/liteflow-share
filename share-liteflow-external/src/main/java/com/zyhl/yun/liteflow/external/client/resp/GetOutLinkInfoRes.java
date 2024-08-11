package com.zyhl.yun.liteflow.external.client.resp;
import com.zyhl.yun.liteflow.domain.entity.OutLinkCaInfo;
import com.zyhl.yun.liteflow.domain.entity.OutLinkCoInfo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 25538
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetOutLinkInfoRes {
    private String pCaID;
    private Integer nodNum;
    private OutLinkCaInfo[] caLst;
    private OutLinkCoInfo[] coLst;
    private String tagName;
    private String isCreator;
    private String lkName;
    private String ctTime;
    private Integer dlTimes = 0;
    private String desc;
    private String creator;
    private String owner;
    private Integer brwTimes = 0;
    private Integer svTimes = 0;
    private String homeURL;
    //private String openCount;
    private Integer subLinkType;
    private String expireTime;
    private Integer isunlimitedTimes = 0;
    private Integer belongsPlatform;
    private String nextPageCursor;
    private String resultExplain;

    public GetOutLinkInfoRes(Integer nodNum, String lkName, String ctTime){
        this.nodNum = nodNum;
        this.lkName = lkName;
        this.ctTime = ctTime;
    }
}

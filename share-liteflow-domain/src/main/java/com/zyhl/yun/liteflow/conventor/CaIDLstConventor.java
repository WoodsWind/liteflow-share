package com.zyhl.yun.liteflow.conventor;

import com.zyhl.yun.liteflow.domain.entity.OutLinkCaInfo;
import org.springframework.stereotype.Component;

import javax.annotation.Generated;

@Generated(
        value = "org.mapstruct.ap.MappingProcessor"
)
@Component
public class CaIDLstConventor {
    public CaIDLstConventor() {
    }

    public OutLinkCaInfo[] convertToEntity(String[] caIDLst) {
        OutLinkCaInfo[] caInfos = new OutLinkCaInfo[caIDLst.length];
        for (int i = 0; i < caIDLst.length; i++) {
            caInfos[i] = new OutLinkCaInfo();
            caInfos[i].setCaID(caIDLst[i]);
        }
        return caInfos;
    }

    public String[] convertToString(OutLinkCaInfo[] caInfos) {
        String[] caIDLst = new String[caInfos.length];
        for (int i = 0; i < caInfos.length; i++) {
            caIDLst[i] = caInfos[i].getCaID();
        }
        return caIDLst;
    }
}

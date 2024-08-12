package com.zyhl.yun.liteflow.conventor;

import com.zyhl.yun.liteflow.domain.entity.OutLinkCoInfo;
import org.springframework.stereotype.Component;

import javax.annotation.Generated;

@Generated(
        value = "org.mapstruct.ap.MappingProcessor"
)
@Component
public class CoIDLstConvertor {
    public CoIDLstConvertor() {}
    public OutLinkCoInfo[] convertToEntity(String [] coIDLst) {
        OutLinkCoInfo[] coInfos = new OutLinkCoInfo[coIDLst.length];
        for ( int i = 0; i < coIDLst.length; i++ ) {
            coInfos[i] = new OutLinkCoInfo();
            coInfos[i].setCoID(coIDLst[i]);
        }
        return coInfos;
    }

    public String[] convertToString(OutLinkCoInfo[] coInfos) {
        String[] coIDLst = new String[coInfos.length];
        for ( int i = 0; i < coInfos.length; i++ ) {
            coIDLst[i] = coInfos[i].getCoID();
        }
        return coIDLst;
    }
}

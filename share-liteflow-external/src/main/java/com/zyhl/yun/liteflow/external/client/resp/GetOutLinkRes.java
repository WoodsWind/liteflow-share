package com.zyhl.yun.liteflow.external.client.resp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetOutLinkRes {
    private GetOutLinkResOne[] getOutLinkResSet;

}

package com.zyhl.yun.liteflow.domain.entity;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * @author 25538
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Slf4j
public class OutLinkEntity {
    private OutLinkSnapshotInfo outLinkSnapshotInfo;
    private OutLinkCaInfo[] outLinkCaInfo;
    private OutLinkCoInfo[] outLinkCoInfo;

    @Override
    public String toString() {
        String json = null;
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            json = objectMapper.writeValueAsString(this.outLinkSnapshotInfo)+"\n"
                    +objectMapper.writeValueAsString(this.outLinkCaInfo[0])+"\n"
                    +objectMapper.writeValueAsString(this.outLinkCoInfo[0]);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return "外链：" + json.toString();
    }
}

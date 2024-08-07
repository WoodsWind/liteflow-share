package com.zyhl.yun.liteflow.external.client.req;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.checkerframework.checker.index.qual.Positive;
import org.springframework.beans.factory.annotation.Value;

import javax.validation.constraints.Max;

/**
 * @author 25538
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class FileInfoReq {
    private String userId;
    private String fileId;
    //private String[] imageThumbnailStyleList;

    @Positive
    @Max(86400)
    @Value("${app.expireSec:900}")
    private Integer expireSec;
}

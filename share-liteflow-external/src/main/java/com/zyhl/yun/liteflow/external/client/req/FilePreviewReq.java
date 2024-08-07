package com.zyhl.yun.liteflow.external.client.req;

import com.zyhl.yun.liteflow.external.dto.FilePreviewItem;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.checkerframework.checker.index.qual.Positive;
import org.springframework.beans.factory.annotation.Value;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class FilePreviewReq {
    private String userId;
    private FilePreviewItem[] files;

    @Max(86400)
    @Min(300)
    private Integer expireSec;
}

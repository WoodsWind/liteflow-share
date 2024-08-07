package com.zyhl.yun.liteflow.application.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class DemoPublishDTO {

	private String account;

	private Long type;

	private String content;
}

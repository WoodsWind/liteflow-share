package com.zyhl.yun.liteflow.application.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DemoQueryDTO {

	private Long id;

	@NotBlank(message = "account非空")
	private String account;

	@NotNull(message = "pageNum非空")
	@Min(value = 1, message = "pageNum最小为1")
	private Integer pageNum;

	@NotNull(message = "pageSize非空")
	@Min(value = 1, message = "pageSize最小为1")
	private Integer pageSize;
}

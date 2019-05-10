package sc01.eurekaclient.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@ApiModel(description = "接口返回信息")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResultModel<T> {
	@ApiModelProperty("状态码")
	private String code;
	@ApiModelProperty("信息")
	private String message;
	@ApiModelProperty("实体类")
	private T entity;
}
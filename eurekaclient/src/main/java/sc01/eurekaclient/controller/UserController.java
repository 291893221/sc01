package sc01.eurekaclient.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import sc01.eurekaclient.model.ResultModel;

/**
 *  http://localhost:8083/swagger-ui.html
 */
@RestController
@Api("用户管理")
public class UserController {
	/**
	 * http://localhost:8083/sayHello?username=test001
	 * @param username
	 * @return
	 */
	@GetMapping("/sayHello")
	@ApiOperation("sayHello|hello,用户！")
	@ApiImplicitParam(name = "username", value = "用户名")
	public ResultModel sayHello(String username){
		ResultModel resultModel = new ResultModel<String>();
		resultModel.setCode("100");
		resultModel.setMessage("OK");
		resultModel.setEntity(new String(username));
		return resultModel;
	}
}

package sc01.eurekaclient.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *  http://localhost:8083/swagger-ui.html
 */
@RestController
@Api("用户管理")
public class UserController {
	/**
	 * http://localhost:8083/sayHello?username=张三
	 * @param username
	 * @return
	 */
	@GetMapping("/sayHello")
	@ApiOperation("sayHello|hello,用户！")
	public Object sayHello(String username){
		return "hello "+username;
	}
}

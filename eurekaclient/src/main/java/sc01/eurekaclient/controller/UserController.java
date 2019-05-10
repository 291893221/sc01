package sc01.eurekaclient.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	/**
	 * http://localhost:8083/sayHello?username=张三
	 * @param username
	 * @return
	 */
	@RequestMapping("/sayHello")
	public Object sayHello(String username){
		return "hello "+username;
	}
}

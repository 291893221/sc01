package sc01.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sc01.consumer.service.UserService;

@RestController
public class UserController {
	@Autowired
	private UserService userService;
	/**
	 * http://localhost:8081/sayHello?username=test00000001
	 * @param username
	 * @return
	 */
	@RequestMapping("/sayHello")
	public Object sayHello(String username){
		return userService.sayHello(username);
	}

}

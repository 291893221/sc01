package sc01.consumer.feign.impl;

import org.springframework.stereotype.Component;
import sc01.consumer.feign.UserFeign;

@Component
public class UserFeignImpl implements UserFeign {
	@Override
	public Object sayHello(String username) {
		return "UserFeignImpl sayHello error : "+username;
	}
}

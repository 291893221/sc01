package sc01.consumer.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class UserService {
	@Autowired
	private RestTemplate restTemplate;

	@HystrixCommand(fallbackMethod = "sayHelloFallback")
	public Object sayHello(String username) {
		//String forObject = restTemplate.getForObject("http://localhost:8083/sayHello?username="+username, String.class);
		String forObject = restTemplate.getForObject("http://eurekaclient/sayHello?username="+username, String.class);
		return forObject;
	}

	public Object sayHelloFallback(String username) {
		return "fallbackMethod sayHelloFallback error : "+username;
	}
}

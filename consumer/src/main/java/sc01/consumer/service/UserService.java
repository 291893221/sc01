package sc01.consumer.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class UserService {
	public Object sayHello(String username) {
		RestTemplate restTemplate = new RestTemplate();
		String forObject = restTemplate.getForObject("http://localhost:8083/sayHello?username="+username, String.class);
		return forObject;
	}
}

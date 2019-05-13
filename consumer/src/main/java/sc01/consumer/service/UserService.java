package sc01.consumer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class UserService {
	@Autowired
	private RestTemplate restTemplate;
	public Object sayHello(String username) {
		//String forObject = restTemplate.getForObject("http://localhost:8083/sayHello?username="+username, String.class);
		String forObject = restTemplate.getForObject("http://eurekaclient/sayHello?username="+username, String.class);
		return forObject;
	}
}

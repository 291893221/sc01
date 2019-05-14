package sc01.consumer.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("eurekaclient")
public interface UserFeign {
	@GetMapping("/sayHello")
	Object sayHello(@RequestParam("username") String username);
}

package sc01.zuulserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
@EnableDiscoveryClient
@EnableEurekaClient
public class ZuulserverApplication {

	//http://localhost:8089/api-a/sayHello?username=test0000001Zuul
	//http://localhost:8089/api-b/sayHello?username=test0000001Zuul
	public static void main(String[] args) {
		SpringApplication.run(ZuulserverApplication.class, args);
	}

}

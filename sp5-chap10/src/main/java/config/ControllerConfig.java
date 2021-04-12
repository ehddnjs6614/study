package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ex.ex1.HelloController;

@Configuration
public class ControllerConfig {

	@Bean
	public HelloController helloController() {
		return new HelloController();
	}

}

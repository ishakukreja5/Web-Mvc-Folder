package in.isha;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages={"in.isha.controller"})
public class WebMvcApp1Application {

	public static void main(String[] args) {
		SpringApplication.run(WebMvcApp1Application.class, args);
	}

}

package ecommerce.app.e.packup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages =
		{ "ecommerce.app.e.packup.controller",
		"ecommerce.app.e.packup.entity",
		"ecommerce.app.e.packup.repositary",
		"ecommerce.app.e.packup.service",
		"ecommerce.app.e.packup.model"})
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}

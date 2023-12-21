package com.hendisantika.employee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDiscoveryClient
@OpenAPIDefinition(
		servers = {@Server(url = "/employee", description = "Default Server Path URL")},
		info = @Info(
				title = "Employee API",
				version = "1.0",
				description = "Documentation Employee API v1.0"
		))
@OpenAPIDefinition(info =
@Info(
		title = "Employee API",
		version = "1.0",
		description = "Documentation Employee API v1.0",
		contact = @Contact(
				name = "Hendi Santika",
				url = "https://s.id/hendisantika",
				email = "hendisantika@yahoo.co.id"
		),
		license = @License(name = "Apache 2.0", url = "http://foo.bar"))
)
public class EmployeeApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeApplication.class, args);
	}

}

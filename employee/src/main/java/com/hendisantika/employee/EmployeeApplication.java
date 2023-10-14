package com.hendisantika.employee;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
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

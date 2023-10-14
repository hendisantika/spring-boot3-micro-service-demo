package com.hendisantika.organization;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@OpenAPIDefinition(info =
@Info(
		title = "Organization API",
		version = "1.0",
		description = "Documentation Organization API v1.0",
		contact = @Contact(
				name = "Hendi Santika",
				url = "https://s.id/hendisantika",
				email = "hendisantika@yahoo.co.id"
		),
		license = @License(name = "Apache 2.0", url = "http://foo.bar"))
)
public class OrganizationApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrganizationApplication.class, args);
	}

}

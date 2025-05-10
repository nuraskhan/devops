package com.nuraskhan.accounts;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@OpenAPIDefinition(info = @Info(
		title = "Account MicroServices REST project",
		description = "Bank accounts MicroServices REST documentation",
		contact = @Contact(
				name = "Nuraskhan",
				email = "nuraschan77777@gmail.com"
		),
		license = @License(
				name = "Apache 2.0",
				url = "nuraskhan"
		)
),
		externalDocs = @ExternalDocumentation(
				description = "Bank accounts MicroServices REST documentation",
				url = "nuraskhan"
		))
public class AccountsApplication {
	public static void main(String[] args) {
		SpringApplication.run(AccountsApplication.class, args);
	}

}

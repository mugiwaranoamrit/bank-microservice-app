package com.bank.accounts;

import com.bank.accounts.dto.AccountsContactInfoDto;
import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableFeignClients
@EnableConfigurationProperties(value = {AccountsContactInfoDto.class})
/*@ComponentScans({ @ComponentScan("com.bank.accounts.controller") })
@EnableJpaRepositories("com.bank.accounts.repository")
@EntityScan("com.bank.accounts.model")*/
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@OpenAPIDefinition(
        info = @Info(
                title = "Accounts microservice REST API Documentation",
                description = "Amrit Accounts microservice REST API Documentation",
                version = "v1",
                contact = @Contact(
                        name = "Amrit Vaishnav",
                        email = "amrit@vaishnav.com",
                        url = "https://www.onepiece.com"
                ),
                license = @License(
                        name = "Apache 2.0",
                        url = "https://www.onepiece.com"
                )
        ),
        externalDocs = @ExternalDocumentation(
                description = "Amrit Accounts microservice REST API Documentation",
                url = "https://www.onepiece.com/swagger-ui.html"
        )

)
public class AccountsApplication {

    public static void main(String[] args) {
        SpringApplication.run(AccountsApplication.class, args);
    }

}

package com.rest.herokuwithh2.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EmployeeConfig {
    @Bean
    public OpenAPI apiDoc() {
        return new OpenAPI()
                .info(new Info().title("Spring With swagger..")
                        .description("my swagger")
                        .version("1.0"));
    }
}

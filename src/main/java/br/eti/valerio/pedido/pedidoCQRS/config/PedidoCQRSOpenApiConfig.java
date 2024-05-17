package br.eti.valerio.pedido.pedidoCQRS.config;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PedidoCQRSOpenApiConfig {

    @Bean
    public OpenAPI configOpenAPI() {
        return new OpenAPI()
                .components(new Components())
                .info(new Info().title("Pedido API")
                        .description("API simples para entendimento do CQRS com Spring Boot")
                        .version("1.0"));
    }

}

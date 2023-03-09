package br.projeto.pessoal.gateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfig {

    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                .route(r -> r
                        .path("/staff")
                        .uri("http://localhost:8083/"))
                .route(r -> r
                        .path("/client")
                        .uri("http://localhost:8082/"))
                .route(r -> r
                        .path("/cep/v1/**")
                        .filters(f -> f.rewritePath("/cep/v1/(?<cep>.*)", "/ws/${cep}/json"))
                        .uri("https://viacep.com.br"))
                .route(r -> r
                        .path("/cep/v2/**")
                        .filters(f -> f.rewritePath("/cep/v2/(?<cep>.*)", "/api/cep/v1/${cep}"))
                        .uri("https://brasilapi.com.br"))
                .build();
    }
}

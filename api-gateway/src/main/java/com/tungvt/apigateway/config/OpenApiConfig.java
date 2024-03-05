package com.tungvt.apigateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;

@Configuration
public class OpenApiConfig {
    @Bean
    public RouteLocator routeLocator(RouteLocatorBuilder builder){
        return builder
                .routes()
                .route(r -> r.path("/demo-service/v3/api-docs").and().method(HttpMethod.GET).uri("lb://demo-service"))
                .route(r -> r.path("/websocket/ws/**").and().uri("lb:ws://websocket/websocket/ws"))
                .build();
    }
}

package com.example.gatewayserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GatewayserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(GatewayserverApplication.class, args);
	}

	@Bean
	public RouteLocator myRoutes(RouteLocatorBuilder routeLocatorBuilder) {
		return routeLocatorBuilder.routes()
				.route(p -> p
						.path("/devjangir/PRODUCTSERVICE/**")
						.filters(f -> f.rewritePath("/devjangir/PRODUCTSERVICE/(?<segment>.*)", "/${segment}"))
						.uri("lb://PRODUCTSERVICE"))
				.route(p -> p
						.path("/devjangir/USERSERVICE/**")
						.filters(f -> f.rewritePath("/devjangir/USERSERVICE/(?<segment>.*)", "/${segment}"))
						.uri("lb://USERSERVICE"))
				.build();
	}
}

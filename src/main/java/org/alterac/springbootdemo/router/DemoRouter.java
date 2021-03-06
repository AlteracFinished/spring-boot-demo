package org.alterac.springbootdemo.router;


import org.alterac.springbootdemo.handler.DemoHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

@Configuration
public class DemoRouter {

    @Bean
    public RouterFunction<ServerResponse> route(DemoHandler demoHandler){
        return RouterFunctions.route(RequestPredicates
                .GET("/hello")
                .and(RequestPredicates.accept(MediaType.ALL)),demoHandler::hello);
    }
}

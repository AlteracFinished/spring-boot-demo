package org.alterac.springbootdemo.handler;


import org.alterac.springbootdemo.entity.ResponseItem;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Component
public class DemoHandler {

    public Mono<ServerResponse> hello(ServerRequest serverRequest) {
        return ServerResponse
                .ok()
                .contentType(MediaType.APPLICATION_JSON_UTF8)
                .body(BodyInserters.fromObject(ResponseItem.builder()
                        .responseCode("0")
                        .responseMessage("success")
                        .build()));
    }
}

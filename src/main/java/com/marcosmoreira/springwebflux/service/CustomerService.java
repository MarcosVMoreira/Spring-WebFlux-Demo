package com.marcosmoreira.springwebflux.service;

import com.marcosmoreira.springwebflux.model.response.GetCardResponse;
import com.marcosmoreira.springwebflux.model.response.GetCustomerResponse;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.time.Duration;

@Service
@Slf4j
@RequiredArgsConstructor
public class CustomerService {

    @SneakyThrows
    public Mono<GetCustomerResponse> getCustomer (long delay) {
        return Mono.just(GetCustomerResponse.builder()
                .name("Jose")
                .build()).delayElement(Duration.ofMillis(delay));
    }

    @SneakyThrows
    public GetCardResponse getCard (long delay) {
        Thread.sleep(delay);
        return GetCardResponse.builder()
                .name("Jose")
                .build();
    }
}

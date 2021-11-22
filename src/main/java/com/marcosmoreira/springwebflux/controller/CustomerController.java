package com.marcosmoreira.springwebflux.controller;

import com.marcosmoreira.springwebflux.model.response.GetCardResponse;
import com.marcosmoreira.springwebflux.model.response.GetCustomerResponse;
import com.marcosmoreira.springwebflux.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequiredArgsConstructor
@RequestMapping("/customers-using-webflux")
public class CustomerController {

    private final CustomerService customerService;

    @GetMapping("/with-mono/")
    public Mono<GetCustomerResponse> getCustomer(@RequestParam long delay) {
        return customerService.getCustomer(delay);
    }

    @GetMapping("/without-mono/")
    public GetCardResponse getCard(@RequestParam long delay) {
        return customerService.getCard(delay);
    }
}
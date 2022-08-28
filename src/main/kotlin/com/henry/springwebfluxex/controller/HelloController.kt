package com.henry.springwebfluxex.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Flux

@RestController
class HelloController {

    @GetMapping("/hello")
    fun hello(): Flux<String>? {
        return Flux.just("Hello", "World")
    }
}

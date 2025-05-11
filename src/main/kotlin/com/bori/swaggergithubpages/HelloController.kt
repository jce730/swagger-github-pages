package com.bori.swaggergithubpages

import org.springframework.web.bind.annotation.GetMapping
import kotlin.coroutines.RestrictsSuspension

@RestrictsSuspension
class HelloController {

    @GetMapping("/hello")
    fun hello(): String {
        return "hello"
    }
}
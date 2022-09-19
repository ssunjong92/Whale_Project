package com.sm.whale.user

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class UserController {
    @GetMapping("")
    fun print():String {
        return "MY NAME IS PARKSUNJONG"
    }
}
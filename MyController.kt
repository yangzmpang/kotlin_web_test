package com.example.demo

import com.example.demo.service.IUser
import com.example.demo.service.User
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping(value = "/api")

class MyController {

    @Autowired
    lateinit var userService: IUser

    @GetMapping("/add")
    fun testSet(@RequestParam(value = "name") name: String, @RequestParam(value = "pwd") pwd: String) {
        userService.createUser(name, pwd)
        println( name )
    }

    @RequestMapping(value = "/get", method = arrayOf(RequestMethod.GET,RequestMethod.POST))
    fun testPost(name: String): User {
        var User = userService.getUser( name )
        return User
    }
}

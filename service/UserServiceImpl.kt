package com.example.demo.service

import org.springframework.stereotype.Service

@Service
class UserServiceImpl : IUser {
    // 用来缓存数据，没有用数据库
    var mutableMap: MutableMap<String, String> = mutableMapOf<String, String>()

    override fun getUser(username: String): User {
        lateinit var usr:User
        if (username in mutableMap.keys) {
            usr = User(username, mutableMap.getValue(username))
        }
        return usr
    }

    override fun createUser(username: String, password: String) {
        mutableMap.put(username,password)
    }
}
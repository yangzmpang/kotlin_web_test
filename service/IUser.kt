package com.example.demo.service

data class User(var userName:String,var passWord:String)

interface IUser {
    fun getUser(username: String): User
    fun createUser(username: String,password: String)
}
package com.jamirodev.instagramapp.profile

data class User(
    val username: String,
    val profileImage: String,
    val followers: Int,
    val following: Int,
    val name: String,
    val description: String,
    val stories: List<Highlight>,
    val posts: List<String>
)

data class Highlight(
    val image: String,
    val text: String
)

package com.jamirodev.instagramapp.profile

data class User(
    val username: String,
    val profileImage: String,
    val posts: Int,
    val followers: Int,
    val following: Int,
    val name: String,
    val description: String,
    val stories: List<Highlight>
)

data class Highlight(
    val image: String,
    val text: String
)

package com.jamirodev.instagramapp.profile.components

import androidx.compose.foundation.layout.Box
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import coil.compose.AsyncImage

@Composable
fun ImagePosts(
    imageUrl: String,
    modifier: Modifier = Modifier
) {
    Box(modifier = modifier) {
        AsyncImage(model = imageUrl, contentDescription = "user post")
    }
}
package com.jamirodev.instagramapp.profile.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import coil.compose.AsyncImage

@Composable
fun ImagePosts(
    postClicked: () -> Unit,
    imageUrl: String,
    modifier: Modifier = Modifier
) {
    Box(modifier = modifier.clickable { postClicked() }) {
        AsyncImage(model = imageUrl, contentDescription = "user post")
    }
}
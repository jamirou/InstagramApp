package com.jamirodev.instagramapp.profile.components

import androidx.compose.animation.expandHorizontally
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage

@Composable
fun ProfileInformation(
    profileImage: String,
    posts: Int,
    followers: Int,
    following: Int,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceAround,
        verticalAlignment = Alignment.CenterVertically,
    ) {
        AsyncImage(
            model = profileImage,
            contentDescription = null,
            modifier = modifier
                .size(100.dp)
                .clip(CircleShape)
        )
        ProfileInfo(posts, type = "Posts")
        ProfileInfo(followers, type = "Followers")
        ProfileInfo(following, type = "Following")
    }
}

@Composable
private fun ProfileInfo(
    amount: Int,
    type: String,
    modifier: Modifier = Modifier
) {
    Column(modifier = modifier, horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = amount.toString(), fontWeight = FontWeight.Bold)
        Text(text = type)
    }

}

@Preview(showBackground = true)
@Composable
fun ProfileInformationPreview() {
    ProfileInformation("image", 4, 118, 189)
}
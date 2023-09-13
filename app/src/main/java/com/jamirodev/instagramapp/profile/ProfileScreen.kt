package com.jamirodev.instagramapp.profile

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.jamirodev.instagramapp.profile.components.ProfileDescription
import com.jamirodev.instagramapp.profile.components.ProfileHeader
import com.jamirodev.instagramapp.profile.components.ProfileInformation

@Composable
fun ProfileScreen() {
    val user = User(
        username = "jam3312_",
        profileImage = "https://media1.fdncms.com/riverfronttimes/imager/u/blog/2655968/cat_with_headphones_moving_file_thumb_200x200.png?cb=1454773376.jpg",
        posts = 4,
        followers = 118,
        following = 189,
        name = "Jamiro",
        description = "Programmer 💻"
    )
    Column {
        ProfileHeader(
            goBackClick = { /*TODO*/ },
            notificationClick = { /*TODO*/ },
            dropDownClick = { /*TODO*/ },
            username = user.username
        )
        ProfileInformation(
            profileImage = user.profileImage,
            posts = user.posts,
            followers = user.followers,
            following = user.following
        )
        ProfileDescription(
            name = user.name,
            description = user.description,
            modifier = Modifier.padding(start = 17.dp, top = 6.dp, bottom = 6.dp))
    }
}

@Preview(showBackground = true)
@Composable
fun ProfileScreenPreview() {
    ProfileScreen()
}
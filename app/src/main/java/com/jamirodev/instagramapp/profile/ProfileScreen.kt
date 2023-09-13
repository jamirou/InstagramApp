package com.jamirodev.instagramapp.profile

import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.GridItemSpan
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.jamirodev.instagramapp.profile.components.HighLights
import com.jamirodev.instagramapp.profile.components.ImagePosts
import com.jamirodev.instagramapp.profile.components.ProfileButtons
import com.jamirodev.instagramapp.profile.components.ProfileDescription
import com.jamirodev.instagramapp.profile.components.ProfileHeader
import com.jamirodev.instagramapp.profile.components.ProfileInformation

@Composable
fun ProfileScreen() {
    val user = User(
        username = "jam3312_",
        profileImage = "https://media1.fdncms.com/riverfronttimes/imager/u/blog/2655968/cat_with_headphones_moving_file_thumb_200x200.png?cb=1454773376.jpg",
        followers = 118,
        following = 189,
        name = "Jamiro",
        description = "Programmer 💻",
        stories = listOf(
            Highlight(
                image = "https://media.tenor.com/images/02ad71de640ef3848f0dcb39da8f7034/tenor.jpg",
                text = "dumb"
            ),
            Highlight(
                image = "https://th.bing.com/th/id/R.c2659939a32c302210abde8cbe5653e7?rik=O6Ony49PGu1t%2bw&pid=ImgRaw&r=0.jpg",
                text = "hi"
            ),
            Highlight(
                image = "https://pbs.twimg.com/profile_images/1108144123758796800/jZ_hDeJD_400x400.jpg",
                text = "I'm fat"
            ),
            Highlight(
                image = "https://th.bing.com/th/id/OIP.KSbMyKaC4zswJSqot4nbagAAAA?pid=ImgDet&rs=1.jpg",
                text = "not bad"
            ),
            Highlight(
                image = "https://i.pinimg.com/originals/90/74/1e/90741ecc4e1a95a0a45256aa0af084a8.jpg",
                text = "jealous"
            ),
            Highlight(
                image = "https://avatars.githubusercontent.com/u/2364925?v=4?s=400.jpg",
                text = "cool"
            ),
            Highlight(
                image = "https://th.bing.com/th/id/OIP.JKcK4K_T_0DpRRj0iEJK3gAAAA?pid=ImgDet&rs=1,jpg",
                text = "pretty"
            ),
            Highlight(
                image = "https://pbs.twimg.com/profile_images/1487445573502320643/rkxr4s_u_400x400.jpg",
                text = "miss"
            ),
            Highlight(
                image = "https://i.pinimg.com/originals/dd/7e/3d/dd7e3d2d2ad62d021c3fc2e3acfdb5ba.jpg",
                text = "bonn"
            )
        ),
        posts = listOf(
            "https://th.bing.com/th/id/OIP.KSbMyKaC4zswJSqot4nbagAAAA?pid=ImgDet&rs=1.jpg",
            "https://th.bing.com/th/id/OIP.KSbMyKaC4zswJSqot4nbagAAAA?pid=ImgDet&rs=1.jpg",
            "https://th.bing.com/th/id/OIP.KSbMyKaC4zswJSqot4nbagAAAA?pid=ImgDet&rs=1.jpg",
            "https://th.bing.com/th/id/OIP.KSbMyKaC4zswJSqot4nbagAAAA?pid=ImgDet&rs=1.jpg",
            "https://th.bing.com/th/id/OIP.KSbMyKaC4zswJSqot4nbagAAAA?pid=ImgDet&rs=1.jpg",
            "https://th.bing.com/th/id/OIP.KSbMyKaC4zswJSqot4nbagAAAA?pid=ImgDet&rs=1.jpg",
            "https://th.bing.com/th/id/OIP.KSbMyKaC4zswJSqot4nbagAAAA?pid=ImgDet&rs=1.jpg",
            "https://th.bing.com/th/id/OIP.KSbMyKaC4zswJSqot4nbagAAAA?pid=ImgDet&rs=1.jpg",
            "https://th.bing.com/th/id/OIP.KSbMyKaC4zswJSqot4nbagAAAA?pid=ImgDet&rs=1.jpg",
            "https://th.bing.com/th/id/OIP.KSbMyKaC4zswJSqot4nbagAAAA?pid=ImgDet&rs=1.jpg",
            "https://th.bing.com/th/id/OIP.KSbMyKaC4zswJSqot4nbagAAAA?pid=ImgDet&rs=1.jpg",
            "https://th.bing.com/th/id/OIP.KSbMyKaC4zswJSqot4nbagAAAA?pid=ImgDet&rs=1.jpg",
            "https://th.bing.com/th/id/OIP.KSbMyKaC4zswJSqot4nbagAAAA?pid=ImgDet&rs=1.jpg",
            "https://th.bing.com/th/id/OIP.KSbMyKaC4zswJSqot4nbagAAAA?pid=ImgDet&rs=1.jpg",
            "https://th.bing.com/th/id/OIP.KSbMyKaC4zswJSqot4nbagAAAA?pid=ImgDet&rs=1.jpg",
            "https://th.bing.com/th/id/OIP.KSbMyKaC4zswJSqot4nbagAAAA?pid=ImgDet&rs=1.jpg",
            "https://th.bing.com/th/id/OIP.KSbMyKaC4zswJSqot4nbagAAAA?pid=ImgDet&rs=1.jpg"
        )
    )

    val size = 3
    val context = LocalContext.current
    Column {
        ProfileHeader(
            goBackClick = { showToast(context, "Back button") },
            notificationClick = { showToast(context, "Notifications") },
            dropDownClick = { showToast(context, "DropDown") },
            username = user.username
        )
        LazyVerticalGrid(columns = GridCells.Fixed(size)) {
            item(span = {
                GridItemSpan(size)
            }) {
                ProfileInformation(
                    profileImage = user.profileImage,
                    posts = user.posts.size,
                    followers = user.followers,
                    following = user.following
                )
            }
            item(span = {
                GridItemSpan(size)
            }) {
                ProfileDescription(
                    name = user.name,
                    description = user.description,
                    modifier = Modifier.padding(start = 17.dp, top = 6.dp, bottom = 6.dp)
                )
            }
            item(span = {
                GridItemSpan(size)
            }) {
                ProfileButtons(
                    followClick = { showToast(context, "Following") },
                    messageClick = { showToast(context, "Message") },
                    modifier = Modifier.padding(start = 16.dp, end = 16.dp)
                )
            }
            item(span = {
                GridItemSpan(size)
            }) {
                HighLights(
                    stories = user.stories,
                    storyClick = { showToast(context, "HighLight") },
                    modifier = Modifier.padding(
                        start = 1.dp,
                        end = 1.dp,
                        top = 4.dp,
                        bottom = 5.dp
                    )
                )
            }
            items(user.posts) {
                ImagePosts(
                    imageUrl = it,
                    postClicked = {showToast(context, "Post")},
                    modifier = Modifier.padding(1.dp))
            }
        }
    }
}

private fun showToast(context: Context, itemClicked: String) {
    Toast.makeText(context, "$itemClicked pressed", Toast.LENGTH_SHORT).show()
}


@Preview(showBackground = true)
@Composable
fun ProfileScreenPreview() {
    ProfileScreen()
}
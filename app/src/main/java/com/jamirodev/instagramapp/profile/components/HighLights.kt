package com.jamirodev.instagramapp.profile.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.jamirodev.instagramapp.profile.Highlight


@Composable
fun HighLights(
    stories: List<Highlight>,
    modifier: Modifier = Modifier
) {
    LazyRow(modifier = modifier) {
        items(stories) {
            StoryItem(it)
            Spacer(modifier = Modifier.width(9.dp))
        }
    }
}
@Composable
private fun StoryItem(
    story: Highlight,
    modifier: Modifier = Modifier
) {
    Column(modifier = modifier, horizontalAlignment = Alignment.CenterHorizontally) {
        AsyncImage(
            model = story.image,
            contentDescription = null,
            modifier = modifier
                .size(70.dp)
                .clip(CircleShape)
        )
        Text(text = story.text)
    }
}

@Preview(showBackground = true)
@Composable
fun HighlightsPreview() {
    
}

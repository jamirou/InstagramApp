package com.jamirodev.instagramapp.profile.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.outlined.Notifications
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun ProfileHeader(
    goBackClick: () -> Unit,
    notificationClick: () -> Unit,
    dropDownClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        ProfileHeaderName(goBackClick = goBackClick)
        ProfileHeaderOptions(notificationClick = notificationClick, dropDownClick = dropDownClick)
    }
}

@Composable
private fun ProfileHeaderName(
    modifier: Modifier = Modifier,
    goBackClick: () -> Unit
) {
    Row(
        modifier = modifier,
        verticalAlignment = Alignment.CenterVertically
    ) {
        IconButton(onClick = goBackClick) {
            Icon(imageVector = Icons.Default.ArrowBack, contentDescription = "Go back")
        }
        Spacer(modifier = Modifier.width(16.dp))
        Text(text = "jam3312_", fontWeight = FontWeight.Bold)
    }
}


@Composable
private fun ProfileHeaderOptions(
    modifier: Modifier = Modifier,
    notificationClick: () -> Unit,
    dropDownClick: () -> Unit
) {
    Row(modifier = modifier) {
        IconButton(onClick = notificationClick) {
            Icon(
                imageVector = Icons.Outlined.Notifications,
                contentDescription = "Notifications"
            )
        }
        IconButton(onClick = dropDownClick) {
            Icon(imageVector = Icons.Default.MoreVert, contentDescription = "Dropdown")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ProfileHeaderPreview() {
    ProfileHeader({}, {}, {})
}
package com.jamirodev.instagramapp.profile.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun ProfileButtons(
    modifier: Modifier = Modifier
) {
    Row(modifier = modifier.fillMaxWidth()) {
        ButtonProfile(onClick = { /*TODO*/ }, text = "Following", Modifier.weight(1f))
        Spacer(modifier = Modifier.width(8.dp))
        ButtonProfile(onClick = { /*TODO*/ }, text = "Message", Modifier.weight(1f))
    }
}

@Composable
private fun ButtonProfile(
    onClick: () -> Unit,
    text: String,
    modifier: Modifier = Modifier
) {
    Button(
        onClick = onClick,
        colors = ButtonDefaults.buttonColors(Color.LightGray),
        modifier = modifier
    ) {
        Text(text = text, color = Color.Black)
    }
}


@Preview(showBackground = true)
@Composable
fun ProfileButtonsPreview() {
    ProfileButtons()
}
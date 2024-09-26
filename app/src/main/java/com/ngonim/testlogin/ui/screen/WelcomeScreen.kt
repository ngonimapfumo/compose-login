package com.ngonim.testlogin.ui.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.ngonim.testlogin.R

@Composable
fun WelcomeScreen(modifier: Modifier = Modifier) {

    Column(
        modifier
            .fillMaxSize()
            .systemBarsPadding(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.login),
            contentDescription = "welcome",
            modifier = Modifier.size(300.dp)
        )

        Text(text = "Hey")
        Text(text = "You")
        Text(text = "Lets create things with Compose")



    }

}
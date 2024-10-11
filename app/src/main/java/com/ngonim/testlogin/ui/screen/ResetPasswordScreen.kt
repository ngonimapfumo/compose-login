package com.ngonim.testlogin.ui.screen

import androidx.activity.ComponentActivity
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ngonim.testlogin.ui.components.SmallTopAppBar
import com.ngonim.testlogin.ui.components.TextInputLayout

@Composable
fun ResetPasswordScreen(activity: ComponentActivity, modifier: Modifier) {

    Column(modifier= modifier.fillMaxWidth().fillMaxSize()) {

        SmallTopAppBar(
            onClicked = { activity.onBackPressedDispatcher.onBackPressed() },
            text = "Reset Password", textStyle = TextStyle(
                fontSize = 24.sp,
                color = Color.White
            ), backButtonRequired = true
        )

        TextInputLayout(
            label = "Email",
            modifier = modifier.padding(5.dp),
            maxLines = 1,
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email)
        )
    }

}
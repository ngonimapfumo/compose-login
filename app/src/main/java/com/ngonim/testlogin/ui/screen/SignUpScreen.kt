package com.ngonim.testlogin.ui.screen

import android.content.Context
import androidx.activity.ComponentActivity
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ngonim.testlogin.R
import com.ngonim.testlogin.SignUp
import com.ngonim.testlogin.ui.components.SmallTopAppBar
import com.ngonim.testlogin.ui.components.TextInputLayout
import com.ngonim.testlogin.ui.theme.TestLoginTheme
import androidx.compose.ui.tooling.preview.Preview as Preview1

@Composable
fun SignUpScreen(activity: ComponentActivity?) {
    Column(
        Modifier
            .fillMaxSize()
            .systemBarsPadding(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        SmallTopAppBar(
            onClicked = { activity!!.onBackPressedDispatcher.onBackPressed() },
            text = "Sign Up",
            textStyle = TextStyle(fontSize = 24.sp),
            backButtonRequired = true
        )

        TextInputLayout(
            label = "Name",
            modifier = Modifier,
            maxLines = 1,
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
            visualTransformation = VisualTransformation.None,
            needsTrailingIcon = false,
            icon = null
        )
        TextInputLayout(
            label = "Email",
            modifier = Modifier,
            maxLines = 1,
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
            visualTransformation = VisualTransformation.None,
            needsTrailingIcon = false,
            icon = null
        )

        TextInputLayout(
            label = "Password",
            modifier = Modifier,
            maxLines = 1,
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
            visualTransformation = VisualTransformation.None,
            needsTrailingIcon = true,
            icon = R.drawable.baseline_visibility_24
        )

        TextInputLayout(
            label = "Confirm Password",
            modifier = Modifier,
            maxLines = 1,
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
            visualTransformation = VisualTransformation.None,
            needsTrailingIcon = true,
            icon = R.drawable.baseline_visibility_24
        )
    }


}

@Preview1(showBackground = true)
@Composable
fun Preview2() {

    SignUpScreen(null)


}
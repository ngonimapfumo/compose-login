package com.ngonim.testlogin.ui.screen

import android.content.Intent
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.foundation.text.ClickableText
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.ButtonColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ngonim.testlogin.R
import com.ngonim.testlogin.ResetPassword
import com.ngonim.testlogin.ui.components.ActionButton
import com.ngonim.testlogin.ui.components.SmallTopAppBar
import com.ngonim.testlogin.ui.components.TextInputLayout
import com.ngonim.testlogin.ui.theme.Indigo600
import androidx.compose.ui.tooling.preview.Preview as Preview1

@Composable
fun SignUpScreen(activity: ComponentActivity?, modifier: Modifier) {
    Column(
        modifier
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
            modifier = modifier,
            maxLines = 1,
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
            visualTransformation = VisualTransformation.None,
            needsTrailingIcon = false,
            icon = null
        )
        TextInputLayout(
            label = "Email",
            modifier = modifier,
            maxLines = 1,
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
            visualTransformation = VisualTransformation.None,
            needsTrailingIcon = false,
            icon = null
        )

        TextInputLayout(
            label = "Contact no.",
            modifier = modifier,
            maxLines = 1,
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Phone),
            visualTransformation = VisualTransformation.None,
            needsTrailingIcon = false,
            icon = null
        )

        TextInputLayout(
            label = "Password",
            modifier = modifier,
            maxLines = 1,
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
            visualTransformation = VisualTransformation.None,
            needsTrailingIcon = true,
            icon = R.drawable.baseline_visibility_24
        )

        Spacer(modifier.height(8.dp))
        ActionButton(
            text = "Register",
            isNavigationArrowVisible = false,
            onClicked = {
                Toast.makeText(
                    activity, "Register",
                    Toast.LENGTH_SHORT
                ).show()
            },
            colors = ButtonColors(
                containerColor = Indigo600,
                contentColor = Color.White,
                disabledContentColor = Color.Gray,
                disabledContainerColor = Color.Gray
            ),
            shadowColor = Color.Blue
        )

        ClickableText(
            text = AnnotatedString("Already have an account? Sign In"),
            style = TextStyle(color = Color.Blue),
            onClick = {

            },
            modifier = modifier.padding(10.dp),
        )


    }


}

@Preview1(showBackground = true)
@Composable
fun Preview2() {

    SignUpScreen(null, Modifier)


}
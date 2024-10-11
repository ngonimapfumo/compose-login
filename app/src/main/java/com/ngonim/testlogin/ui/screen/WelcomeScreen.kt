package com.ngonim.testlogin.ui.screen

import android.content.Context
import android.content.Intent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.foundation.text.ClickableText
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ngonim.testlogin.R
import com.ngonim.testlogin.ResetPassword
import com.ngonim.testlogin.SignUp
import com.ngonim.testlogin.ui.components.ActionButton
import com.ngonim.testlogin.ui.components.SmallTopAppBar
import com.ngonim.testlogin.ui.components.TextInputLayout
import com.ngonim.testlogin.ui.theme.Pink40

@Composable
fun WelcomeScreen(
    context: Context?,
    modifier: Modifier = Modifier
) {
    Column(
        modifier
            .fillMaxSize()
            .systemBarsPadding(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        SmallTopAppBar(
            onClicked = {},
            "Login", TextStyle(
                color = Color.White,
                fontSize = 24.sp
            ), false
        )
        Spacer(modifier.height(8.dp))
        Image(
            painter = painterResource(id = R.drawable.key),
            contentDescription = "welcome",
            modifier = modifier.size(300.dp)
        )

        Text(text = "Welcome to Bla Bla")
        Text(text = "Please Sign in to proceed")
        TextInputLayout(
            "username",
            modifier = modifier,
            1,
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
            VisualTransformation.None, false, null
        )
        Spacer(modifier.height(8.dp))
        TextInputLayout(
            "password",
            modifier = modifier,
            1,
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            PasswordVisualTransformation(), true, R.drawable.baseline_visibility_24
        )
        Spacer(modifier.height(8.dp))
        Column(modifier.padding(30.dp)) {
            ActionButton(
                text = "Sign In",
                isNavigationArrowVisible = false,
                onClicked = {


                },
                colors = ButtonColors(
                    containerColor = Pink40,
                    contentColor = Color.White,
                    disabledContentColor = Color.Gray,
                    disabledContainerColor = Color.Gray
                ),
                shadowColor = Color.Blue
            )
            ActionButton(
                text = "Sign Up",
                isNavigationArrowVisible = false,
                onClicked = {
                    context!!.startActivity(Intent(context, SignUp::class.java))

                },
                colors = ButtonColors(
                    containerColor = Pink40,
                    contentColor = Color.White,
                    disabledContentColor = Color.Gray,
                    disabledContainerColor = Color.Gray
                ),
                shadowColor = Color.Blue
            )
        }
        ClickableText(
            text = AnnotatedString("Forgot your password?"),
            style = TextStyle(color = Color.Blue),
            onClick = {
                context!!.startActivity(Intent(context, ResetPassword::class.java))
            },
            modifier = modifier.padding(10.dp),
        )


    }
}

@Preview(showBackground = true)
@Composable
fun Preview() {
    WelcomeScreen(null, Modifier)
}


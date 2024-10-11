package com.ngonim.testlogin.ui.screen

import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ngonim.testlogin.R

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
            "Login", TextStyle(
                color = Color.White,
                fontSize = 24.sp
            ), false
        )
        Spacer(Modifier.height(8.dp))
        Image(
            painter = painterResource(id = R.drawable.login),
            contentDescription = "welcome",
            modifier = Modifier.size(300.dp)
        )

        Text(text = "Hey")
        Text(text = "You")
        Text(text = "Lets create things with Compose")
        TextInputLayout(
            "username",
            modifier = Modifier,
            1,
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
        )
        Spacer(Modifier.height(8.dp))
        TextInputLayout(
            "password",
            modifier = Modifier,
            1,
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password)
        )
        Spacer(Modifier.height(8.dp))
        ActionButton(
            text = "Login",
            isNavigationArrowVisible = false,
            onClicked = {


            },
            colors = ButtonColors(
                containerColor = Color(context!!.resources.getColor(R.color.purple_200, null)),
                contentColor = Color.White,
                disabledContentColor = Color.Gray,
                disabledContainerColor = Color.Gray
            ),
            shadowColor = Color.Blue
        )
        ClickableText(
            text = AnnotatedString("Forgot your password?"),
            style = TextStyle(color = Color.Blue),
            onClick = {
                Toast.makeText(context, "Button click", Toast.LENGTH_SHORT).show()
            },
            modifier = Modifier.padding(10.dp),
        )


    }
}

@Preview
@Composable
fun Preview() {
    WelcomeScreen(context = null, modifier = Modifier)
}


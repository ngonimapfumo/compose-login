package com.ngonim.testlogin.ui.screen

import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.ClickableText
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
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
        SmallTopAppBarExample("Login")
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
            modifier = Modifier,
            1,
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
        )
        Spacer(Modifier.height(8.dp))
        TextInputLayout(
            modifier = Modifier,
            1,
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password)
        )
        Spacer(Modifier.height(8.dp))
        ActionButton(
            text = "Login",
            isNavigationArrowVisible = true,
            onClicked = { },
            colors = ButtonColors(
                containerColor = Color(0xFFCA1210),
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
            modifier = Modifier,
        )


    }
}


@Composable
fun TextInputLayout(
    modifier: Modifier,
    maxLines: Int,
    keyboardOptions: KeyboardOptions
) {
    var value: String by remember {
        mutableStateOf("")
    }

    OutlinedTextField(
        modifier = modifier.width(320.dp),
        value = value,
        maxLines = maxLines,
        onValueChange = { value = it },
        keyboardOptions = KeyboardOptions(
            autoCorrect = false,
            keyboardType = keyboardOptions.keyboardType

        )
    )

}


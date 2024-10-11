package com.ngonim.testlogin

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.ngonim.testlogin.ui.screen.ResetPasswordScreen
import com.ngonim.testlogin.ui.theme.TestLoginTheme

class ResetPassword : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TestLoginTheme {
                ResetPasswordScreen(this,Modifier)

            }
        }
    }
}

@Preview
@Composable
fun ResetPreview() {
    TestLoginTheme {
       // ResetPassword()
    }
}

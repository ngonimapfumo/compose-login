package com.ngonim.testlogin.ui.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp

@Composable
fun TextInputLayout(
    label: String,
    textStyle: TextStyle?,
    modifier: Modifier,
    maxLines: Int,
    keyboardOptions: KeyboardOptions,
    makeTextVisible: Boolean?,
    needsTrailingIcon: Boolean,
    icon: Int?
) {
    var value: String by remember {
        mutableStateOf("")
    }

    var passwordVisibility: Boolean by remember { mutableStateOf(makeTextVisible!!) }

    OutlinedTextField(
        visualTransformation = if (passwordVisibility) {
            VisualTransformation.None
        } else {
            PasswordVisualTransformation()
        },
        trailingIcon = {
            if (needsTrailingIcon)
                Icon(painter = painterResource(icon!!),
                    contentDescription = "trailing icon",
                    modifier.clickable {
                        passwordVisibility = !passwordVisibility
                    })
        },
        modifier = modifier.width(320.dp),
        value = value,
        maxLines = maxLines,
        onValueChange = { value = it },
        keyboardOptions = KeyboardOptions(
            autoCorrect = false,
            keyboardType = keyboardOptions.keyboardType

        ), label = { Text(text = label) },
        textStyle = textStyle!!
    )
}
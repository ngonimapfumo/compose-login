package com.ngonim.testlogin.ui.components

import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun TextInputLayout(
    label: String,
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

        ), label = { Text(text = label) }
    )

}
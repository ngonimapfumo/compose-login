package com.ngonim.testlogin.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ngonim.testlogin.R

@Composable
fun ActionButton(
    modifier: Modifier = Modifier,
    text: String,
    isNavigationArrowVisible: Boolean,
    onClicked: () -> Unit,
    colors: ButtonColors,
    shadowColor: Color,

    ) {

    Button(
        modifier = modifier.width(200.dp),
        onClick = onClicked,
        colors = colors
    )
    {
        Row(
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = text,
                style = MaterialTheme.typography.bodyLarge
            )
            if (isNavigationArrowVisible) {
                Icon(
                    painter = painterResource(id = R.drawable.baseline_arrow_forward_24),
                    contentDescription = null,
                    modifier.size(24.dp)
                )
            }
        }

    }
}


@Preview
@Composable
private fun ActionButtonPreview() {/*
    TestLoginTheme {
        ActionButton(
            text = "Boohoo",
            isNavigationArrowVisible = true,
            onClicked = { *//*TODO*//* },
            colors = ButtonDefaults.buttonColors(
                contentColor = Color.White,
                containerColor = Color.Green
            ),
            shadowColor = Color.Green
        )
    }*/
}


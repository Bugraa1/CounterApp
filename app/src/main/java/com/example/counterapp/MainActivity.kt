package com.example.counterapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Refresh
import androidx.compose.material3.Button
import androidx.compose.material3.ExtendedFloatingActionButton
import androidx.compose.material3.FilledIconButton
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.FloatingActionButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.counterapp.ui.theme.CounterAppTheme
import com.example.counterapp.ui.theme.backGround
import com.example.counterapp.ui.theme.countGreen
import com.example.counterapp.ui.theme.countRed

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CounterAppTheme {
                counterPage()

            }
        }
    }
}

@Composable
fun counterPage() {
    var count by remember {
        mutableStateOf(0)
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(backGround),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,

        ) {
        Text(
            text = count.toString(),
            fontSize = 50.sp,
            fontFamily = FontFamily.Cursive
        )

        Spacer(modifier = Modifier.height(50.dp))

        Row(
            modifier = Modifier.padding(16.dp)
        ) {
            FloatingActionButton(
                onClick = {
                    count = count + 1
                },
                modifier = Modifier
                    .weight(0.5f)
                    .padding(8.dp),
                containerColor = countGreen,

                ) {
                Text(
                    text = "Arttır",
                    textAlign = TextAlign.Center
                )

            }
            FloatingActionButton(
                onClick = { count = count - 1 },
                modifier = Modifier
                    .weight(0.5f)
                    .padding(8.dp),
                containerColor = countRed


            ) {
                Text(
                    text = "Azalt",
                    textAlign = TextAlign.Center
                )

            }
        }
        IconButton(
            onClick = { count = 0 },
            modifier = Modifier
                .padding(12.dp)

            ) {
            Icon(
                imageVector = Icons.Filled.Refresh,
                contentDescription = "",
            )

        }


    }


}
    





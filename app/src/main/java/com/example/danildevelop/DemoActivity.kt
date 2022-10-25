package com.example.danildevelop

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
class DemoActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val hijauMuda = Color(0xff123f12)
        val putih = 0xffff0000
        setContent{
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color.Black)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.ktp_raihan_maharaja),
                    contentDescription = "")
                Surface(color = Color.Yellow, modifier = Modifier.fillMaxWidth()) {
                    Text(
                        text = "Namaku Danil Pramudya",
                        fontSize = 18.sp,
                        modifier = Modifier.padding(50.dp, 10.dp, 100.dp, 0.dp),
                        color = hijauMuda,
                        textAlign = TextAlign.Center
                    )
                }
                Surface(color = Color.Blue, modifier = Modifier.fillMaxWidth()) {
                    Text(
                        text = "Butuh Duit",
                        fontSize = 24.sp,
                        modifier = Modifier.padding(50.dp, 10.dp, 10.dp, 10.dp),
                        color = Color(putih)
                    )
                }
            }
        }
    }
}
// I do not know whole lot of stuff about Android Development yet like Gradle and Stuff but I would try to provide whole of the Stuff that You will need to runt this app 
// on your own System.

package com.example.portfolio

import android.graphics.Paint.Align
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.portfolio.ui.theme.PortfolioTheme
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.asImageBitmap
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFrom
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Mail
import androidx.compose.material.icons.materialIcon
import androidx.compose.material3.Icon
import androidx.compose.runtime.ComposableOpenTarget
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.asImageBitmap
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

import androidx.compose.material.icons.filled.Share
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.colorResource


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PortfolioTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Portfolio()
                }
            }
        }
    }
}

@Composable
fun Logo()
{
    val logo= painterResource(R.drawable.android_logo)

    Column(
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.background(Color(0xFF3ddc84))
    ) {
        Image(painter = logo, contentDescription = null)
        Text(text="Nabeel Akhter", fontSize = 40.sp, fontStyle = FontStyle.Italic, textAlign = TextAlign.Center,color=Color.Black)
        Text(text="Beginner Android Developer", fontSize = 15.sp, fontWeight = FontWeight.Bold, color = Color(0xFF556B2F))
    }

}

@Composable
fun Call_Detail()
{
    Row(
        verticalAlignment = Alignment.Bottom,
        horizontalArrangement = Arrangement.Center,


    ) {
        Icon(imageVector = Icons.Default.Call, contentDescription =null, tint = Color.Black )
        Text(text="+91 9006520871", fontSize = 15.sp, color = Color.Black, modifier = Modifier.padding(horizontal = 10.dp))

    }

}

@Composable
fun Linkedin()
{
    Row(
        verticalAlignment = Alignment.Bottom,
        horizontalArrangement = Arrangement.Center,

    ) {
        Icon(imageVector=Icons.Default.Share,
            contentDescription =null,
            tint=Color.Black
        )
        Text(
            text="Linkedin :nabeel-akhter-367573246",
            fontSize =15.sp ,
            modifier= Modifier
                .padding(horizontal = 10.dp)
                .padding(top= 10.dp),
            color = Color.Black
        )

    }

}

@Composable
fun Mail()
{
    Row (
        verticalAlignment = Alignment.Bottom,
        horizontalArrangement = Arrangement.Center,
        )
    {
        Icon(imageVector = Icons.Default.Mail, contentDescription = null,tint=Color.Black)
        Text(text = "akhternabeel1411@gmail.com", fontSize = 15.sp, color = Color.Black,modifier=Modifier.padding(horizontal = 10.dp).padding(top = 10.dp))
    }
}


@Composable
fun Portfolio()
{
    Column (modifier = Modifier.background(Color(0xFF3ddc84))){
        Logo()

        Box( contentAlignment = Alignment.CenterStart) {
            Column(
                verticalArrangement = Arrangement.Bottom,
                horizontalAlignment = Alignment.Start,
                modifier = Modifier.padding(bottom = 150.dp),


            ) {
                Spacer(modifier = Modifier.weight(0.5f))
                Call_Detail()
                Linkedin()
                Mail()

            }
        }




    }

}

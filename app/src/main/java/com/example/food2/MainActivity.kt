package com.example.food2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.food2.ui.theme.Food2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Food2Theme {
                Example()
            }
        }
    }
}
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Example(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.blanc),
            contentDescription = "",
            modifier = modifier
                .fillMaxWidth(),
            contentScale = ContentScale.Crop

        )}
        Text(
            modifier = Modifier.padding(start = 30.dp, end = 50.dp,top=90.dp),

            text = "Sign Up",
            style = TextStyle(),
            fontSize = 40.sp,
            fontStyle = FontStyle.Normal,
            fontWeight = FontWeight.Bold,
            color = Color.DarkGray


        )
        Spacer(modifier = modifier.padding(10.dp))
        Row(
            modifier = modifier.fillMaxWidth()
            .padding(start=0.dp,end=90.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        )
        {
            Spacer(modifier = modifier.height(60.dp))
            Text(
                modifier = Modifier.padding(top=170.dp),
                text = "Already have an account? ",
                color = Color.DarkGray,
                fontWeight = FontWeight.Bold,
                fontSize = 18.sp,
            )}
            Text(
                modifier = Modifier.padding(start=260.dp,top=170.dp),
                text = " Login ",
                color = Color(0xFFD38C25),
                fontWeight = FontWeight.Bold,
                fontSize = 18.sp,

            )
    Spacer(modifier = modifier.height(30.dp))
          Text(
        modifier = Modifier.padding(start = 30.dp, end = 300.dp,top=240.dp),

        text = "Name",
        style = TextStyle(),
        fontSize = 20.sp,
        fontStyle = FontStyle.Normal,
        fontWeight = FontWeight.Bold,
        color= Color.DarkGray
          )
    Spacer(modifier = modifier.height(30.dp))
    OutlinedTextField(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 20.dp, end = 20.dp,top=270.dp)
        ,
        value = "",
        onValueChange = {

        },
        label = {
            Text(text = "Jana Doe")
        }, shape = RoundedCornerShape(0.dp),
        keyboardOptions = KeyboardOptions(
            keyboardType = KeyboardType.Text,
        ),
        maxLines = 1,
        singleLine = true,
        colors = TextFieldDefaults.outlinedTextFieldColors(
            focusedBorderColor =  Color(0xFF21919C),
            unfocusedBorderColor =  Color(0xFF21919C),
            containerColor = Color.Transparent
        ))
    Spacer(modifier = modifier.height(40.dp))
    Text(
        modifier = Modifier.padding(start = 30.dp, end = 300.dp,top=335.dp),

        text = "Email",
        style = TextStyle(),
        fontSize = 20.sp,
        fontStyle = FontStyle.Normal,
        fontWeight = FontWeight.Bold,
        color= Color.DarkGray

    )
    Spacer(modifier = modifier.height(30.dp))
    OutlinedTextField(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 20.dp, end = 20.dp,top= 360.dp, bottom = 20.dp)
        ,
        value = "",
        onValueChange = {

        },
        label = {
            Text(text = "Enter your Email")
        }, shape = RoundedCornerShape(0.dp),
        keyboardOptions = KeyboardOptions(
            keyboardType = KeyboardType.Text,
        ),
        maxLines = 1,
        singleLine = true,
        colors = TextFieldDefaults.outlinedTextFieldColors(
            focusedBorderColor =  Color(0xFF21919C),
            unfocusedBorderColor =  Color(0xFF21919C),
            containerColor = Color.Transparent
        )
    )
    Spacer(modifier = modifier.height(40.dp))
                     Text(
        modifier = Modifier.padding(start = 30.dp, end = 200.dp,top=430.dp),

        text = "Password",
        style = TextStyle(),
        fontSize = 20.sp,
        fontStyle = FontStyle.Normal,
        fontWeight = FontWeight.Bold,
        color= Color.DarkGray
                         )
          Spacer(modifier = modifier.height(30.dp))
    OutlinedTextField(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 20.dp, end = 20.dp,top=450.dp)
        ,
        value = "",
        onValueChange = {

        },
        label = {
            Text(text = "Enter your Password")
        }, shape = RoundedCornerShape(0.dp),
        keyboardOptions = KeyboardOptions(
            keyboardType = KeyboardType.Text,
        ),

        maxLines = 1,
        singleLine = true,
        trailingIcon = {
            Icon(
                painter = painterResource(id = R.drawable.baseline_disabled_visible_24),
                contentDescription = ""
            )
        },
        colors = TextFieldDefaults.outlinedTextFieldColors(
            focusedBorderColor =  Color(0xFF21919C),
            unfocusedBorderColor =  Color(0xFF21919C),
            containerColor = Color.Transparent
        )

    )
    Button(
        onClick = {

        },
        shape = RoundedCornerShape(50),
        modifier = Modifier
            .padding(start = 40.dp, end = 40.dp,top=600.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = Color(0xFFE0802C)

        ),

        ) {
        Text(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
            text = "Sign Up",
            textAlign = TextAlign.Center,
        )

    }
    Row(
        modifier = modifier.fillMaxWidth()
        .padding( top=670.dp,
            start=20.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    )
    {
        Text(

            text = "By signing up you agree to our",
            color = Color.Gray,
            fontWeight = FontWeight.Bold,
            fontSize = 14.sp,
        )
        Text(
            text = " Terms of Service ",
            color = Color(0xFF3F8BC7),
            fontWeight = FontWeight.Bold,
            fontSize = 14.sp,
        )}
        Row(
            modifier = modifier.fillMaxWidth()
                .padding( top=685.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ){
        Text(

            text = "and",
            color = Color.Gray,
            fontWeight = FontWeight.Bold,
            fontSize =14.sp,
        )
        Text(

            text = " Privacy policy ",
            color = Color(0xFF3F8BC7),
            fontWeight = FontWeight.Bold,
            fontSize = 14.sp,
        )}
}















@Preview
@Composable
fun Food2Preview() {
    Food2Theme {
        Example()
    }
}
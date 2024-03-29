package com.blannon_network.composearticle

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.blannon_network.composearticle.ui.theme.ComposeArticleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeArticleTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    BackGroundImage()
                }
            }
        }
    }
}

@Composable
fun ArticleText(title: String, text_one: String, text_two: String){

    Column(
        modifier = Modifier,
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    )
    {
        Text(
            text = title,
            fontSize = 24.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .padding(16.dp,)
            )
        Text(
            text = text_one,
            textAlign = TextAlign.Justify,
            modifier = Modifier
                .padding(16.dp,)
        )
        Text(
            text = text_two,
            textAlign = TextAlign.Justify,
            modifier = Modifier
                .padding(16.dp,)
        )

    }

}

@Composable
fun BackGroundImage(){
    val image = painterResource(R.drawable.bg_compose_background)

    Box(
        modifier = Modifier,

    ) {
        Image(
            painter = image,
            contentDescription = null
        )
    }
    ArticleText(
        title = stringResource(R.string.title),
        text_one = stringResource(R.string.text_one),
        text_two = stringResource(R.string.text_two) )

}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun BackGroundImagePreview(){
    ComposeArticleTheme {
        BackGroundImage()
    }
}

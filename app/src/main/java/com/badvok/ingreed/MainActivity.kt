package com.badvok.ingreed

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel
import com.badvok.ingreed.ui.shopping.ShoppingScreen
import com.badvok.ingreed.ui.shopping.ShoppingViewModel
import com.badvok.ingreed.ui.theme.IngreedTheme
import kotlinx.coroutines.flow.collect
import org.koin.android.ext.android.inject

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            IngreedTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val viewModel: ShoppingViewModel by inject()
                    LaunchedEffect(Unit) {
                        viewModel.init()
                    }
                    val state = viewModel.observeState().collectAsState().value
                    ShoppingScreen(state)
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    IngreedTheme {
        Greeting("Android")
    }
}
package com.badvok.ingreed

import android.os.Bundle
import android.util.Log
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
import com.badvok.ingreed.base.appModule
import com.badvok.ingreed.ui.screens.recipe.RecipeScreen
import com.badvok.ingreed.ui.screens.recipe.RecipeViewModel
import com.badvok.ingreed.ui.screens.shopping.ShoppingScreen
import com.badvok.ingreed.ui.screens.shopping.ShoppingViewModel
import com.badvok.ingreed.ui.theme.ShopcipeTheme
import org.koin.compose.KoinApplication
import org.koin.compose.koinInject

//import org.koin.java.KoinJavaComponent.get

//import org.koin.java.KoinJavaComponent.inject

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d("pxx", "create")
        super.onCreate(savedInstanceState)
        setContent {
            App{
                ShopcipeTheme {
                    // A surface container using the 'background' color from the theme
                    Surface(
                        modifier = Modifier.fillMaxSize(),
                        color = MaterialTheme.colorScheme.background
                    ) {
//                        val myService = get<ShoppingViewModel>()
//                        val recipeViewModel = koinInject<RecipeViewModel>()
//                        val viewModel: ShoppingViewModel by inject()
//                        Log.d("pxx", "RVM: $recipeViewModel")
//                        Log.d("pxx", "SVM: $viewModel")
//                        LaunchedEffect(Unit) {
//                            viewModel.init()
//                        }
//                        val state = viewModel.observeState().collectAsState().value
//                        ShoppingScreen(state)
                        SetupShoppingScreen()
                        SetupRecipeScreen()
                    }
                }
            }

        }
    }
}

@Composable
fun App(content: @Composable () -> Unit) {
    KoinApplication(application = {
        // Koin configuration here
        // TODO we add the appModules twice, once in application class an once here.
        modules(appModule)
    }) {
        content()
    }
}

@Composable
fun SetupShoppingScreen(viewModel: ShoppingViewModel = koinInject()){
    LaunchedEffect(Unit) {
        viewModel.init()
    }
    val state = viewModel.observeState().collectAsState().value
    ShoppingScreen(state)
}

@Composable
fun SetupRecipeScreen(viewModel: RecipeViewModel = koinInject()){
    LaunchedEffect(Unit) {
        viewModel.init()
    }
    val state = viewModel.observeState().collectAsState().value
    RecipeScreen(state)
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ShopcipeTheme {
        Greeting("Android")
    }
}
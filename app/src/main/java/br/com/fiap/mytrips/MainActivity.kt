package br.com.fiap.mytrips

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import br.com.fiap.mytrips.screens.LoginScreen
import br.com.fiap.mytrips.screens.SignupScreen
import br.com.fiap.mytrips.ui.theme.MyTripsTheme

class MainActivity : ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContent {
      MyTripsTheme {
        // A surface container using the 'background' color from the theme
        Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
          val navController = rememberNavController()
          NavHost(
            navController = navController,
            startDestination = "login"
          ){
            composable(route = "login") { LoginScreen(navController) }
            composable(route = "cadastro") { SignupScreen() }
          }
        }
      }
    }
  }
}

@Preview(showSystemUi = true)
@Composable
fun LoginScreenPreview() {
  Surface(
    modifier = Modifier.fillMaxSize()
  ) {
    //LoginScreen()
  }

}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
  Text(
    text = "Hello $name!",
    modifier = modifier
  )
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
  MyTripsTheme {
    Greeting("Android")
  }
}
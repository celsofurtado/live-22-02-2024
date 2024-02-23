package br.com.fiap.mytrips.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.ArrowForward
import androidx.compose.material.icons.outlined.Email
import androidx.compose.material.icons.outlined.Search
import androidx.compose.material.icons.outlined.ThumbUp
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun LoginScreen(navController: NavController) {
  Column(
    //modifier = Modifier.background(Color.Magenta),
    verticalArrangement = Arrangement.SpaceBetween
  ) {
    Card(
      modifier = Modifier
        .size(width = 120.dp, height = 40.dp)
        .align(Alignment.End)
        .clickable { },
      shape = RoundedCornerShape(
        bottomStart = 16.dp
      )
    ) {

    }

    Column(
      modifier = Modifier.padding(32.dp)
    ) {
      Text(
        text = "Login",
        fontSize = 48.sp,
        fontWeight = FontWeight.Bold,
        color = Color(0xFF2F5821)
      )
      Text(text = "Please sign in to continue")
    }

    Column(
      modifier = Modifier
        .fillMaxWidth()
        .padding(end = 32.dp, start = 32.dp),
      horizontalAlignment = Alignment.CenterHorizontally
    ) {
      OutlinedTextField(
        value = "",
        onValueChange = {},
        modifier = Modifier
          .fillMaxWidth()
          .padding(bottom = 16.dp),
        label = {
          Text(text = "E-mail")
        },
        leadingIcon = {
          Icon(imageVector = Icons.Outlined.Email, contentDescription = "")
        }
      )
      OutlinedTextField(
        value = "",
        onValueChange = {},
        modifier = Modifier
          .fillMaxWidth()
          .padding(bottom = 32.dp),
        label = {
          Text(text = "Password")
        },
        trailingIcon = {
          Icon(imageVector = Icons.Outlined.Search, contentDescription = "")
        },
        leadingIcon = {
          Icon(imageVector = Icons.Outlined.ThumbUp, contentDescription = "")
        }
      )
      Button(
        onClick = {
          navController.navigate("cadastro")
        },
        modifier = Modifier.align(Alignment.End)
      ) {
        Text(text = "SING IN")
        Icon(
          imageVector = Icons.Outlined
            .ArrowForward, contentDescription = ""
        )
      }
      Row(
        modifier = Modifier
          .align(Alignment.End)
      ) {
        Text(
          text = "Don't have an account?",
          modifier = Modifier.padding(end = 4.dp)
        )
        Text(
          text = "Sig up",
          modifier = Modifier.clickable { }
        )
      }
    }

    Card(
      modifier = Modifier
        .size(width = 120.dp, height = 40.dp)
        .align(Alignment.Start),
      shape = RoundedCornerShape(
        topEnd = 16.dp
      )
    ) {

    }
  }
}
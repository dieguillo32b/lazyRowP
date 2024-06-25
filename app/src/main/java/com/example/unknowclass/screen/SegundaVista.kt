package com.example.unknowclass.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.unknowclass.R

@Composable
fun LazyContent(navigation: NavHostController){
    Box(modifier = Modifier.fillMaxSize()){
        Row(modifier = Modifier.fillMaxSize()) {
            SimpleLazyColumn()
        }
    }
}

@Composable
fun BiggerLazyRow(){
    val items = listOf(R.drawable.agricultura, R.drawable.agricultura2, R.drawable.agricultura3, R.drawable.agricultura, R.drawable.agricultura2, R.drawable.agricultura3)
    
    LazyRow(modifier = Modifier
        .fillMaxWidth()
        .padding(20.dp).height(150.dp)){
        items(items){item ->
            Image(painter = painterResource(id = item), contentDescription = "")
        }
    }
}

@Composable
fun SimpleLazyRow(){
    val items = listOf(R.drawable.agricultura, R.drawable.agricultura2, R.drawable.agricultura3, R.drawable.agricultura, R.drawable.agricultura2, R.drawable.agricultura3, R.drawable.agricultura, R.drawable.agricultura2, R.drawable.agricultura3, R.drawable.agricultura, R.drawable.agricultura2, R.drawable.agricultura3, R.drawable.agricultura, R.drawable.agricultura2, R.drawable.agricultura3, R.drawable.agricultura, R.drawable.agricultura2, R.drawable.agricultura3, R.drawable.agricultura, R.drawable.agricultura2, R.drawable.agricultura3, R.drawable.agricultura, R.drawable.agricultura2, R.drawable.agricultura3)

    LazyRow(modifier = Modifier
        .padding(10.dp)
        .height(30.dp)
        .fillMaxWidth()){
        items(items){item ->
            Image(painter = painterResource(id = item), contentDescription = "")
        }
    }
}

@Composable
fun SimpleLazyColumn(){
    val items = listOf("En Granjas Peter, nos enorgullece ofrecerte una selección de productos 100% colombianos, directamente desde nuestras tierras a tu mesa. Huevos frescos, plátanos maduros y más, todos cultivados con amor y cuidado, sin añadidos artificiales. ¡Con nosotros, no dejes de disfrutar lo mejor de la naturaleza colombiana!\n¿Buscas opciones saludables y auténticas? En Granjas Peter, te ofrecemos una amplia variedad de productos naturales colombianos que deleitarán tu paladar y alimentarán tu cuerpo. Desde la tierra a tu hogar, cada producto refleja nuestra pasión por la calidad y el respeto por el medio ambiente.\nSiente el vínculo con la naturaleza en cada bocado. En Granjas Peter, cultivamos nuestros productos con métodos tradicionales y respetuosos con el medio ambiente. Con cada compra, apoyas a agricultores locales y contribuyes a la preservación de nuestra herencia colombiana.\n¿Quieres darle a tu familia lo mejor de la tierra? Descubre nuestra gama de productos naturales colombianos, cultivados con cuidado y amor por generaciones de agricultores. Desde la siembra hasta la cosecha, cada paso se realiza con dedicación para ofrecerte lo mejor de nuestra tierra.")

    LazyColumn(modifier = Modifier
        .padding(10.dp)
        .fillMaxHeight()){
        items(items){item ->
            SimpleLazyRow()
            BiggerLazyRow()
            Text(text = item,
                modifier = Modifier.padding(20.dp),
                textAlign = TextAlign.Justify,
                fontSize = 18.sp)

        }
    }
}

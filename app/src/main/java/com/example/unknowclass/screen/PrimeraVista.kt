package com.example.unknowclass.screen

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.PagerState
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.unknowclass.R

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun HorizontalSlider(navegation: NavHostController){
 val pagerStater = rememberPagerState(initialPage = 0) {
     3
 }
Box(modifier = Modifier
    .fillMaxSize()
    .background(Color(0xfff5f5f5))){
    HorizontalPager(state = pagerStater) {
        page ->  when(page){
            0 -> Pagina1(pagerStater)
            1 -> Pagina2(pagerStater)
            2 -> Pagina3(navegation, pagerStater)
        }
    }
}
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun Pagina1(pagerState: PagerState){
    Column(modifier = Modifier.fillMaxHeight(), verticalArrangement = Arrangement.Top) {
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center) {
            Image(painter = painterResource(id = R.drawable.agricultura), contentDescription = "", modifier = Modifier.height(250.dp))
        }
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center) {
            Text(text = "Sobre Nosotros",
                modifier = Modifier.padding(10.dp),
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold)
        }
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center) {
            Text(
                text = "Siente el vínculo con la naturaleza en cada bocado. En Granjas Peter, cultivamos nuestros productos con métodos tradicionales y respetuosos con el medio ambiente. Con cada compra, apoyas a agricultores locales y contribuyes a la preservación de nuestra herencia colombiana.",
                modifier = Modifier.padding(20.dp),
                textAlign = TextAlign.Justify,
                fontSize = 18.sp
            )
        }
        Puntos(pagerState, 177)

    }
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun Puntos(pagerState: PagerState, data: Int) {
    Row(modifier = Modifier.fillMaxWidth().padding(top = data.dp),
        horizontalArrangement = Arrangement.Center) {
        repeat(pagerState.pageCount){
            var color  = if (pagerState.currentPage == it) Color.Black else Color.Gray
            Box(modifier = Modifier
                .padding(2.dp)
                .size(12.dp)
                .clip(CircleShape)
                .background(color))
        }
    }
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun Pagina2(pagerState: PagerState){
    Column(modifier = Modifier.fillMaxHeight(), verticalArrangement = Arrangement.Top) {
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center) {
            Image(painter = painterResource(id = R.drawable.agricultura2), contentDescription = "", modifier = Modifier.height(250.dp))
        }
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center) {
            Text(text = "Nuestros Productos",
                modifier = Modifier.padding(10.dp),
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold)
        }
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center) {
            Text(
                text = "Descubre el auténtico sabor de Colombia en cada bocado. Nuestros productos, cultivados con esmero en tierras colombianas, son el resultado de un proceso totalmente natural. Desde la yuca hasta la cebolla, cada ingrediente es cultivado sin químicos ni pesticidas, garantizando frescura y calidad incomparables.",

                modifier = Modifier.padding(20.dp),
                textAlign = TextAlign.Justify,
                fontSize = 18.sp
            )
        }
        Puntos(pagerState, 160)
    }
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun Pagina3(navegation: NavHostController, pagerState: PagerState){
    Column(modifier = Modifier.fillMaxHeight(), verticalArrangement = Arrangement.Top) {
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center) {
            Image(painter = painterResource(id = R.drawable.agricultura3), contentDescription = "", modifier = Modifier.height(250.dp))
        }
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center) {
            Text(text = "Todo Es 100% Natural",
                modifier = Modifier.padding(9.dp),
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold)
        }
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center) {
            Text(
                text = "¿Quieres darle a tu familia lo mejor de la tierra? Descubre nuestra gama de productos naturales colombianos, cultivados con cuidado y amor por generaciones de agricultores. Desde la siembra hasta la cosecha, cada paso se realiza con dedicación para ofrecerte lo mejor de nuestra tierra.",
                modifier = Modifier.padding(20.dp),
                textAlign = TextAlign.Justify,
                fontSize = 18.sp
            )
        }
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center) {
            OutlinedButton(onClick = { navegation.navigate("segundaVista") }) {
                Text(text = "A la otra pagina")
            }
        }
        Puntos(pagerState, 137)
    }
}


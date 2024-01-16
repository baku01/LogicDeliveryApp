package com.logic.logicdelivery

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.verticalScroll
import androidx.compose.ui.Modifier
import com.logic.logicdelivery.model.Product
import com.logic.logicdelivery.model.Productsection
import com.logic.logicdelivery.ui.components.ProductSection
import com.logic.logicdelivery.ui.theme.LogicDeliveryTheme
import java.math.BigDecimal


class MainActivity : ComponentActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LogicDeliveryTheme {
                Column(
                    Modifier
                        .fillMaxSize()
                        .verticalScroll(ScrollState(0))
                ) {
                    ProductSection(Productsection(
                        nomeDaSessao = "Promoções",
                        productList = listOf( Product("Hambuger", BigDecimal("12.00"), R.drawable.fastfood),Product("Hambuger", BigDecimal("12.00"), R.drawable.fastfood))))
                    ProductSection(Productsection(
                        nomeDaSessao = "Promoções",
                        productList = listOf( Product("Hambuger", BigDecimal("12.00"), R.drawable.fastfood),Product("Hambuger", BigDecimal("12.00"), R.drawable.fastfood))))
                    ProductSection(Productsection(
                        nomeDaSessao = "Promoções",
                        productList = listOf( Product("Hambuger", BigDecimal("12.00"), R.drawable.fastfood),Product("Hambuger", BigDecimal("12.00"), R.drawable.fastfood))))
                    ProductSection(Productsection(
                        nomeDaSessao = "Promoções",
                        productList = listOf( Product("Hambuger", BigDecimal("12.00"), R.drawable.fastfood),Product("Hambuger", BigDecimal("12.00"), R.drawable.fastfood))))
                }
            }
        }
    }
}




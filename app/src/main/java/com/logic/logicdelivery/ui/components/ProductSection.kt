package com.logic.logicdelivery.ui.components

import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.logic.logicdelivery.R
import com.logic.logicdelivery.model.Product
import com.logic.logicdelivery.model.Productsection
import java.math.BigDecimal


@Composable
fun ProductSection(productSection: Productsection) {
    Column(Modifier
        .fillMaxSize())
    {
        Text(
            text = productSection.nomeDaSessao,
            Modifier
                .padding(start = 16.dp),
            fontSize = 20.sp,
            fontWeight = FontWeight(400)
        )
        Row(
            Modifier
                .padding(
                    top = 8.dp,
                    bottom = 16.dp
                )
                .horizontalScroll(ScrollState(0)),
            horizontalArrangement = Arrangement.spacedBy(16.dp),
            ) {
                for(products in productSection.productList){
                    ProductItem(product = products)
                }
            Spacer(Modifier)
        }
    }
}
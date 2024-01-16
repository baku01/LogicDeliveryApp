package com.logic.logicdelivery.model

import androidx.annotation.DrawableRes
import java.math.BigDecimal

class Product (
    val nome: String,
    val preco: BigDecimal,
    @DrawableRes val imagem: Int
)
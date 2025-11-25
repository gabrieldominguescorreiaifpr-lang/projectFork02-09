package com.ifpr.androidapptemplate.baseclasses

data class Item(
    var nome: String? = null,
    var tema: String? = null,
    var estilo: String? = null,
    val base64Image: String? = null,
    val imageUrl: String? = null
)

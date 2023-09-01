package com.ichwan.rebuildpos.product.data

import java.util.Date

data class Product (
    val id: Int,
    val name: String,
    val price: Long,
    val merk: String?,
    val category: List<Categories>,
    val stock: Int,
    val image: String,
    val description: String,
    val in_outlet: String,
    val createdAt: Date,
    val updatedAt: Date?
)

data class Categories (
    val id: Int,
    val name: String,
    val in_outlet: String
)

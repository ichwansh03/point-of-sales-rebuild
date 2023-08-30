package com.ichwan.rebuildpos.auth.data

data class RegisterBusinessUser(
    val busId: Int,
    val businessName: String,
    val busType: String,
    val outletType: String,
    val outletAddress: String,
    val user: User
)

data class User(
    val userId: Int,
    val userName: String,
    val userAddress: String,
    val userWhatsapp: String,
    val userPos: String,
    val userEmail: String,
    val userPass: String,
    val userConfPass: String
)
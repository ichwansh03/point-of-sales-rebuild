package com.ichwan.rebuildpos.auth.domain

interface UpdatePasswordService {
    fun updatePassword(id: String, email: String, password: String, confirmPassword: String)
}
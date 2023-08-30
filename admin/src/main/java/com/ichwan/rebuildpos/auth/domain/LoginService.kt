package com.ichwan.rebuildpos.auth.domain

interface LoginService {

    fun validate(email: String, password: String)
}
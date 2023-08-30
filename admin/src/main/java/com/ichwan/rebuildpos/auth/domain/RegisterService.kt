package com.ichwan.rebuildpos.auth.domain

import com.ichwan.rebuildpos.auth.data.RegisterBusinessUser

interface RegisterService {

    fun register(registerBusinessUser: RegisterBusinessUser)

    fun validateForm() : Boolean
}
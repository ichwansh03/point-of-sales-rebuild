package com.ichwan.rebuildpos.auth.presentation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.ichwan.rebuildpos.R
import com.ichwan.rebuildpos.auth.data.RegisterBusinessUser
import com.ichwan.rebuildpos.auth.domain.RegisterService
import com.ichwan.rebuildpos.databinding.FragmentRegisterBinding

class RegisterFragment : Fragment(), RegisterService {

    private lateinit var binding: FragmentRegisterBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentRegisterBinding.inflate(layoutInflater, container, false)

        binding.apply {
            buttonRegister.setOnClickListener {
                Navigation.findNavController(requireView()).navigate(R.id.action_to_loginActivity2)
            }
        }

        return binding.root
    }

    override fun register(registerBusinessUser: RegisterBusinessUser) {
        if (validateForm()){

        }
    }

    private fun isFieldEmpty(field: String): Boolean {
        return field.isEmpty()
    }


    override fun validateForm(): Boolean {
        binding.apply {
            if (isFieldEmpty(inputBusNameRegister.text.toString())
                || isFieldEmpty(inputBusTypeRegister.text.toString())
                || isFieldEmpty(inputOutletTypeRegister.text.toString())
                || isFieldEmpty(inputBusAddressRegister.text.toString())
                || isFieldEmpty(inputNameRegister.text.toString())
                || isFieldEmpty(inputAddressRegister.text.toString())
                || isFieldEmpty(inputWhatsappRegister.text.toString())
                || isFieldEmpty(inputPosRegister.text.toString())
                || isFieldEmpty(inputEmailRegister.text.toString())
                || isFieldEmpty(inputPasswordRegister.text.toString())
                || isFieldEmpty(inputConfPasswordRegister.text.toString())) {
                return false
            } else if (inputPasswordRegister != inputConfPasswordRegister) {
                return false
            }
        }

        return true
    }

}
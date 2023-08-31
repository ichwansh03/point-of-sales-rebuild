package com.ichwan.rebuildpos.auth.presentation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.ichwan.rebuildpos.R
import com.ichwan.rebuildpos.auth.domain.LoginService
import com.ichwan.rebuildpos.databinding.FragmentLoginBinding

class LoginFragment : Fragment(), LoginService {

    private lateinit var binding: FragmentLoginBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentLoginBinding.inflate(inflater, container, false)

        binding.apply {
            with(Navigation){
                buttonRegister.setOnClickListener {
                    findNavController(requireView()).navigate(R.id.login_to_registerFragment)
                }
                txForgotPassword.setOnClickListener {
                    findNavController(requireView()).navigate(R.id.forgotpassword_to_loginActivity)
                }

            }
//                with(Navigation) {
//                    findNavController(requireView()).navigate(R.id.login_to_registerFragment)
//                }

        }

        return binding.root
    }

    override fun validate(email: String, password: String) {
        TODO("Not yet implemented")
    }

}
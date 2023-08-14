package com.ichwan.demo.presentation

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.ichwan.demo.R
import com.ichwan.demo.databinding.FragmentLoginBinding
import com.ichwan.rebuildpos.MainActivity

class LoginFragment : Fragment() {

    private lateinit var binding: FragmentLoginBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = FragmentLoginBinding.inflate(inflater, container, false)

        binding.apply {
            buttonLogin.setOnClickListener { toMain() }
            buttonToRegist.setOnClickListener { toRegist() }
        }

        return binding.root
    }

    private fun toMain() {
        startActivity(Intent(requireContext(), MainActivity::class.java))
    }

    private fun toRegist() {
        Navigation
            .findNavController(requireView())
            .navigate(R.id.action_loginFragment_to_registerFragment)
    }

}
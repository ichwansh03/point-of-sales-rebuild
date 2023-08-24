package com.ichwan.rebuildpos.auth.presentation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.ichwan.rebuildpos.R
import com.ichwan.rebuildpos.databinding.FragmentLoginBinding

class LoginFragment : Fragment() {

    private lateinit var binding: FragmentLoginBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentLoginBinding.inflate(inflater, container, false)

        binding.apply {

            buttonRegister.setOnClickListener {
                Navigation.findNavController(requireView()).navigate(R.id.action_to_registerFragment)
            }
        }

        return binding.root
    }

}
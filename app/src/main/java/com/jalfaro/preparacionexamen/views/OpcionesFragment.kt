package com.jalfaro.preparacionexamen.views

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.jalfaro.preparacionexamen.R
import com.jalfaro.preparacionexamen.databinding.FragmentOpcionesBinding

class OpcionesFragment: Fragment() {
    lateinit var binding: FragmentOpcionesBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentOpcionesBinding.inflate(inflater,container, false)
        binding.btnCalculadora.setOnClickListener {
            findNavController().navigate(R.id.action_opcionesFragment_to_calculadoraFragment)
        }
        binding.btnListado.setOnClickListener {
            findNavController().navigate(R.id.action_opcionesFragment_to_listadoFragment2)
        }
        binding.btnSalir.setOnClickListener {
            activity?.finish()
        }
        return binding.root
    }
}
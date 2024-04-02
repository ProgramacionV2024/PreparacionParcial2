package com.jalfaro.preparacionexamen.views

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.View.OnClickListener
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.jalfaro.preparacionexamen.R
import com.jalfaro.preparacionexamen.databinding.FragmentCalculadoraBinding
import com.jalfaro.preparacionexamen.viewmodels.CalculadoraViewModel

class CalculadoraFragment: Fragment(), OnClickListener {
    lateinit var binding: FragmentCalculadoraBinding
    lateinit var viewModel: CalculadoraViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCalculadoraBinding.inflate(inflater,container, false)
        viewModel = ViewModelProvider(this).get(CalculadoraViewModel::class.java)
        binding.btnDiv.setOnClickListener(this)
        binding.btnMas.setOnClickListener(this)
        binding.btnMenos.setOnClickListener(this)
        binding.btnPor.setOnClickListener (this)
        binding.btnRegresar.setOnClickListener {
            findNavController().navigate(R.id.action_calculadoraFragment_to_opcionesFragment)
        }
        viewModel.resultado.observe(viewLifecycleOwner) { res ->
            binding.resultado.text = "Resultado : ${res}"
        }
        return binding.root
    }

    override fun onClick(v: View?) {
        viewModel.evalOperation(
            (v as Button).text.toString(),
            binding.operando1.text.toString().toInt(),
            binding.operando2.text.toString().toInt()
        )
    }
}
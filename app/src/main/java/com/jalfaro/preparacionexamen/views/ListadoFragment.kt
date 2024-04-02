package com.jalfaro.preparacionexamen.views

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.ViewModelInitializer
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.jalfaro.preparacionexamen.R
import com.jalfaro.preparacionexamen.adapter.TelefonoAdapter
import com.jalfaro.preparacionexamen.databinding.FragmentCalculadoraBinding
import com.jalfaro.preparacionexamen.databinding.FragmentListadoBinding
import com.jalfaro.preparacionexamen.viewmodels.ListadoViewModel

class ListadoFragment: Fragment() {
    lateinit var binding: FragmentListadoBinding
    lateinit var viewModel: ListadoViewModel
    lateinit var adapter: TelefonoAdapter
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentListadoBinding.inflate(inflater,container, false)
        viewModel = ViewModelProvider(this).get(ListadoViewModel::class.java)
        adapter = TelefonoAdapter(viewModel.getData())
        binding.btnRegresar.setOnClickListener {
            findNavController().navigate(R.id.action_listadoFragment2_to_opcionesFragment)
        }
        binding.rcListado.layoutManager = LinearLayoutManager(activity?.baseContext)
        binding.rcListado.adapter = adapter
        return binding.root
    }


}
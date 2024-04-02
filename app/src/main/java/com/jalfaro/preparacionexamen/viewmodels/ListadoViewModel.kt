package com.jalfaro.preparacionexamen.viewmodels

import androidx.lifecycle.ViewModel
import com.jalfaro.preparacionexamen.models.Telefono

class ListadoViewModel: ViewModel() {

    fun getData() : ArrayList<Telefono> = arrayListOf(
        Telefono("Julio Alfaro", "55559999"),
        Telefono("Pedro Gomex", "22220000"),
        Telefono("Juan Lopez", "44448888")
    )
}
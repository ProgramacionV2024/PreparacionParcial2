package com.jalfaro.preparacionexamen.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CalculadoraViewModel: ViewModel() {
    private val _resultado = MutableLiveData<Int>(0)
    val resultado: LiveData<Int> = _resultado

    fun evalOperation(op: String, op1: Int, op2: Int) {
        _resultado.value = when (op) {
            "+" -> op1 + op2
            "-" -> op1 - op2
            "*" -> op1 * op2
            "/" -> op1 / op2
            else -> 0
        }
    }
}
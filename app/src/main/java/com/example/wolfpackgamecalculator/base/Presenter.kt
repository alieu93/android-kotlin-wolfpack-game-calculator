package com.example.wolfpackgamecalculator.base

interface Presenter <V : ViewController> {
    fun getView() : V;
}
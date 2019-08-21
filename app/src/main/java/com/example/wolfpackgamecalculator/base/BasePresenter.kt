package com.example.wolfpackgamecalculator.base

interface BasePresenter<V : ViewController> : Presenter<V>{
    fun start(view: V)
}
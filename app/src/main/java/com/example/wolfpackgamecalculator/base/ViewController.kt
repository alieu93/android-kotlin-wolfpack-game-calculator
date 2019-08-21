package com.example.wolfpackgamecalculator.base

interface ViewController {
    fun  getPresenter(): Presenter<*>
    fun <V: ViewController> createPresenter(presenter: Presenter<V>)
}
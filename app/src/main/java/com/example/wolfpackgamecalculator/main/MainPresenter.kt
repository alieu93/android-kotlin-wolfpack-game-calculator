package com.example.wolfpackgamecalculator.main

import com.example.wolfpackgamecalculator.base.BasePresenter

class MainPresenter : BasePresenter<MainViewController> {
    private lateinit var mView: MainViewController
    override fun start(view: MainViewController) {
        mView = view
    }

    override fun getView(): MainViewController {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}
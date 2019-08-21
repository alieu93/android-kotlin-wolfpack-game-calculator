package com.example.wolfpackgamecalculator.main

import android.os.Bundle
import com.example.wolfpackgamecalculator.R
import com.example.wolfpackgamecalculator.base.BaseActivity

class MainActivity : BaseActivity<MainViewController, MainPresenter>(), MainViewController  {
    private lateinit var mPresenter: MainPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        createPresenter(MainPresenter())
        mPresenter = getPresenter() as MainPresenter
        mPresenter.start(this)
    }
}

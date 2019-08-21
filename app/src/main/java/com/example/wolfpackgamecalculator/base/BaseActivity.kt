package com.example.wolfpackgamecalculator.base

import android.support.v7.app.AppCompatActivity
import java.io.Serializable

abstract class BaseActivity<V : ViewController, P : BasePresenter<V>> : AppCompatActivity(), ViewController {
    private val INTENT_KEY_ARG_DATA = "ARG_DATA"
    private lateinit var mPresenter: Presenter<*>

    protected fun <T : Serializable> getArgData(): T {
        return intent.getSerializableExtra(INTENT_KEY_ARG_DATA) as T
    }

    override fun <V : ViewController> createPresenter(presenter: Presenter<V>) {
        mPresenter = presenter
    }

    override fun getPresenter(): Presenter<*> {
        return mPresenter
    }
}
package com.android.english

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import com.android.english.databinding.ActivityMainBinding
import com.android.helper.base.title.AppBaseBindingTitleActivity

class MainActivity : AppBaseBindingTitleActivity<ActivityMainBinding>() {

    override fun initData(savedInstanceState: Bundle?) {

    }

    override fun setTitleContent(): String {
        return "主界面"
    }

    override fun getBinding(inflater: LayoutInflater, container: ViewGroup?): ActivityMainBinding {
        return ActivityMainBinding.inflate(inflater, container, true)
    }
}
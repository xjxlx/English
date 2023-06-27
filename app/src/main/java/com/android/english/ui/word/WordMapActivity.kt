package com.android.english.ui.word

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import com.android.english.databinding.ActivityWordMapBinding
import com.android.helper.base.title.AppBaseBindingTitleActivity

class WordMapActivity : AppBaseBindingTitleActivity<ActivityWordMapBinding>() {

    override fun initData(savedInstanceState: Bundle?) {
    }

    override fun setTitleContent(): String {
        return "单词组"
    }

    override fun getBinding(inflater: LayoutInflater, container: ViewGroup?): ActivityWordMapBinding {
        return ActivityWordMapBinding.inflate(inflater, container, true)
    }
}
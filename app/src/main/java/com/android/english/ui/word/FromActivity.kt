package com.android.english.ui.word

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import com.android.english.databinding.ActivityFromBinding
import com.android.helper.base.title.AppBaseBindingTitleActivity

class FromActivity : AppBaseBindingTitleActivity<ActivityFromBinding>() {

    override fun initData(savedInstanceState: Bundle?) {
        mBinding.cvContent.content.text = "1232"
    }

    override fun setTitleContent(): String {
        return "From"
    }

    override fun getBinding(inflater: LayoutInflater, container: ViewGroup?): ActivityFromBinding {
        return ActivityFromBinding.inflate(inflater, container, true)
    }
}
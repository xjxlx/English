package com.android.english.ui.word

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import com.android.english.databinding.ActivityFromBinding
import com.android.helper.base.title.AppBaseBindingTitleActivity

class FromActivity : AppBaseBindingTitleActivity<ActivityFromBinding>() {

    private val content: StringBuffer = StringBuffer().apply {
        append("from: 从 ... 到... (时间)")
        append("\r\n")
        append("the park open from a.m. 8 to p.m 8")
    }

    override fun initData(savedInstanceState: Bundle?) {
        mBinding.cvContent.content.text = content.toString()
    }

    override fun setTitleContent(): String {
        return "From"
    }

    override fun getBinding(inflater: LayoutInflater, container: ViewGroup?): ActivityFromBinding {
        return ActivityFromBinding.inflate(inflater, container, true)
    }
}
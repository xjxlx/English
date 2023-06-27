package com.android.english

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.android.english.databinding.ActivityMainBinding
import com.android.english.ui.word.WordMapActivity
import com.android.helper.base.title.AppBaseBindingTitleActivity

class MainActivity : AppBaseBindingTitleActivity<ActivityMainBinding>() {

    override fun initData(savedInstanceState: Bundle?) {

        setonClickListener(R.id.tv_item_word_group)
    }

    override fun setTitleContent(): String {
        return "主界面"
    }

    override fun onClick(v: View?) {
        super.onClick(v)
        when (v?.id) {
            R.id.tv_item_word_group -> {
                startActivity(WordMapActivity::class.java)
            }
        }
    }

    override fun getBinding(inflater: LayoutInflater, container: ViewGroup?): ActivityMainBinding {
        return ActivityMainBinding.inflate(inflater, container, true)
    }
}
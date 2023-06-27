package com.android.english.widget

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.TextView
import androidx.core.widget.NestedScrollView
import com.android.english.R

class ContentView(private val context: Context, attributeSet: AttributeSet) : NestedScrollView(context, attributeSet) {

    var content: TextView

    init {
        val inflate = LayoutInflater.from(context)
            .inflate(R.layout.widget_content, null, false)
        content = inflate.findViewById(R.id.tv_content)
        if (childCount > 0) {
            removeAllViews()
        }
        addView(inflate)
    }
}


package com.yindan.myapplication

import android.content.Context
import android.widget.Toast

object TestUtil {
    fun test(context: Context) {
        Toast.makeText(context, "test", Toast.LENGTH_SHORT).show()
    }
}
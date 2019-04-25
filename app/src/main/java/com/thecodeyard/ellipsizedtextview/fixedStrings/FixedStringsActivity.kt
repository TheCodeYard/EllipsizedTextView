package com.thecodeyard.ellipsizedtextview.fixedStrings

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.thecodeyard.ellipsizedtextview.R

class FixedStringsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fixed_strings)
        setTitle(R.string.title_fixed_strings)
    }
}

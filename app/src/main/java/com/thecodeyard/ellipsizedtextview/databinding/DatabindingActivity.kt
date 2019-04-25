package com.thecodeyard.ellipsizedtextview.databinding

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.thecodeyard.ellipsizedtextview.R


class DatabindingActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_databinding)
        setTitle(R.string.title_databinding)
    }
}

package com.thecodeyard.ellipsizedtextview.databinding

import android.databinding.ObservableField
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.thecodeyard.ellipsizedtextview.R


class DatabindingActivity : AppCompatActivity() {
    val longText = ObservableField<String>()
    val ellipsisStart = ObservableField<String>()
    val ellipsisMiddle = ObservableField<String>()
    val ellipsisEnd = ObservableField<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_databinding)
        setTitle(R.string.title_databinding)

        longText.set(getString(R.string.long_text))
        ellipsisStart.set(getString(R.string.ellipsis_start))
        ellipsisMiddle.set(getString(R.string.ellipsis_middle))
        ellipsisEnd.set(getString(R.string.ellipsis_end))
    }
}

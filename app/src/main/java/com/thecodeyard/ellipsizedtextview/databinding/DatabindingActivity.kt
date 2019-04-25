package com.thecodeyard.ellipsizedtextview.databinding

import android.databinding.ObservableField
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.thecodeyard.ellipsizedtextview.R
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers
import java.util.concurrent.TimeUnit
import android.databinding.DataBindingUtil
import com.thecodeyard.ellipsizedtextview.databinding.ActivityDatabindingBinding


class DatabindingActivity : AppCompatActivity() {
    val longText = ObservableField<String>()

    private var disposable: Disposable? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityDatabindingBinding = DataBindingUtil.setContentView(this, R.layout.activity_databinding)
        binding.viewModel = this

        setTitle(R.string.title_databinding)

        longText.set(getString(R.string.text_placeholder))
    }

    override fun onResume() {
        super.onResume()

        // Simulate an asynchronous operation (eg. a network call)
        disposable = Observable.timer(3, TimeUnit.SECONDS)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe {
                    longText.set(getString(R.string.long_text))
                }
    }

    override fun onPause() {
        disposable?.dispose()
        super.onPause()
    }
}
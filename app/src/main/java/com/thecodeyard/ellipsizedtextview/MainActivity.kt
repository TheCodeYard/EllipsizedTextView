package com.thecodeyard.ellipsizedtextview

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.DividerItemDecoration
import android.support.v7.widget.RecyclerView
import com.thecodeyard.ellipsizedtextview.databinding.DatabindingActivity
import com.thecodeyard.ellipsizedtextview.fixedStrings.FixedStringsActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val items = ArrayList<Item>()
        items.add(Item("Databinding", "An activity that uses Databinding", Intent(this, DatabindingActivity::class.java)))
        items.add(Item("Fixed strings", "An activity with strings defined in strings.xml", Intent(this, FixedStringsActivity::class.java)))

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.adapter = ItemAdapter(this, items)
        recyclerView.addItemDecoration(DividerItemDecoration(this, DividerItemDecoration.VERTICAL))
    }
}

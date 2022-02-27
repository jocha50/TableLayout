package com.example.tablelayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TableRow
import android.widget.TextView
import android.widget.Toast
import androidx.core.view.marginTop
import androidx.core.view.setPadding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun add(view: View) {

        val tableRow = TableRow(applicationContext)
        tableRow.setBackgroundColor(resources.getColor(R.color.tableRow))

        tableRow.setPadding(5)
        val layoutParams = TableRow.LayoutParams(TableRow.LayoutParams.WRAP_CONTENT)
        layoutParams.setMargins(0, 10, 0, 0)

        val dynamicAndroidVersion: TextView = TextView(this)
        dynamicAndroidVersion.setText(androidVersion.text.toString())
        tableRow.addView(dynamicAndroidVersion, 0)

        val dynamicAndroidCodeName: TextView = TextView(this)
        dynamicAndroidCodeName.setText((androidCodeName.text.toString()))
        tableRow.addView(dynamicAndroidCodeName, 1)

        tableLayoutId.addView(tableRow,layoutParams)
        androidVersion.setText("")
        androidCodeName.setText("")
    }

}
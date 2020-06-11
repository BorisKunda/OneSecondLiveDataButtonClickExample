package com.boriskunda.ld_exercise

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val vm = ViewModelProvider(this).get(VM::class.java)

        btn.setOnClickListener {
            vm.clickButton()
        }

        vm.btnClickedLd.observe(this, Observer {
            tv.text = "click"
        })

    }
}
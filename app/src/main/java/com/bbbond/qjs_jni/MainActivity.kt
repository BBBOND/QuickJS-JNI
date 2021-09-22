package com.bbbond.qjs_jni

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.bbbond.qjs_jni.databinding.ActivityMainBinding
import com.bbbond.quickjs.QuickJS

class MainActivity : AppCompatActivity() {

    private var binding: ActivityMainBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding!!.root)
        binding?.sampleText?.setOnClickListener {
            (it as TextView).text = QuickJS().version()
        }
    }
}
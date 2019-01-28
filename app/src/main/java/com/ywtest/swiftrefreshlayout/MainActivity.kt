package com.ywtest.swiftrefreshlayout

import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.ywtest.swiftrefreshlayout.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        initView()

    }

    /**
     *  컴포넌트 뷰 초기화
     */
    private fun initView() {
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
    }
}

package com.alvinmd.myfragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.alvinmd.myfragment.Adapter.ViewPagerAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        view_pager.adapter  = ViewPagerAdapter(this, supportFragmentManager)

        tabs.setupWithViewPager(view_pager)
    }
}
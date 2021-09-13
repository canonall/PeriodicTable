package com.canonal.periodictable

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.GridLayoutManager

import androidx.recyclerview.widget.RecyclerView
import com.canonal.periodictable.adapter.PeriodicTableAdapter
import com.canonal.periodictable.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        val elementList = Data.getDummyData()
        val periodicTableAdapter = PeriodicTableAdapter(elementList)
        binding.rvPeriodicTable.adapter = periodicTableAdapter
        binding.rvPeriodicTable.layoutManager = GridLayoutManager(this,5,RecyclerView.HORIZONTAL,false)

    }
}
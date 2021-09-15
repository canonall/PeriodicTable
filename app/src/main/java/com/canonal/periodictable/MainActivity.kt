package com.canonal.periodictable

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.GridLayoutManager
import com.canonal.periodictable.adapter.PeriodicTableAdapter
import com.canonal.periodictable.databinding.ActivityMainBinding
import com.canonal.periodictable.model.Element

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        val elementList = Data.getDummyData()
        val periodicTableAdapter = PeriodicTableAdapter(elementList){
            position -> onItemClicked(
            elementList,
            position
            )
        }
        binding.rvPeriodicTable.layoutManager =
            GridLayoutManager(this, 18)
        binding.rvPeriodicTable.adapter = periodicTableAdapter


    }

    private fun onItemClicked(elementList: List<Element>, position: Int){
    Toast.makeText(applicationContext,"Clicked",Toast.LENGTH_SHORT).show()
    }
}
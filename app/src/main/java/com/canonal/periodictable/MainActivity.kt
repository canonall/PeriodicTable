package com.canonal.periodictable


import android.app.Dialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.Window
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.GridLayoutManager
import com.canonal.periodictable.adapter.PeriodicTableAdapter
import com.canonal.periodictable.databinding.ActivityMainBinding
import com.canonal.periodictable.databinding.DialogItemBinding
import com.canonal.periodictable.model.Element
import com.canonal.periodictable.util.DataBindingUtils

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var bindingDialog: DialogItemBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        val elementList = Data.getDummyData()
        val periodicTableAdapter = PeriodicTableAdapter(elementList) { position ->
            onItemClicked(
                elementList,
                position
            )
        }
        binding.rvPeriodicTable.layoutManager =
            GridLayoutManager(this, 18)
        binding.rvPeriodicTable.setHasFixedSize(true)
        binding.rvPeriodicTable.adapter = periodicTableAdapter


    }

    private fun onItemClicked(elementList: List<Element>, position: Int) {
        showDialog(elementList[position])
    }

    private fun showDialog(element: Element) {

        bindingDialog = DataBindingUtil.inflate(
            LayoutInflater.from(this@MainActivity),
            R.layout.dialog_item,
            null,
            false
        )
        bindingDialog.elementDetail = element
        DataBindingUtils.setBackground(bindingDialog.rlDetail, element)

        val dialog = Dialog(this@MainActivity, R.style.AppTheme)
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
        dialog.setCanceledOnTouchOutside(false)
        dialog.setContentView(bindingDialog.root)
        dialog.show()

        val window = dialog.window
        window?.setLayout(950, 850)

    }
}
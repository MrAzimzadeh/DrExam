package com.azimzada.drexam

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.azimzada.drexam.adapter.NearbyAdapter
import com.azimzada.drexam.databinding.ActivityMainBinding
import com.azimzada.drexam.model.AdapterDTO


class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding  =  ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var listOfGyms = mutableListOf<AdapterDTO>(
            AdapterDTO("The Club", R.drawable.abi, "3.21", "dsfdfs" , "Asdasd"),
            AdapterDTO("The Club", R.drawable.abi, "3.21", "dsfdfs" , "Asdasd"),
            AdapterDTO("The Club", R.drawable.abi, "3.21", "dsfdfs" , "Asdasd"),
            AdapterDTO("The Club", R.drawable.abi, "3.21", "dsfdfs" , "Asdasd"),
        )
        binding.rvItem.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        binding.rvItem.adapter = NearbyAdapter(listOfGyms)
    }


}
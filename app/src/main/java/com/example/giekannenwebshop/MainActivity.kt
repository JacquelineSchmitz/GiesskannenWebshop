package com.example.giekannenwebshop

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.giekannenwebshop.adapter.KannenAdapter
import com.example.giekannenwebshop.data.Datasource
import com.example.giekannenwebshop.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
            val kannenListe = Datasource().loadKanne()

            val recyclerView = binding.recyclerView

        recyclerView.adapter = KannenAdapter(this, kannenListe)
        recyclerView.layoutManager = LinearLayoutManager(this)
    }

}


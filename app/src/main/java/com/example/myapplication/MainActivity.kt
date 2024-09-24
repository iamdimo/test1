package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {


    private lateinit var binding: ActivityMainBinding;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater);
        setContentView(binding.root)
        val dataSource =  DataSource()
        val place =  dataSource.getPlaces()
        val adapter = PlaceAdapter(place)
        binding.myRec.adapter = adapter;
        binding.myRec.setHasFixedSize(true);


        binding.myIntent.setOnClickListener {
            val query =  binding.etIntent.text.toString()
       val intent = Intent(this,Shahin::class.java)
            intent.putExtra("query",query);
                 startActivity(intent)

        }

        val douleIt : (Int) -> Double = {
            it * 4.0
        }
        println(douleIt.invoke(8))
        println(douleIt(8))
        println()
        println()
        println()


    }}









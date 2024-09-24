package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.myapplication.databinding.ActivityShahinBinding

class Shahin : AppCompatActivity() {
    lateinit var binding: ActivityShahinBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityShahinBinding.inflate(layoutInflater);
        val query =   intent.getStringExtra("query") ?: " Fuck you"
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)


        binding.myTv.text = query
        binding.myBtn.text = query
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


        binding.myIntent.setOnClickListener {
            val query =  binding.etIntent.text.toString()
            val intent = Intent(this,Shahin::class.java)
            intent.putExtra("query",query);
            startActivity(intent)

        }
        val ages: List<Int> = listOf(24, 25, 84, 32, 48)
        //val names: List<String> = listOf("Ali", "David", "Jack")
        val oddNumbers: MutableList<Int> = mutableListOf()
        val names = listOf("Omid", "Ali", "David", "Jessica", "Leaonardo")


            //binding.myTv.text = oddNumbers.reversed().toString()
           // binding.myTv.text = oddNumbers.sorted().toString()
        }
    }





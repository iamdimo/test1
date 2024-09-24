package com.example.myapplication

import android.os.Bundle
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.myapplication.databinding.ActivityMainBinding
import com.example.myapplication.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    private lateinit var binding : ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater);
        enableEdgeToEdge()
        setContentView(binding.root)


        binding.calculate.setOnClickListener {
            val weight =binding.etWeight.getText().toString().toDouble()
            val height = binding.etHeight.getText().toString().toDouble() / 100.0

            var result = calculateBmi(weight, height)
//            binding.result.setText(result.toString())
            binding.result.text = getString(R.string.main_msg,result.toString())

        }

    }


}

 fun calculateBmi (weight: Double, height:Double) : Double
 {
     return  weight / (height * height)

 }

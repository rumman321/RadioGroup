package com.example.readiobutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var group:RadioGroup
    private lateinit var option1:RadioButton
    private lateinit var option2:RadioButton
    private lateinit var option3:RadioButton
    private lateinit var option4:RadioButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        option1=findViewById(R.id.option1)
        option2=findViewById(R.id.option2)
        option3=findViewById(R.id.option3)
        option4=findViewById(R.id.option4)
        group=findViewById(R.id.Rgroup)
        group.setOnCheckedChangeListener { radioGroup, i ->
            when(i){
                R.id.option1 ->{
                    option2.isEnabled=false
                    option3.isEnabled=false
                    option4.isEnabled=false
                    Toast.makeText(this, "option 1", Toast.LENGTH_SHORT).show()
                }
                R.id.option2 ->{
                    option1.isEnabled=false
                    option3.isEnabled=false
                    option4.isEnabled=false
                    Toast.makeText(this, "option 2", Toast.LENGTH_SHORT).show()
                }
                R.id.option3 ->{
                    option2.isEnabled=false
                    option1.isEnabled=false
                    option4.isEnabled=false
                    Toast.makeText(this, "option 3", Toast.LENGTH_SHORT).show()
                }
                R.id.option4 ->{
                    option2.isEnabled=false
                    option3.isEnabled=false
                    option1.isEnabled=false
                    Toast.makeText(this, "option 4", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }
}
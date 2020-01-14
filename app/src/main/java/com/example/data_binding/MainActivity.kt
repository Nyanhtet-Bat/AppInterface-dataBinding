package com.example.data_binding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.data_binding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding //can't declare binding without a layout tab

    var person: Person = Person("Nyan", "AI Technician")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main) //new line
//        don't want to use findviewbyid
//    *    binding.txtName.text = person.name
//    *    binding.txtOccupation.text = person.occupation
//        when using binding, they delete underscore and autogenerate camal case letter
        binding.person = person
//        not same person


    }
}
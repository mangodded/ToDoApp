package com.godson.todoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    val username: String = "admin"
    val password: String = "admin"
   private lateinit var username_input: EditText
   private lateinit var password_input: EditText
   private lateinit var submit_button: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
package com.godson.todoapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.godson.todoapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    val validusername: String = "admin"
    val validpassword: String = "admin"
  // private lateinit var username_input: EditText
  // private lateinit var password_input: EditText
  // private lateinit var submit_button: Button

    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
      // username_input = findViewById(R.id.username_input)
       // password_input = findViewById(R.id.password_input)
      //  submit_button = findViewById(R.id.submit_button)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.submitButton.setOnClickListener {
            val username=binding.usernameInput.text.toString()
            val password=binding.passwordInput.text.toString()
            login(username, password)
        }
    }
    fun login(username: String, password: String) {

        if (isvalidCredentials(username,password)) {
            val intent:Intent=Intent(this, HomeActivity::class.java)
            intent.putExtra("username", username)
            startActivity(intent)

        }else{
            Toast.makeText(applicationContext, "invalid credentials", Toast.LENGTH_SHORT).show()

        }}

        private fun isvalidCredentials(username: String, password: String) : Boolean{
         if (password == validpassword) return true
            return false
        }
    }
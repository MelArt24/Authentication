package com.am24.authentication

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.am24.authentication.databinding.ActivitySignUpBinding

class SignUpActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySignUpBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignUpBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.title = "Sign Up"

        binding.loginTV.setOnClickListener {
            startActivity(Intent(this, LoginActivity::class.java))
            finish()
        }

        binding.createAccountBtn.setOnClickListener {
            val email = binding.emailSignUp.text.toString()
            val password = binding.passwordSignUp.text.toString()

            if(email.isNotEmpty() && password.isNotEmpty()) {
                MainActivity.authantication.createUserWithEmailAndPassword(email, password).addOnCompleteListener {
                    if(it.isSuccessful) {
                        startActivity(Intent(this, LoginActivity::class.java))
                    }
                }.addOnFailureListener {
                    Toast.makeText(this, it.localizedMessage, Toast.LENGTH_LONG).show()
                }
            }
        }
    }
}
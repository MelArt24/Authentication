package com.am24.authentication

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.am24.authentication.databinding.ActivityMainBinding
import com.google.firebase.auth.FirebaseAuth

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    companion object {
        lateinit var authantication: FirebaseAuth
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        authantication = FirebaseAuth.getInstance()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.signIn.setOnClickListener {
            startActivity(Intent(this, SignUpActivity::class.java))
            finish()
        }

        binding.signOut.setOnClickListener {
            authantication.signOut()
            binding.user.text = updateData()
        }
    }

    override fun onResume() {
        super.onResume()
        binding.user.text = updateData()
    }

    private fun updateData(): String {
        return "Welcome, ${authantication.currentUser?.email}"
    }
}
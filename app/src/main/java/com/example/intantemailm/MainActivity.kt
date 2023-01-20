package com.example.intantemailm

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Toast
import com.example.intantemailm.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.sendBtn.setOnClickListener {

            val  email = binding.emailAddress.text.toString()
            val  subject = binding.subject.text.toString()
            val  message = binding.message.text.toString()

            val addresses = email.split(",".toRegex()).toTypedArray()

            var intent = Intent(Intent.ACTION_SENDTO).apply {

                data = Uri.parse("mailto:")
                putExtra(Intent.EXTRA_EMAIL,addresses)
                putExtra(Intent.EXTRA_SUBJECT,addresses)
                putExtra(Intent.EXTRA_TEXT,addresses)
            }

            if (intent.resolveActivity(packageManager) != null) {
                startActivity(intent)
            }else{
                Toast.makeText(this@MainActivity,"Required App is not installed",Toast.LENGTH_SHORT).show()
            }
        }
    }
}
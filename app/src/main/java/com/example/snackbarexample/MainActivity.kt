package com.example.snackbarexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.snackbarexample.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view: View = binding.root
        setContentView(view)

        binding.buttonToast.setOnClickListener {
            // https://developer.android.com/guide/topics/ui/notifiers/toasts
            Toast.makeText(this, "This is a Toast", Toast.LENGTH_LONG).show()
        }

        binding.buttonSnackbar.setOnClickListener {
            binding.textviewMessage.text = ""
            // https://www.tutorialkart.com/kotlin-android/android-snackbar-example/
            val snack = Snackbar.make(it, "This is a simple Snackbar", Snackbar.LENGTH_LONG)
            snack.setAction("Undo") { binding.textviewMessage.text = "Undone ..." }
            snack.show()
        }
    }
}
package com.example.bitebuddy

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

// MainActivity for BiteBuddy app
class MainActivity : AppCompatActivity() {

    // Map of meal suggestions based on time of day
    private val meals = mapOf(
        "morning" to listOf("Pancakes 🥞", "Smoothie 🍓"),
        "mid-morning snack" to listOf("Fruit & Yogurt 🍌🥛"),
        "afternoon" to listOf("Sandwich 🥪", "Salad 🥗"),
        "afternoon snack" to listOf("Cookies & Milk 🍪🥛"),
        "dinner" to listOf("Pasta 🍝", "Stir Fry 🍲"),
        "after dinner snack" to listOf("Ice Cream 🍨", "Fruit Salad 🍇")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Set the main layout
        setContentView(R.layout.activity_main)

        // Get references to UI elements
        val etTime = findViewById<EditText>(R.id.etTime)
        val btnSuggest = findViewById<Button>(R.id.btnSuggest)
        val btnReset = findViewById<Button>(R.id.btnReset)
        val tvSuggestion = findViewById<TextView>(R.id.tvSuggestion)

        // Button click to get meal suggestion
        btnSuggest.setOnClickListener {
            val input = etTime.text.toString().trim().lowercase() // normalize input

            if (input.isEmpty()) {
                // Show motivational error if input is empty
                Toast.makeText(this, "⚠️ Please enter a time of day! You got this! 💪", Toast.LENGTH_SHORT).show()
                tvSuggestion.text = ""
                return@setOnClickListener
            }

            val suggestionList = meals[input]

            if (suggestionList != null) {
                // Randomly pick a meal from the list
                val suggestion = suggestionList.random()
                tvSuggestion.text = "We suggest: $suggestion 🎉"
            } else {
                // Handle invalid input with fun message
                tvSuggestion.text = ""
                Toast.makeText(this, "Hmm 🤔 I don't recognize \"$input\". Try Morning, Afternoon, Dinner, etc.", Toast.LENGTH_LONG).show()
            }
        }

        // Reset button to clear input and suggestion
        btnReset.setOnClickListener {
            etTime.text.clear()
            tvSuggestion.text = ""
            Toast.makeText(this, "Reset done! 🔄 Ready for a new meal!", Toast.LENGTH_SHORT).show()
        }
    }
}

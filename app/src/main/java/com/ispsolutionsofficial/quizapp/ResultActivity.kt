package com.ispsolutionsofficial.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class ResultActivity : AppCompatActivity() {

    private var tvName:TextView? = null
    private var tvScore:TextView? = null
    private var btnFinish:Button? = null
    private var correctAnswers:String? = null
    private var totalQuestions:String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        correctAnswers = intent.getStringExtra(Constants.CORRECT_ANSWERS)
        totalQuestions = intent.getStringExtra(Constants.TOTAL_QUESTIONS)

        tvName = findViewById(R.id.tvName)
        tvScore = findViewById(R.id.tvScore)
        btnFinish = findViewById(R.id.btnFinish)

        tvName?.text = intent.getStringExtra(Constants.USER_NAME)
        tvScore?.text = "Your Score is ${correctAnswers} out of ${totalQuestions}."

        btnFinish?.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }


    }
}
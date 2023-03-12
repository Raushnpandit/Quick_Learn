package com.example.qa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView

class Chemistry : AppCompatActivity() {

    private val questions = listOf(
        "1. What is the chemical formula for water?",
        "2. What is the chemical formula for Nitric acid?",
        "3. What is the term used to describe a substance that increases the rate of a chemical reaction without being consumed in the reaction?",
        "4. Which of the following is an example of a chemical change?",
        "5. Which of the following is an example of a homogeneous mixture?",
        "6. Which of the following is an example of a chemical property?",
        "7. Which of the following is an example of a physical property?"

    )
    private val choices = listOf(
        listOf("a) H20", "b) HNO3", "c) H2SO4", "d) NO2"),
        listOf("a) H20", "b) HNO3", "c) H2SO4", "d) NO2"),
        listOf("a) Reactant", "b) Product", "c) Catalyst", "d) Enzyme"),
        listOf("a) Freezing water", "b) Burning wood", "c) Melting point", "d)cutting paper"),
        listOf("a) Sand and water", "b) Oil and vinegar", "c) Granite rock", "d) Salt water"),
        listOf("a) Boiling point", "b) Melting point", "c) Reactivity with oxygen", "d) Color"),
        listOf("a) Flammability", "b) Corrosiveness", "c) Density", "d) Toxicity"),
    )
    private val correctAnswers = listOf(0, 1, 2, 1, 3, 2, 2)
    private var currentQuestionIndex = 0
    private lateinit var questionTextView: TextView
    private lateinit var answerRadioGroup: RadioGroup
    private lateinit var answer1RadioGroup: RadioButton
    private lateinit var answer2RadioGroup: RadioButton
    private lateinit var answer3RadioGroup: RadioButton
    private lateinit var answer4RadioGroup: RadioButton
    private lateinit var submitAnswerButton: Button
    private lateinit var feedbackTextView: TextView
    private lateinit var previousButton: Button
    private lateinit var nextButton: Button
    private lateinit var showAnswerButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chemistry)

        title = "Chemistry"

        questionTextView = findViewById(R.id.questionTextView)
        answerRadioGroup = findViewById(R.id.answerRadioGroup)
        answer1RadioGroup = findViewById<RadioButton>(R.id.answer1RadioButton)
        answer2RadioGroup = findViewById<RadioButton>(R.id.answer2RadioButton)
        answer3RadioGroup = findViewById<RadioButton>(R.id.answer3RadioButton)
        answer4RadioGroup = findViewById<RadioButton>(R.id.answer4RadioButton)
        submitAnswerButton = findViewById(R.id.submitAnswerButton)
        feedbackTextView = findViewById(R.id.feedbackTextView)
        previousButton = findViewById(R.id.previousButton)
        nextButton = findViewById(R.id.nextButton)
        showAnswerButton = findViewById(R.id.showAnswerButton)

        submitAnswerButton.setOnClickListener {
            checkAnswer()
        }

        previousButton.setOnClickListener {
            showPreviousQuestion()
        }

        nextButton.setOnClickListener {
            showNextQuestion()
        }

        showAnswerButton.setOnClickListener {
            showAnswer()
        }

        showQuestionAtIndex(currentQuestionIndex)
    }

    private fun showQuestionAtIndex(index: Int) {
        val question = questions[index]
        val choices = choices[index]
        questionTextView.text = question
        answer1RadioGroup.text = choices[0]
        answer2RadioGroup.text = choices[1]
        answer3RadioGroup.text = choices[2]
        answer4RadioGroup.text = choices[3]
        answerRadioGroup.clearCheck()
        feedbackTextView.text = ""
    }

    private fun checkAnswer() {
        val checkedRadioButtonId = answerRadioGroup.checkedRadioButtonId
        if (checkedRadioButtonId == -1) {
            feedbackTextView.text = "Please select an answer."
            return
        }
        val checkedRadioButton = findViewById<RadioButton>(checkedRadioButtonId)
        val checkedIndex = answerRadioGroup.indexOfChild(checkedRadioButton)
        val correctIndex = correctAnswers[currentQuestionIndex]
        if (checkedIndex == correctIndex) {
            feedbackTextView.text = "Correct!"
        } else {
            feedbackTextView.text = "Incorrect. The correct answer is: ${choices[currentQuestionIndex][correctIndex]}"
        }
    }

    private fun showPreviousQuestion() {
        currentQuestionIndex--
        if (currentQuestionIndex < 0) {
            currentQuestionIndex = questions.size - 1
        }
        showQuestionAtIndex(currentQuestionIndex)
    }

    private fun showNextQuestion() {
        currentQuestionIndex++
        if (currentQuestionIndex == questions.size) {
            currentQuestionIndex = 0
        }
        showQuestionAtIndex(currentQuestionIndex)
    }

    private fun showAnswer() {
        val correctIndex = correctAnswers[currentQuestionIndex]
        feedbackTextView.text = "The correct answer is: ${choices[currentQuestionIndex][correctIndex]}"
    }
}
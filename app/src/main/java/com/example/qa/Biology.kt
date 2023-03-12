package com.example.qa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView

class Biology : AppCompatActivity() {

    private val questions = listOf(
        "1. Which of the following is not a greenhouse gas?",
        "2. Which of the following is an excretory organ in humans?",
        "3. Which of the following structures is responsible for regulating the amount of light entering the eye?",
        "4. Which of the following is not a type of blood vessel?",
        "5. What is the process by which plants use sunlight, water, and carbon dioxide to produce glucose and oxygen?",
        "6. What is the process by which green plants prepare their own food called?",
        "7. Name the process by which water and minerals are absorbed by the roots of plants.",
        "8. What are the tiny pores on the surface of leaves called?",
        "9. Which hormone is responsible for growth and development in plants?",
        "10. Name the enzyme found in the saliva that breaks down starch into sugar.",
    )
    private val choices = listOf(
        listOf("A)Methane", "B)Nitrogen", "C)Water Vapour", "D)Carbondioxide"),
        listOf("A)Kidney", "B)Liver", "C)Lung", "D)Stomatch"),
        listOf("A)Cornea", "B)Lens", "C)Iris", "D)Retina"),
        listOf("A)Artery", "B)Vein", "C)Capillary", "D)Gland"),
        listOf("A)Fermentation", "B)Photosynthesis", "C)Cellular Respiration", "D)Glycolysis"),
        listOf("A) Respiration", "B) Photosynthesis", "C) Fermentation", "D) Transpiration"),
        listOf("A) Photosynthesis", "B) Transpiration", "C) Osmosis", "D) Active transport"),
        listOf("A) Stomata", "B) Cuticle", "C) Chloroplasts", "D) Mitochondria"),
        listOf("A) Insulin", "B) Testosterone", "C) Estrogen", "D) Auxin"),
        listOf("A) Protease", "B) Lipase", "C) Amylase", "D) Cellulase"),
    )
    private val showAnswer = listOf(
        "Water vapor is a greenhouse gas, but it is not considered a major contributor to the greenhouse effect.",
        "The kidneys are the primary excretory organs in humans, filtering waste products from the blood and producing urine.",
        "The iris controls the size of the pupil, which regulates the amount of light entering the eye.",
        "Glands are not a type of blood vessel.",
        "Photosynthesis is the process by which plants use sunlight, water, and carbon dioxide to produce glucose and oxygen.",
        "Photosynthesis is the process by which green plants prepare their own food.",
        "Osmosis is the process by which water and minerals are absorbed by the roots of plants.",
        "Stomata are the tiny pores on the surface of leaves through which gases are exchanged.",
        "Auxin is a hormone that promotes growth and development in plants.",
        "Amylase is the enzyme found in the saliva that breaks down starch into sugar.",
    )
    private val correctAnswers = listOf( 1, 0, 2, 3, 1 ,1, 3, 0, 3, 2)
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
        setContentView(R.layout.activity_biology)

        title = "Biology"

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
        val correctAnswer = choices[currentQuestionIndex][correctIndex]
        feedbackTextView.text = "The correct answer for question ${currentQuestionIndex + 1} is: $correctAnswer.\n\nDescription: ${showAnswer[currentQuestionIndex]}"
    }

    }

package com.example.qa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView

class Physics : AppCompatActivity() {


    private val questions = listOf(
        "1. What is the value of G?",
        "2. What is the SI unit of force?",
        "3. Which of the following is not a scalar quantity?",
        "4. Which of the following is a scalar quantity?",
        "5. Which of the following statements is true for the motion of an object moving with uniform velocity?",
        "6. What is the distance covered by a body in the first 2 seconds of free fall from rest?",
        "7. Which of the following statements is true for the image formed by a plane mirror?",
        "8. What is the relation between frequency and wavelength of a wave?",
        "9. Which of the following is a unit of power?",
        "10. Which of the following statements is true for the reflection of light from a rough surface?",
        "11. Which instrument is used to measure electric current?",
        "12. What is the unit of electric current?",
        "13. What is the unit of electric potential difference?",
        "14. Which law states that the current flowing through a conductor is directly proportional to the potential difference across it, provided the temperature and other physical conditions remain constant?",
        "15. What is the unit of resistance?",
        "16. Which device is used to measure resistance?",
        "17. Which law states that the resistance of a conductor is directly proportional to its length and inversely proportional to its cross-sectional area?",
        "18. Which material has zero resistance at very low temperatures?",
        "19. What is the unit of electric power?",
        "20. Which law states that the power dissipated by a resistor is equal to the product of the current passing through it and the potential difference across it?",
        "21. What is the SI unit of work and energy?",
        "22. Which law states that energy can neither be created nor destroyed but can only be converted from one form to another?",
        "23. What is the difference between kinetic energy and potential energy?",
        "24. What is the unit of force?",
        "25. What is Newton's first law of motion?",
        "26. What is Newton's second law of motion?",
        "27. What is Newton's third law of motion?",
        "28. What is the unit of momentum?",
        "29. What is the principle of conservation of momentum?",
        "30. What is the difference between elastic and inelastic collisions?",
        "31. What is the unit of acceleration?",
        "32. What is the difference between scalar and vector quantities?",
        "33. What is the unit of displacement?",
        "34. What is the unit of velocity?",
        "35. What is the difference between speed and velocity?",
        "36. What is the difference between distance and displacement?",
        "37. What is the unit of frequency?",
        "38. What is the difference between amplitude and wavelength?",
        "39. What is the unit of wavelength?",
        "40. What is the unit of frequency?",
//                "What is the principle of superposition?",
//                "What is the difference between transverse and longitudinal waves?",
//                "What is the difference between constructive and destructive interference?",
//                "What is the unit of pressure?",
//                "What is Pascal's law?",
//                "What is the difference between temperature and heat?",
//                "What is the difference between conduction and convection?",
//                "What is the unit of specific heat capacity?",
//                "What is the difference between latent heat and sensible heat?",
//                "What is the unit of latent heat?",
//                "What is the difference between nuclear fission and fusion?",
//                "What is the difference between alpha, beta, and gamma radiation?",
//                "What is the difference between a conductor and an insulator?",
//                "What is the difference between a series and parallel circuit?",
//                "What is the unit of capacitance?",
//                "What is the unit of inductance?",
//                "What is Faraday's law of electromagnetic induction?",
//                "What is the difference between a transformer and an inductor?",
//                "What is the difference between AC and DC circuits?",
//                "What is the unit of magnetic field strength?"
    )
    private val choices = listOf(
        listOf("6.67408 × 10-11 N m2 kg-2", "5.67408 × 10-11 N m2 kg-2", "7.67408 × 10-11 N m2 kg-2", "6.67408 × 10-10 N m2 kg-2"),
        listOf("Joule", "Newton", "Watt", "Hertz"),
        listOf("Time", "Force", "Speed", "Temperature"),
        listOf("Velocity", "Force", "Mass", "Acceleration"),
        listOf(" Its speed is constant but its direction may change.",
        "Its speed may change but its direction remains constant.",
            "Both its speed and direction remain constant.",
        " Neither its speed nor its direction remain constant."),
        listOf("5m", "10m", "15m", "20m"),
        listOf(" a) It is real and inverted.",
                "b) It is virtual and inverted",
                "c) It is real and erect",
                "d) It is virtual and erect."),
        listOf(" a) Frequency is directly proportional to wavelength.",
                "b) Frequency is inversely proportional to wavelength",
                "c) Frequency and wavelength are independent of each other.",
                "d) Frequency and wavelength are inversely proportional to each other."),
        listOf("volt", "ampere", "watt", "ohm"),
        listOf("a) The angle of incidence is equal to the angle of reflection.",
                "b) The reflected rays are parallel to each other.",
                "c) The reflection is diffuse and not regular.",
                "d) The intensity of the reflected light is equal to the intensity of the incident light."),
        listOf("A) Ammeter", "B) Voltmeter", "C) Ohmmeter", "D) Rheostat"),
        listOf("A) Joule", "B) Coulomb", "C) Ampere", "D) Watt",),
        listOf("A) Volt", "B) Watt", "C) Joule", "D) Coulomb"),
        listOf("A) Ohm's law", "B) Faraday's law", "C) Coulomb's law", "D) Kirchhoff's law"),
        listOf("A) Ohm B)", "Joule", "C) Coulomb", "D) Watt"),
        listOf("A) Ohmmeter", "B) Voltmeter", "C) Ammeter", "D) Galvanometer"),
        listOf("A) Ohm's law", "B) Coulomb's law", "C) Kirchhoff's law", "D) Faraday's law"),
        listOf("A) Superconductor", "B) Insulator", "C) Conductor", "D) Semiconductor"),
        listOf("A) Watt", "B) Joule", "C) Coulomb", "D) Volt"),
        listOf("A) Joule's law", "B) Kirchhoff's law", "C) Ohm's law", " D) Faraday's law"),
        listOf("A) Joule", "B) Watt", "C) Newton", "D) Kilogram"),
        listOf("A) Law of conservation of energy", "B) Law of conservation of momentum", "C) Law of conservation of charge", "D) Law of conservation of mass"),
        listOf("A) Kinetic energy is the energy of motion, while potential energy is the energy of position or state.", "B) Kinetic energy is the energy of position or state, while potential energy is the energy of motion. C) Kinetic energy and potential energy are the same thing. D) None of the above."),
        listOf("A) Newton", "B) Joule", "C) Watt", "D) Kilogram"),
        listOf("A) An object at rest tends to stay at rest, and an object in motion tends to stay in motion with the same speed and in the same direction, unless acted upon by an unbalanced force.", "B) The force acting on an object is equal to the mass of the object times its acceleration.", "C) For every action, there is an equal and opposite reaction.", "D) None of the above."),
        listOf("A) The force acting on an object is equal to the mass of the object times its acceleration.", "B) An object at rest tends to stay at rest, and an object in motion tends to stay in motion with the same speed and in the same direction, unless acted upon by an unbalanced force.", "C) For every action, there is an equal and opposite reaction.", "D) None of the above."),
        listOf("A) For every action, there is an equal and opposite reaction.", "B) An object at rest tends to stay at rest, and an object in motion tends to stay in motion with the same speed and in the same direction, unless acted upon by an unbalanced force.", "C) The force acting on an object is equal to the mass of the object times its acceleration.", "D) None of the above."),
        listOf("A) Kilogram-meter per second (kg·m/s)", "B) Joule-second (J·s)", "C) Newton-meter (N·m)", "D) Kilogram-meter squared per second (kg·m²/s)"),
        listOf("A) The principle of conservation of momentum states that the total momentum of a system remains constant if no external forces act on it.", "B) The principle of conservation of energy states that energy can neither be created nor destroyed but can only be converted from one form to another.", "C) The principle of conservation of charge"),
        listOf("A) Velocity", "B) Momentum", "C) Energy", "D) Force"),
        listOf("A) m/s^2", "B) m/s", "C) s/m", "D) m^2/s"),
        listOf("A) Distance and speed", "B) Energy and power", "C) Time and frequency", "D) Displacement and velocity"),
        listOf("A) m/s", "B) m", "C) s", "D) s/m"),
        listOf("A) m/s", "B) m", "C) s", "D) s/m"),
        listOf("A) Speed is a scalar quantity, while velocity is a vector quantity", "B) Velocity is a scalar quantity, while speed is a vector quantity", "C) They are both scalar quantities", "D) They are both vector quantities"),
        listOf("A) Distance is a vector quantity, while displacement is a scalar quantity",
                "B) Displacement is a vector quantity, while distance is a scalar quantity",
                "C) They are both vector quantities",
                "D) They are both scalar quantities"),
        listOf("A) Hz", "B) m/s", "C) m", "D) s"),
        listOf("A) Amplitude is the distance between two peaks of a wave, while wavelength is the height of a wave\n" +
                "B) Amplitude is the height of a wave, while wavelength is the distance between two peaks of a wave\n" +
                "C) They are the same thing",
                "D) They are unrelated quantities"),
        listOf("A) m", "B) Hz", "C) s", "D) m/s"),
        listOf("A) Hz", "B) m/s", "C) m", "D) s"),
        listOf("A) When two waves meet, their amplitudes add together",
                "B) When two waves meet, their wavelengths add together",
                "C) When two waves meet, they cancel each other out",
                "D) When two waves meet, their energies add together"),
        listOf("A) Transverse waves are waves that vibrate perpendicular to the direction of wave motion, while longitudinal waves vibrate parallel to the direction of wave motion",
                "B) Transverse waves are waves that vibrate parallel to the direction of wave motion, while longitudinal waves vibrate perpendicular to the direction of wave motion",
                "C) They are the same thing",
                "D) They are unrelated quantities"),
        listOf("A) Constructive interference occurs when two waves meet and their amplitudes add together, while destructive interference occurs when two waves meet and their amplitudes cancel each other out",
                "B) Constructive interference occurs when two waves meet and their wavelengths add together, while destructive interference occurs when two waves meet and their wavelengths cancel each other out",
                "C) They are the same thing",
                "D) They are unrelated quantities"),
        listOf("A) Pascal (Pa)", "B) Newton (N)", "C) Joule (J)", "D) Watt (W)"),
        listOf("A) Pressure exerted on a fluid is transmitted equally in all directions throughout the fluid",
                "B) Pressure exerted on a fluid is transmitted only in the direction of the force applied",
                "C) Pressure exerted on a fluid is transmitted in a random pattern throughout the fluid",
                "D) Pressure exerted on a fluid is transmitted inversely proportional to the force applied"),
//        listOf(""),
    )
    private val showAnswer = listOf(
        "This answer refers to the gravitational constant, denoted by G, which is a fundamental constant of physics that represents the strength of the gravitational force between two objects.G is the gravitational constant, and its value is approximately 6.674 x 10^-11 Nm^2/kg^2.",
        "This answer identifies the SI unit of force as the Newton (N), named after Sir Isaac Newton, which is defined as the force required to accelerate a mass of one kilogram at a rate of one meter per second squared.",
        "This answer defines a scalar quantity as a physical quantity that has only magnitude and no direction, and identifies the option that is not a scalar quantity.",
        "This answer identifies the option that represents a scalar quantity, as opposed to a vector quantity which has both magnitude and direction.",
        "This answer explains the characteristics of uniform velocity, which occurs when an object moves at a constant speed and in a straight line, and provides a true statement about this type of motion.",
        "This answer uses the equations of motion to calculate the distance covered by a falling object in the first two seconds of free fall from rest.",
        "This answer describes the properties of images formed by plane mirrors, including their size, orientation, and distance from the mirror.",
        "This answer explains the relationship between the frequency and wavelength of a wave, which is described by the wave equation.",
        "This answer identifies a unit of power, which is the rate at which work is done, and provides the definition of the unit.",
        "This answer explains the differences between the reflection of light from smooth and rough surfaces, and provides a true statement about the reflection of light from a rough surface.",
        "This answer identifies the instrument used to measure electric current, called an ammeter.",
        "This answer identifies the SI unit of electric current as the Ampere (A), which is defined as the rate of flow of electric charge.",
        "This answer identifies the SI unit of electric potential difference as the Volt (V), which is defined as the energy required to move a unit of electric charge between two points.",
        "This answer identifies Ohm's law, which relates the current flowing through a conductor to the potential difference across it, and explains the conditions under which it holds.",
        "This answer identifies the unit of electrical resistance as the Ohm (Ω), named after Georg Simon Ohm, which is defined as the ratio of potential difference to current.",
        "This answer identifies the instrument used to measure electrical resistance, called an Ohmmeter.",
        "The law that states that the resistance of a conductor is directly proportional to its length and inversely proportional to its cross-sectional area is called the Ohm's law.",
        "Superconductors have zero resistance at very low temperatures.",
        "The unit of electric power is Watt (W).",
        "The law that states that the power dissipated by a resistor is equal to the product of the current passing through it and the potential difference across it is called the Joule's law.",
        "The SI unit of work and energy is Joule (J).",
        "The law that states that energy can neither be created nor destroyed but can only be converted from one form to another is called the law of conservation",
        "Kinetic energy is the energy possessed by a moving object due to its motion, while potential energy is the energy possessed by an object due to its position or configuration.",
        "The unit of force is Newton (N) in the SI system.",
        "Newton's first law of motion, also known as the law of inertia, states that an object at rest will remain at rest, and an object in motion will remain in motion with a constant velocity, unless acted upon by a net external force.",
        "Newton's second law of motion states that the acceleration of an object is directly proportional to the net external force applied to it, and inversely proportional to its mass. This law can be expressed mathematically as F=ma, where F is the net external force, m is the mass of the object, and a is the acceleration produced.",
        "Newton's third law of motion states that for every action, there is an equal and opposite reaction. This means that when one object exerts a force on another object, the second object will exert an equal and opposite force back on the first object.",
        "The unit of momentum is kg m/s in the SI system.",
        "The principle of conservation of momentum states that the total momentum of an isolated system of objects is conserved, meaning that the total momentum before a collision or interaction is equal to the total momentum after the collision or interaction.",
        "In an elastic collision, the total kinetic energy of the colliding objects is conserved, while in an inelastic collision, some of the kinetic energy is lost and converted into other forms of energy, such as heat or sound.",
        "The unit of acceleration is m/s^2 in the SI system.",
        "Scalar quantities have only magnitude, while vector quantities have both magnitude and direction.",
        "The unit of displacement is meter (m) in the SI system.",
        "The unit of velocity is meter per second (m/s) in the SI system.",
        "Speed is a scalar quantity that refers to how fast an object is moving, while velocity is a vector quantity that refers to both the speed and direction of an object's motion.",
        "Distance is the total length of the path traveled by an object, while displacement is the change in position of an object from its initial position to its final position, measured in a straight line.",
        "The unit of frequency is Hertz (Hz) in the SI system.",
        "Amplitude is the maximum displacement of a wave from its equilibrium position, while wavelength is the distance between two consecutive points on a wave that are in phase.",
        "The unit of wavelength is meter (m) in the SI system.",
        "The unit of frequency is Hertz (Hz) in the SI system."

    )
    private val correctAnswers = listOf(0, 1, 1, 0, 2, 1, 3, 1, 2, 2, 2, 1, 0, 2, 3, 1, 1, 0, 1, 0, 2, 0, 1, 2, 0, 1, 2, 3, 2, 0, 1, 3, 0, 2, 1, 2, 3, )
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
        setContentView(R.layout.activity_physics2)

        title = "Physics"

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
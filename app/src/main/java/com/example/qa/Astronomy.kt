package com.example.qa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView

class Astronomy : AppCompatActivity() {


    private val questions = listOf(
        "1. What is the largest planet in our solar system?",
        "2. What is the process by which stars generate energy?",
        "3. Which planet in our solar system is known for its rings?",
        "4. What is the name of the galaxy that contains our solar system?",
        "5. What is the name of our galaxy?",
        "6. Which planet is known as the Red Planet?",
        "7. What is the name of the largest moon in our solar system?",
        "8. What is the name of the nearest star to our solar system?",
        "9.  What is the name of the largest planet in our solar system?",
        "10. What is the name of the brightest star in the night sky?",
        "11. What is the name of the force that holds planets in orbit around the sun?",
        "12. What is the name of the event that occurs when the moon passes between the sun and the earth?",
        "13. What is the name of the phenomenon that occurs when a meteor enters the earth's atmosphere?",
        "14. What is the name of the point in space beyond which no matter or radiation can escape?",
        "15. What is the name of the process by which a star produces energy?",
        "16. What is the name of the phenomenon that occurs when a star explodes?",
        "17. What is the name of the phenomenon that occurs when a star collapses to form a black hole?",
        "18. What is the name of the belt of asteroids that lies between Mars and Jupiter?",
        "19. What is the name of the process by which a planet reflects light from the sun?",
        "20. What is the name of the largest volcano in our solar system?",
        "21. What is the name of the phenomenon that occurs when a planet appears to move backwards in its orbit?",
        "22. What is the name of the force that causes tides on earth?",
        "23. What is the name of the group of stars that form a recognizable pattern?",
        "24. What is the name of the process by which a planet or moon passes in front of a star?",
        "25. What is the name of the spacecraft that was launched by NASA to study Jupiter and its moons?",
        "26. What is the name of the spacecraft that was launched by NASA to study Saturn and its moons?",
        "27. What is the name of the spacecraft that was launched by NASA to study Pluto and the Kuiper Belt?",
        "28. What is the name of the phenomenon that occurs when the earth's magnetic field is disrupted by solar wind?",
        "29. What is the name of the telescope that was launched into space by NASA in 1990?",
        "30. What is the name of the largest telescope on earth?",
        "31. What is the name of the astronomer who first proposed the heliocentric model of the solar system?",
        "32. What is the name of the astronomer who discovered the four largest moons of Jupiter?",
        "33. What is the name of the astronomer who proposed the three laws of planetary motion?",
        "34. What is the name of the space mission that first landed humans on the moon?",
    )
    private val choices = listOf(
        listOf("A)Jupiter", "B)Saturn", "C)Neptune", "D)Uranus"),
        listOf("A)Nuclear Fusion", "B)Nuclear Fission", "C)Chemical", "D)Electromagnetic"),
        listOf("A)Jupiter", "B) Saturn", "C)Neptune", "D)Uranus"),
        listOf("A)Andromeda", "B) Sombrero Galaxy", "C)Milky Way galaxy", "D)Black eye galaxy"),
        listOf("A) Andromeda", "B) Milky Way", "C) Triangulum", "D) Sirus"),
        listOf("A) Jupiter", "B) Saturn", "C) Mars", "D) Earth"),
        listOf("A) Gyanamide", "B) Moon", "C) Phobos" ),
        listOf("A) Sirius", "B) Alpha Centauri", "C) Proxima Centauri", "D) Betelgeuse"),
        listOf("A) Saturn", "B) Jupiter", "C) Uranus", "D) Neptune"),
        listOf("A) Polaris", "B) Sirius", "C) Vega", "D) Betelgeuse"),
        listOf("A) Gravity", "B) Magnetism", "C) Electromagnetism", "D) Radiation pressure"),
        listOf("A) Solar eclipse", "B) Lunar eclipse", "C) Asteroid impact", "D) Comet sighting"),
        listOf("A) Meteor impact", "B) Meteor shower", "C) Shooting star", "D) Meteorite"),
        listOf("A) Event horizon", "B) Singularity", "C) Pulsar", "D) Quasar"),
        listOf("A) Fusion",  "B) Fission",  "C) Combustion", "D) Radiation"),
        listOf("A) Black hole", "B) White dwarf", "C) Supernova", "D) Nebula"),
        listOf("A) Supernova", "B) Neutron star", "C) Black dwarf", "D) Singularity"),
        listOf("A) Kuiper Belt", "B) Asteroid Belt", "C) Oort Cloud", "D) Scattered Disc"),
        listOf("A) Absorption", "B) Refraction", "C) Reflection", "D) Diffraction"),
        listOf("A) Olympus Mons", "B) Mauna Kea", "C) Mount Everest", "D) Mount St. Helens"),
        listOf("A) Retrograde motion", "B) Prograde motion", "C) Sidereal motion", "D) Diurnal motion"),
        listOf("A) Gravitational force", "B) Magnetic force", "C) Centrifugal force", "D) Coriolis force"),
        listOf("A) Galaxy", "B) Nebula", "C) Constellation", "D) Cluster"),
        listOf("A) Transit", "B) Occultation", "C) Eclipse", "D) Retrograde motion"),
        listOf("A) Voyager 1", "B) Cassini", "C) Juno", "D) New Horizons"),
        listOf("A) Voyager 2", "B) Galileo", "C) Pioneer 10", "D) H"),
        listOf("A) Pioneer 10", "B) New Horizons", "C) Voyager 2", "D) Juno"),
        listOf("A) Solar flare", "B) Solar wind", "C) Aurora", "D) Magnetosphere"),
        listOf("A) Hubble Space Telescope", "B) Chandra X-ray Observatory", "C) Spitzer Space Telescope", "D) James Webb Space Telescope"),
        listOf("A) Keck Telescope", "B) Very Large Telescope", "C) Subaru Telescope", "D) Gran Telescopio Canarias"),
        listOf("A) Johannes Kepler", "B) Tycho Brahe", "C) Galileo Galilei", "D) Nicolaus Copernicus"),
        listOf("A) Galileo Galilei", "B) Johannes Kepler", "C) Tycho Brahe", "D) Nicolaus Copernicus"),
        listOf("A) Tycho Brahe", "B) Galileo Galilei", "C) Johannes Kepler", "D) Nicolaus Copernicus"),
        listOf("A) Apollo 11", "B) Voyager 2", "C) Hubble Space Telescope", "D) Juno"),
    )
    private val showAnswer = listOf(
        "Jupiter - Jupiter is the largest planet in our solar system, with a diameter of approximately 86,881 miles.",
        "Nuclear fusion - Stars generate energy through the process of nuclear fusion, where hydrogen atoms are fused together to form helium and release energy.",
        "Saturn - Saturn is known for its extensive and complex ring system, made up of thousands of individual ringlets.",
        "Milky Way - The Milky Way is the name of the galaxy that contains our solar system. It is a barred spiral galaxy approximately 100,000 light-years in diameter.",
        "Milky Way - Our galaxy is called the Milky Way, named after the band of light seen in the night sky that is caused by the concentration of stars and other celestial objects in our galaxy's disk.",
        "Mars - Mars is known as the Red Planet due to its reddish appearance in the night sky caused by iron oxide (rust) on its surface.",
        "Ganymede - Ganymede is the largest moon in our solar system, with a diameter of approximately 3,273 miles.",
        "Proxima Centauri - Proxima Centauri is the nearest star to our solar system, located approximately 4.24 light-years away in the Alpha Centauri star system.",
        "Jupiter - Jupiter is the largest planet in our solar system, with a diameter of approximately 86,881 miles.",
        " Sirius - Sirius is the brightest star in the night sky, with an apparent magnitude of -1.46.",
        "Gravity - Gravity is the force that holds planets in orbit around the sun.",
        "Solar eclipse - A solar eclipse is an event that occurs when the moon passes between the sun and the earth, blocking the sun's light and casting a shadow on the earth.",
        "Meteor shower - A meteor entering the earth's atmosphere causes a phenomenon known as a meteor shower, where multiple meteors can be seen streaking across the sky.",
        "Event horizon - The point in space beyond which no matter or radiation can escape is called the event horizon, typically referring to the event horizon of a black hole.",
        "Nuclear fusion - Stars produce energy through the process of nuclear fusion, where hydrogen atoms are fused together to form helium and release energy.",
        "Supernova - A supernova is a phenomenon that occurs when a star explodes, producing an incredibly bright burst of energy and leaving behind a remnant such as a neutron star or black hole.",
        "Black hole - When a massive star collapses under the force of gravity, it can form a black hole, a region of space where the gravitational pull is so strong that nothing, not even light, can escape.",
        "Asteroid belt - The asteroid belt is a region of space between Mars and Jupiter where most of the asteroids in our solar system are located.",
        "Reflection - Planets reflect light from the sun through a process called reflection, where light waves bounce off the planet's surface and are redirected towards our eyes.",
        "Olympus Mons - Olympus Mons is the largest volcano in our solar system, located on the surface of Mars and standing approximately 13.6 miles tall.",
        "Retrograde motion - Retrograde motion is a phenomenon where a planet appears to move backwards in its orbit when viewed from Earth.",
        "Gravitational force - The gravitational force between the earth and the moon causes tides on earth, as the moon's gravitational pull causes the water in the oceans to bulge and create a tidal bulge.",
        "Constellation - A group of stars that form a recognizable pattern is called a constellation, and these patterns have been named and identified by astronomers for centuries.",
        "Transit - A transit is a phenomenon where a planet or moon passes in front of a star, blocking some of the star's light and",
        "The spacecraft that was launched by NASA to study Jupiter and its moons is called the Juno spacecraft. It was launched in 2011 and arrived at Jupiter in 2016. Its mission is to study the planet's composition, gravity field, magnetic field, and polar magnetosphere.",
        "The spacecraft that was launched by NASA to study Saturn and its moons is called the Cassini spacecraft. It was launched in 1997 and arrived at Saturn in 2004. Its mission was to study the planet's atmosphere, rings, and moons, including Titan, one of the largest moons in the solar system.",
        "The spacecraft that was launched by NASA to study Pluto and the Kuiper Belt is called the New Horizons spacecraft. It was launched in 2006 and arrived at Pluto in 2015. Its mission was to study the dwarf planet and its five moons, as well as the Kuiper Belt, a region of icy objects beyond Neptune's orbit.",
        "The name of the phenomenon that occurs when the earth's magnetic field is disrupted by solar wind is called a geomagnetic storm. These storms can cause auroras, disrupt communication and navigation systems, and even damage power grids.",
        " The name of the telescope that was launched into space by NASA in 1990 is the Hubble Space Telescope. It has been used to observe and study a wide range of celestial objects, including planets, stars, galaxies, and black holes.",
        "The name of the largest telescope on earth is the Gran Telescopio Canarias (GTC), located on the island of La Palma in the Canary Islands, Spain. It has a primary mirror that is 10.4 meters in diameter and is used for a wide range of astronomical observations.",
        "The name of the astronomer who first proposed the heliocentric model of the solar system is Nicolaus Copernicus. He published his book \"On the Revolutions of the Heavenly Spheres\" in 1543, in which he proposed that the planets orbit the sun, rather than the earth.",
        "The name of the astronomer who discovered the four largest moons of Jupiter is Galileo Galilei. He observed these moons, now known as the Galilean moons, through a telescope in 1610 and named them Io, Europa, Ganymede, and Callisto.",
        "The name of the astronomer who proposed the three laws of planetary motion is Johannes Kepler. His laws, published between 1609 and 1619, describe the motion of planets around the sun and are fundamental to our understanding of orbital mechanics.",
        "The space mission that first landed humans on the moon is called Apollo 11. It was launched by NASA on July 16, 1969 and successfully landed astronauts Neil Armstrong and Edwin \"Buzz\" Aldrin on the moon on July 20, 1969. This historic event marked the first time humans had set foot on another celestial body, and it remains one of the greatest achievements in the history of space exploration."
    )
    private val correctAnswers = listOf(0,0,1,2,1,2,0,2,1,1,0,0,2,0,0,2,3,1,2,0,0,0,2,0,2,1,1,2,0,3,3,0,2,0)
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
        setContentView(R.layout.activity_astronomy)

        title = "Astronomy"

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
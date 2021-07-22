package com.example.singaporee

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.ProgressBar
import android.widget.TextView
import android.widget.Toast
import android.widget.Toolbar
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.action_bar.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.concurrent.thread

class MainActivity : AppCompatActivity() {
    var score  = 0
    private val questions = listOf(
        "1.London qay ma'mlekettin' paytaxti?",
        "2.Londonda bu'gingi ku'nde qansha xaliq o'mir su'redi?",
        "3.Angliyanin' ana tili qay til?",
        "4.Londonda neshe Aeraport bar?",
        "5.Qizil ren'li eki etajli avtobusqa bilet qalay alinadi?",
        "6.Londondag'i en' ataqli " +
                "sag'at ne dep ataladi"
    )
    private val answers = listOf(
        listOf("Angliya", "Franciya", "America", "Italiya"),
        listOf("8,2 mln", "10mln", "8 mln", "10,2mln"),
        listOf("English", "Rus", "American", "Italiyan"),
        listOf("4", "3", "6", "5"),
        listOf("Kassadan alinadi",
            "avtobustin ishinde alinadi",
            "Aqshalay beriledi heshqanday biletsiz",
            "Astanovkadan bilet satip alinadi"
        ),
        listOf("Bigban", "Bodren", "Bigbon", "Saat")
    )
    private val rightAnswers =
        listOf("Angliya", "8,2 mln", "English", "5", "Astanovkadan bilet satip alinadi", "Bigban")
    var k = 0
    private  var progressBar: ProgressBar? = null
    private var txtView: TextView? = null
    private  val handler = Handler()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        showQuestion(k)
        tvTheme.text = "Soraw aynasi"
        tvUsername.text = "Aygerimka"
        kScore.text = score.toString()

        progressBar = findViewById<ProgressBar>(R.id.progresBar) as ProgressBar
        k = progressBar!!. progress
        when(k<6) {
            k += 1
        }


        ansA.setOnClickListener {
            juwapSaylandi(k, ansA.text.toString())
            k++
            showQuestion(k)
        }
        ansB.setOnClickListener {
            juwapSaylandi(k, ansB.text.toString())
            k++
            showQuestion(k)
        }
        ansC.setOnClickListener {
            juwapSaylandi(k, ansC.text.toString())
            k++
            showQuestion(k)
        }
        ansD.setOnClickListener {
            juwapSaylandi(k, ansD.text.toString())
            k++
            showQuestion(k)
        }
    }

    fun juwapSaylandi(t: Int, ans: String) {
        if (ans == rightAnswers[t]) {
            toastShigar("Duris")
            score++
        } else toastShigar("Qate")
    }

    fun showQuestion(i: Int) {
        if (i < 6) {
            when (i) {
                0 -> {
                    tvQuestion.text = questions[i]
                    ansA.text = answers[i][0]
                    ansB.text = answers[i][1]
                    ansC.text = answers[i][2]
                    ansD.text = answers[i][3]

                }
                1 -> {
                    tvQuestion.text = questions[i]
                    ansA.text = answers[i][0]
                    ansB.text = answers[i][1]
                    ansC.text = answers[i][2]
                    ansD.text = answers[i][3]
                }
                2 -> {
                    tvQuestion.text = questions[i]
                    ansA.text = answers[i][0]
                    ansB.text = answers[i][1]
                    ansC.text = answers[i][2]
                    ansD.text = answers[i][3]
                }
                3 -> {
                    tvQuestion.text = questions[i]
                    ansA.text = answers[i][0]
                    ansB.text = answers[i][1]
                    ansC.text = answers[i][2]
                    ansD.text = answers[i][3]
                }
                4 -> {
                    tvQuestion.text = questions[i]
                    ansA.text = answers[i][0]
                    ansB.text = answers[i][1]
                    ansC.text = answers[i][2]
                    ansD.text = answers[i][3]
                }
                5 -> {
                    tvQuestion.text = questions[i]
                    ansA.text = answers[i][0]
                    ansB.text = answers[i][1]
                    ansC.text = answers[i][2]
                    ansD.text = answers[i][3]
                }
            }

        }
        else{
            val intent = Intent(this, songiActivity::class.java)
            intent.putExtra("score", score)
            startActivity(intent)
             finish()
        }

}

    fun toastShigar(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_LONG).show()
    }
}
}


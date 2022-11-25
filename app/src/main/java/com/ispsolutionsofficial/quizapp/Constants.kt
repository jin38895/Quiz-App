package com.ispsolutionsofficial.quizapp

import java.util.*

object Constants {

    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getQuestions():ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        val que1 = Question(
            1, "What country is this?",
            R.drawable.ic_flag_of_argentina,
            "Argentina", "Australia", "Armenia", "Austria", 1
        )
        val que2 = Question(
            2, "What country is this?",
            R.drawable.ic_flag_of_australia,
            "Argentina", "Australia", "Armenia", "Austria", 2
        )
        val que3 = Question(
            3, "What country is this?",
            R.drawable.ic_flag_of_belgium,
            "Argentina", "Australia", "Armenia", "Belgium", 4
        )
        val que4 = Question(
            4, "What country is this?",
            R.drawable.ic_flag_of_brazil,
            "Argentina", "Brazil", "Armenia", "Austria", 2
        )
        val que5 = Question(
            5, "What country is this?",
            R.drawable.ic_flag_of_denmark,
            "Argentina", "Australia", "Denmark", "Austria", 3
        )
        val que6 = Question(
            6, "What country is this?",
            R.drawable.ic_flag_of_fiji,
            "Argentina", "Australia", "Fiji", "Austria", 3
        )
        val que7 = Question(
            7, "What country is this?",
            R.drawable.ic_flag_of_germany,
            "Germany", "Australia", "Armenia", "Austria", 1
        )
        val que8 = Question(
            8, "What country is this?",
            R.drawable.ic_flag_of_india,
            "Argentina", "Australia", "Armenia", "India", 4
        )
        val que9 = Question(
            9, "What country is this?",
            R.drawable.ic_flag_of_kuwait,
            "Argentina", "Kuwait", "Armenia", "Austria", 2
        )
        val que10 = Question(
            10, "What country is this?",
            R.drawable.ic_flag_of_new_zealand,
            "Argentina", "Australia", "Armenia", "New Zealand", 4
        )
        questionsList.addAll(listOf(que1,que2,que3,que4,que5,que6,que7,que8,que9,que10))
        return questionsList
    }
}
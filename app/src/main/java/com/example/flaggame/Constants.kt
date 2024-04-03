package com.example.flaggame

object Constants {

    fun getQuestion() : ArrayList<Question>{

        val questionsList = ArrayList<Question>()

        val que1 = Question(1,
            "what football club is this?",
            R.drawable.realmadrid,
        "Real Madrid",
            "Chelsea",
            "Manchesther City", "Bayern Munchen",
            1)



        val que2 = Question(2,
            "what football club is this?", R.drawable.atm,
            "Manchesther United",
            "Atletico Madrid",
            "Chelsea",
            "Arsenal",
            2)


        val que3 = Question(3,
            "what football club is this?", R.drawable.bvb,
            "Al-Nassr",
            "Dortmund",
            "Al-Hilal",
            "Juventus",
            2)


        val que4 = Question(4,
            "what football club is this?", R.drawable.sevilla,
            "Bayern Munchen",
            "Sevilla",
            "Juventus",
            "PSG",
            2)


        val que5 = Question(5,
            "what football club is this?", R.drawable.barcelona,
            "Liverpool",
            "Barcelona",
            "Ac Milan",
            "PSG",
            2)


        val que6 = Question(6,
            "what football club is this?", R.drawable.acm,
            "Liverpool",
            "PSG",
            "Juventus",
            "Ac Milan",
            4)


        val que7 = Question(7,
            "what football club is this?", R.drawable.juve,
            "Juventus",
            "Ac Milan",
            "Manchesther City",
            "Manchesther United",
            1)


        val que8 = Question(8,
            "what football club is this?", R.drawable.inter,
            "Arsenal",
            "PSG",
            "liverpool",
            "Inter Milan",
            4)


        val que9 = Question(9,
            "what football club is this?", R.drawable.rbt,
            "Arsenal",
            "PSG",
            "Real Betis",
            "Bayern Munchen",
            3)


        val que10 = Question(10,
            "what football club is this?", R.drawable.napoli,
            "Napoli",
            "Chelsea",
            "Aston Villa",
            "Newcastle United",
            1)


        questionsList.add(que1)
        questionsList.add(que2)
        questionsList.add(que3)
        questionsList.add(que4)
        questionsList.add(que5)
        questionsList.add(que6)
        questionsList.add(que7)
        questionsList.add(que8)
        questionsList.add(que9)
        questionsList.add(que10)




        return questionsList
    }

}
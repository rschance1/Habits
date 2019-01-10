package habits.greencountrymedia.com.habits

import android.graphics.Bitmap

data class Habit(val title: String, val description: String, val image: Bitmap)

//fun getSampleHabits(): List<Habit> {
//    return listOf(
//        Habit("Go for a walk",
//            "A nice walk in the sun get you ready for the day ahead",
//            R.drawable.walk),
//        Habit("Drink some water",
//            "A refreshing glass of water keeps you hydrated",
//            R.drawable.water)
//    )
//}
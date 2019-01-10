package habits.greencountrymedia.com.habits

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.single_card.view.*

class HabitsAdapter(val habits: List<Habit>) : RecyclerView.Adapter<HabitsAdapter.HabitViewHolder>() {


    class HabitViewHolder(val card: View) : RecyclerView.ViewHolder(card)

    //specifies the content for the specified item/habit
    override fun onBindViewHolder(holder: HabitViewHolder, index: Int) {
        if (holder != null) {
            val habit = habits[index]
            holder.card.tv_title.text = habit.title
            holder.card.tv_description.text = habit.description
            holder.card.iv_icon.setImageBitmap(habit.image)

        }

    }

    //create a new viewholder
    override fun onCreateViewHolder(parent: ViewGroup, position: Int): HabitViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.single_card, parent, false)

        return HabitViewHolder(view)
    }

    override fun getItemCount() = habits.size


}
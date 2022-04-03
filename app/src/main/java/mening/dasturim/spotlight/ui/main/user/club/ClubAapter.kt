package mening.dasturim.spotlight.ui.main.user.club

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import mening.dasturim.spotlight.R
import mening.dasturim.spotlight.ui.data.model.ClubItems

class ClubAapter() : RecyclerView.Adapter<ClubAapter.VH>() {
    lateinit var arrayList: ArrayList<ClubItems>
    var onItemClick: ((ClubItems) -> Unit)? = null

    fun setData(list : ArrayList<ClubItems>){
        this.arrayList = list
        notifyDataSetChanged()
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
        val binding = LayoutInflater.from(parent.context)
        val view=binding.inflate(R.layout.item_club,parent,false)
        return VH(view)
    }

    override fun onBindViewHolder(holder: VH, position: Int) {

        holder.tvName.setText(arrayList[position].name)

        holder.itemView.setOnClickListener {
            onItemClick?.invoke(arrayList[position])
        }
    }

    override fun getItemCount() =arrayList.size

    class VH(item: View): RecyclerView.ViewHolder(item){
        val tvName = item.findViewById<TextView>(R.id.tv_club)
    }
}
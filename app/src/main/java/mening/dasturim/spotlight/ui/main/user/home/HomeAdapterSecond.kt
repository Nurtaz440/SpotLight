package mening.dasturim.spotlight.ui.main.user.home

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import mening.dasturim.spotlight.R
import mening.dasturim.spotlight.ui.data.model.FlowersItem

class HomeAdapterSecond(val context: Context) : RecyclerView.Adapter<HomeAdapterSecond.ItemViewHolder>() {
    lateinit var arrayList: ArrayList<FlowersItem>

    fun setData(list : ArrayList<FlowersItem>){
        this.arrayList = list
        notifyDataSetChanged()
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val binding = LayoutInflater.from(parent.context)
        val view=binding.inflate(R.layout.item_rv2,parent,false)
        return ItemViewHolder(view)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {

        Glide.with(context).load(arrayList[position].image).into(holder.image)
        holder.tvName.setText(arrayList[position].name!!)

    }

    override fun getItemCount() =arrayList.size

    class ItemViewHolder(item: View): RecyclerView.ViewHolder(item){
        val image = item.findViewById<ImageView>(R.id.iv_flower)
        val tvName = item.findViewById<TextView>(R.id.tv_flname)
    }
}
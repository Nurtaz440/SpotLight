package mening.dasturim.spotlight.ui.main.user.home

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.Glide.init
import mening.dasturim.spotlight.R
import mening.dasturim.spotlight.ui.data.model.FlowersItem

class HomeAdapter(val context:Context) : RecyclerView.Adapter<HomeAdapter.VH>() {
    lateinit var arrayList: ArrayList<FlowersItem>
    var onItemClick: ((FlowersItem) -> Unit)? = null

    fun setData(list : ArrayList<FlowersItem>){
        this.arrayList = list
        notifyDataSetChanged()
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
        val binding = LayoutInflater.from(parent.context)
        val view=binding.inflate(R.layout.item_rv1,parent,false)
        return VH(view)
    }

    override fun onBindViewHolder(holder: VH, position: Int) {

        Glide.with(context).load(arrayList[position].image).into(holder.image)
        holder.tvName.setText(arrayList[position].name!!)

            holder.itemView.setOnClickListener {
                onItemClick?.invoke(arrayList[position])
            }
    }

    override fun getItemCount() =arrayList.size

    class VH(item: View):RecyclerView.ViewHolder(item){



        val image = item.findViewById<ImageView>(R.id.iv_flower)
        val tvName = item.findViewById<TextView>(R.id.tv_name)
    }
}
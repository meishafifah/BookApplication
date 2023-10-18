package com.example.meishaapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class AdapterResp(private val listResp :List<RespModel>):
    RecyclerView.Adapter<AdapterResp.ViewHolder>(){
    class ViewHolder(ItemView:View):RecyclerView.ViewHolder(ItemView){
        val image:ImageView = itemView.findViewById(R.id.imageResp)
        val title:TextView = itemView.findViewById(R.id.textTitleResp)
        val desc:TextView = itemView.findViewById(R.id.textDescResp)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AdapterResp.ViewHolder {
        val view =  LayoutInflater.from(parent.context).inflate(
            R.layout.card_layout_responsi,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: AdapterResp.ViewHolder, position: Int) {
        val modelResp = listResp[position]

        holder.image.setImageResource(modelResp.image)
        holder.title.text = modelResp.title
        holder.desc.text = modelResp.desc
    }

    override fun getItemCount(): Int {
        return listResp.size
    }
}
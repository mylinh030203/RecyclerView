package com.example.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.layout_item.view.*

class rvAdapter(var list:List<PhongCanh>, val onClickPhongCanh: rvInterface):RecyclerView.Adapter<rvAdapter.PhongCanhViewHolder>() {
    inner class PhongCanhViewHolder(itemView: View):RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PhongCanhViewHolder {
        //chuyển từ layout_item từ layout xml sang view
       val view = LayoutInflater.from(parent.context).inflate(R.layout.layout_item,parent,false)
        return PhongCanhViewHolder(view)
    }

    override fun onBindViewHolder(holder: PhongCanhViewHolder, position: Int) {
        holder.itemView.apply {
            tvName.text =list[position].name
            tvDes.text = list[position].name
            img.setImageResource(list.get(position).img)

            //itemclick chọn
            holder.itemView.setOnClickListener{
                onClickPhongCanh.onClickPhongCanh(position)
            }
        }
    }

    override fun getItemCount(): Int {
        return list.size
    }
}
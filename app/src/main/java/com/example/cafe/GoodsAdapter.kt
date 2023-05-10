package com.example.cafe

import android.renderscript.ScriptGroup.Binding
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.cafe.databinding.ItemGoodBinding

class GoodsAdapter(private val goods: List<GoodModel>): RecyclerView.Adapter<GoodsAdapter.GoodHolder>() {

    class GoodHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val binding = ItemGoodBinding.bind(itemView)

        fun bind(good: GoodModel) = with(binding){
            Glide.with(itemView.context).load(good.url).into(img)
            //img.setImageResource(good.img)
            goodName.text = good.name
            price.text = good.price.toString()
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GoodsAdapter.GoodHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_good, parent, false)
        return GoodHolder(view)
    }

    override fun onBindViewHolder(holder: GoodsAdapter.GoodHolder, position: Int) {
        holder.bind(goods[position])
    }

    override fun getItemCount(): Int {
        return goods.size
    }

}
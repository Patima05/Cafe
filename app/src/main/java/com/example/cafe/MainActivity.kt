package com.example.cafe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Layout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.LayoutManager
import com.example.cafe.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        init()
    }
    fun init(){
        val listGoods = mutableListOf<GoodModel>()
        val recV: RecyclerView = binding.recView
        recV.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        for (i in 0 .. 4){
            listGoods.add(GoodModel(R.drawable.pancake, "Блины с ягодами и сгущенкой", 300))
            listGoods.add(GoodModel(R.drawable.roll_cezar,"Цезарь ролл", 350))
            listGoods.add(GoodModel(R.drawable.sandvich,"Американский сэндвич с тунцом", 150))
        }
        recV.adapter = GoodsAdapter(listGoods)
    }
}
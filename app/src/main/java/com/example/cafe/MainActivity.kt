package com.example.cafe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
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
            listGoods.add(GoodModel("Блины с ягодами и сгущенкой", 300, "https://vkusnoclub.ru/vypechka/bliny/pyshnye-zavarnye-bliny-s-yagodami-i-sguschenkoi/pyshnye-zavarnye-bliny-s-yagodami-i-sguschenkoi-ready0-retsept.jpg"))
            listGoods.add(GoodModel("Цезарь ролл", 350, "https://static.1000.menu/res/640/img/content-v2/c4/42/16224/cezar-roll-s-kuricei_1590045640_16_max.jpg"))
            listGoods.add(GoodModel("Американский сэндвич с тунцом", 150, "https://premiya.ua/img/recipes/recipe2_main.jpg"))
        }
        recV.adapter = GoodsAdapter(listGoods)
    }
}
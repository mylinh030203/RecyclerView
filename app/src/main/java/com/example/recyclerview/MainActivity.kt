package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridLayout
import android.widget.LinearLayout
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //tạo danh sách
        var list = mutableListOf<PhongCanh>()
        list.add(PhongCanh(R.drawable.h1,"Bình minh", "Bình Minh trên thảo nguyên"))
        list.add(PhongCanh(R.drawable.h2,"Hoàng hôn", "Hoàng hôn trên thảo nguyên"))
        list.add(PhongCanh(R.drawable.h3,"Sức sống mạnh mẽ", "Hoa mọc trên đất khô cằn"))
        list.add(PhongCanh(R.drawable.h4,"Lâu đài trên đảo", "Lâu đài trước những cơn sóng"))
        list.add(PhongCanh(R.drawable.h5,"Vùng đất xanh", "Một thiên đường màu xanh"))
        list.add(PhongCanh(R.drawable.h6,"Tình yêu hoàng hôn", "Cặp đôi đến với nhau trên bãi biển"))
        list.add(PhongCanh(R.drawable.h7,"Ươm mầm sự sống", "Một cây dương xỉ nhỏ phát triển "))

//        val adapter = rvAdapter(list)
//        rvphongcanh.adapter = adapter
////        rvphongcanh.layoutManager = LinearLayoutManager(this,
////            LinearLayoutManager.VERTICAL,
////            false )
//        rvphongcanh.layoutManager = GridLayoutManager(this,
//        3,
//        GridLayoutManager.HORIZONTAL,
//        false)
//    }
        val adapter = rvAdapter(list, object : rvInterface{
            override fun onClickPhongCanh(position: Int) {
                Toast.makeText(this@MainActivity,"bạn đã click vào ${list[position].name}",Toast.LENGTH_SHORT).show()
            }
        })
        rvphongcanh.adapter = adapter
//        rvphongcanh.layoutManager = LinearLayoutManager(this,
//            LinearLayoutManager.VERTICAL,
//            false )
        rvphongcanh.layoutManager = GridLayoutManager(this,
        3,
        GridLayoutManager.HORIZONTAL,
        false)
    }


    }
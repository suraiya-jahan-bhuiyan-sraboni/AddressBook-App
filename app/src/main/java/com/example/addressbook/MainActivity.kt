package com.example.addressbook

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.addressbook.User as User


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val myUserList=DataSource().loadData()
        val recyclerView=findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.adapter=userlistAdapter(this,myUserList)
        recyclerView.setHasFixedSize(true)
    }
}

class DataSource{
    fun loadData(): List<User> {
        return listOf(
            User(R.drawable.image1,R.string.a,R.string.a1,R.string.v1,R.string.p1,R.string.di1,R.string.dv1,R.string.cn1),
            User(R.drawable.image2,R.string.b,R.string.b1,R.string.v2,R.string.p2,R.string.di2,R.string.dv2,R.string.cn2),
            User(R.drawable.image3,R.string.c,R.string.c1,R.string.v3,R.string.p3,R.string.di3,R.string.dv3,R.string.cn3),
            User(R.drawable.image4,R.string.d,R.string.d1,R.string.v4,R.string.p4,R.string.di4,R.string.dv4,R.string.cn4),
            User(R.drawable.image5,R.string.e,R.string.e1,R.string.v5,R.string.p5,R.string.di5,R.string.dv5,R.string.cn5),
            User(R.drawable.image6,R.string.f,R.string.f1,R.string.v6,R.string.p6,R.string.di6,R.string.dv6,R.string.cn6),
            User(R.drawable.image7,R.string.g,R.string.g1,R.string.v7,R.string.p7,R.string.di7,R.string.dv7,R.string.cn7),
            User(R.drawable.image8,R.string.h,R.string.h1,R.string.v8,R.string.p8,R.string.di8,R.string.dv8,R.string.cn8),
            User(R.drawable.image9,R.string.i,R.string.i1,R.string.v9,R.string.p9,R.string.di9,R.string.dv9,R.string.cn9),
            User(R.drawable.image10,R.string.j,R.string.j1,R.string.v10,R.string.p10,R.string.di10,R.string.dv10,R.string.cn10)
        )
    }
}
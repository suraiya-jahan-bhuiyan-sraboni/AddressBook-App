package com.example.addressbook

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.addressbook.adapter.userlistAdapter
import com.example.addressbook.data.DataSource


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val myUserList= DataSource().loadData()
        val recyclerView=findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.adapter= userlistAdapter(this,myUserList)
        recyclerView.setHasFixedSize(true)
    }
}


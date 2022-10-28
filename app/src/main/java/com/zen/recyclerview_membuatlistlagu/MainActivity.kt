package com.zen.recyclerview_membuatlistlagu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var rvMusik: RecyclerView
    private val list: ArrayList<Musik> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvMusik = findViewById(R.id.rv_list)
        rvMusik.setHasFixedSize(true)

        list.addAll(DataMusik.listData)
        showRecyclerList()
    }

    private fun showRecyclerList() {
        rvMusik.layoutManager = LinearLayoutManager(this)
        val listMusikAdapter = MusikAdapter(list)
        rvMusik.adapter = listMusikAdapter
    }
}
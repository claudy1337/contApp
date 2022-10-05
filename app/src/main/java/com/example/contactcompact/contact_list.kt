package com.example.contactcompact

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import kotlinx.android.synthetic.main.activity_contact_list.*
import androidx.recyclerview.widget.LinearLayoutManager

class contact_list : AppCompatActivity() {
    val user = listOf("aboba", "boba", "rsdfsf", "glova", "Fcdd", "fradsdf", "fdsfsf", "rFGG", "fgdgdfgf", "fgfgdgg", "fgdgdg")
    val contact = ArrayList<String>(user)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact_list)

        val examplelstv = generateDummyList(100)
        contact_list.adapter = defAdapter(examplelstv)
        contact_list.layoutManager = LinearLayoutManager(this)
        contact_list.setHasFixedSize(true)

        newTaskButton.setOnClickListener{
            contact_add_().show(supportFragmentManager, "newTaskTag")
        }
    }

    private fun generateDummyList(size: Int):List<User> {
        val country = country(123, "RUS", 116)
        val list = ArrayList<User>()
        for (i in 0 until size){
            val drawable = when (i % 3){
                0->R.drawable.user
                else->R.drawable.user//image random
            }
            val item = User("item $i", 324324, drawable, "aboba@mail",country) //contact generate
            list+=item
        }
        return list
    }
}
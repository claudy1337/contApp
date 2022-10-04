package com.example.contactcompact

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_contact_list.*

class contact_list : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact_list)
        newTaskButton.setOnClickListener{
            contact_add_().show(supportFragmentManager, "newTaskTag")
        }
    }
}
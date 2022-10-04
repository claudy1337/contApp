package com.example.contactcompact

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentManager
import kotlinx.android.synthetic.main.activity_authentation.*

class authentation : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_authentation)
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.manager_service_fragment, service_manager.newInstance())
            .commit()
        saveButton.setOnClickListener {
            val intent = Intent(this, contact_list::class.java)
            startActivity(intent)
        }
    }
}
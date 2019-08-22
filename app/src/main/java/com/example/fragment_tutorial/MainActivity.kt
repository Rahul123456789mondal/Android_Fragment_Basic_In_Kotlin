package com.example.fragment_tutorial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.imagefragment.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Set a click listener for frist button
        button1.setOnClickListener {
            //Get the text fragment instance
            val textFragment = TextFragment()
            // Get the support fragment manger instance
            val manager = supportFragmentManager
            // Begin the fragment trasition using support fragment manager
            val transaction = manager.beginTransaction()
            //Replace the fragment on container
           transaction.replace(R.id.Fragment_container, textFragment)
            transaction.addToBackStack(null)

            //Finish the Transition
            transaction.commit()

        }

        button2.setOnClickListener {
            val imageFragment = ImageFragment()
            val manager2 = supportFragmentManager
            val transaction2 = manager2.beginTransaction()
            transaction2.replace(R.id.Fragment_container, imageFragment)
            transaction2.commit()
        }
    }
}

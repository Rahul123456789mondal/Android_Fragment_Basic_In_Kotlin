package com.example.fragment_tutorial

import android.content.Context
import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment

class TextFragment : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //Get the coustom view for this fragment layout
        val view = inflater!!.inflate(R.layout.layout_text_fragment, container, false)

        //Get the text view widget reference from custom layout
        val arka = view.findViewById<TextView>(R.id.text_Frsgment)

        //Set a click listener for text view object
        arka.setOnClickListener {
            //Change the text color
            arka.setTextColor(Color.BLUE)
            Toast.makeText(view.context, "TextView clicked", Toast.LENGTH_LONG).show()
        }
        // Return the fragment view/Layout
        return view
    }

    override fun onPause() {
        super.onPause()
    }

    override fun onAttach(context: Context?) {
        super.onAttach(context)
    }

    override fun onDestroy() {
        super.onDestroy()
    }

    override fun onDetach() {
        super.onDetach()
    }

    override fun onStart() {
        super.onStart()
    }

    override fun onStop() {
        super.onStop()
    }

}
package com.example.gifdeveloperslife.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import com.example.gifdeveloperslife.R


class SecondFragment : MyFragment() { // top
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_second, container, false)
        initializeGlobalConstants(view)
        val buttonBack: ImageButton = view.findViewById(R.id.button_back2) as ImageButton
        buttonBack.setOnClickListener { back() }
        val buttonNext: ImageButton = view.findViewById(R.id.button_next2) as ImageButton
        buttonNext.setOnClickListener { nextGif() }
        currGif()
        return view
    }

    private fun initializeGlobalConstants(view: View) {
        category = "top"
        mImageView = view.findViewById(R.id.gifImageView2)
        mTextView = view.findViewById(R.id.caption2)
    }
}
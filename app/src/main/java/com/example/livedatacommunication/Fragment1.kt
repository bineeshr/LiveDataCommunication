package com.example.livedatacommunication

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_one.*

class Fragment1 :Fragment() {
    private var myActivity:MainActivity?=null
    override fun onAttach(context: Context?) {
        super.onAttach(context)
        myActivity=context as MainActivity

    }
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_one,container,false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        myActivity?.liveData?.observe(this,androidx.lifecycle.Observer {

            text_title_one.text=it
        })
    }
}
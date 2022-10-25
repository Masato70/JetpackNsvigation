package com.example.jetpacknsvigation

import android.content.ContentValues.TAG
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import androidx.navigation.navOptions

class ActionToLeftFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.action_to_left_fragment, container, false)
//        setHasOptionsMenu(true)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        val leftOptions = navOptions {
            anim {
                enter = R.anim.slide_in_right
                exit = R.anim.slide_out_left
                popEnter = R.anim.slide_in_left
                popExit = R.anim.slide_out_right
            }
        }


        view.findViewById<Button>(R.id.btn).setOnClickListener {

            val et: EditText = view.findViewById(R.id.et)
            val etString = et.text.toString()

            val action =
                ActionToLeftFragmentDirections.actionActionToLeftFragmentToGetArgsFragment(etString)
            findNavController().navigate(action, leftOptions)

        }
    }
}
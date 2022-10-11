package com.example.jetpacknsvigation

import android.content.ContentValues
import android.content.ContentValues.TAG
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import androidx.navigation.navOptions

class HomeScreenFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.home_screen_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val rightOptions = navOptions {
            anim {
                enter = R.anim.slide_in_right
                exit = R.anim.slide_out_left
                popEnter = R.anim.slide_in_left
                popExit = R.anim.slide_out_right
            }
        }

        val leftOptions = navOptions {
            anim {
                enter = R.anim.slide_in_left
                exit = R.anim.slide_out_right
                popEnter = R.anim.slide_in_right
                popExit = R.anim.slide_out_left
            }
        }

        view.findViewById<Button>(R.id.action_right).setOnClickListener {
            Log.d(TAG, "アニメーション右")
            findNavController().navigate(R.id.actionToRightFragment2, null, rightOptions)
        }

        view.findViewById<Button>(R.id.action_left).setOnClickListener {
            Log.d(TAG, "アニメーション左")
            findNavController().navigate(R.id.actionToLeftFragment2, null, rightOptions)
        }



    }

}
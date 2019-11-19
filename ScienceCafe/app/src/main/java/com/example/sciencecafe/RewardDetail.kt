package com.example.sciencecafe


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.sciencecafe.databinding.FragmentRewardDetailBinding

/**
 * A simple [Fragment] subclass.
 */
class RewardDetail : Fragment() {


    private lateinit var binding: FragmentRewardDetailBinding
            override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment


        binding = FragmentRewardDetailBinding.inflate(inflater, container, false)
        return binding.root
        //return inflater.inflate(R.layout.fragment_reward_detail, container, false)
    }


}
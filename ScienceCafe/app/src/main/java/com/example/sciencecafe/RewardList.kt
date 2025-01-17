package com.example.sciencecafe


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.example.sciencecafe.databinding.FragmentRewardListBinding

/**
 * A simple [Fragment] subclass.
 */
class RewardList : Fragment() {

    private lateinit var binding: FragmentRewardListBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        binding = FragmentRewardListBinding.inflate(inflater, container, false)

        binding.eventButton.setOnClickListener { view: View ->
            view.findNavController().navigate(R.id.action_rewardList_to_eventList)
        }

        binding.newsButton.setOnClickListener { view: View ->
            view.findNavController().navigate(R.id.action_rewardList_to_newsList)
        }
        return binding.root
        //return inflater.inflate(R.layout.fragment_reward_list, container, false)
    }


}

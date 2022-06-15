package com.example.shafakhousehost

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController

import com.example.shafakhousehost.R
import com.example.shafakhousehost.databinding.FragmentOptionsBinding
import com.example.shafakhousehost.databinding.FragmentStatisticsBinding
import com.example.shafakhousehost.databinding.FragmentTuneBinding

class OptionsFragment : Fragment() {

    private lateinit var binding: FragmentOptionsBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val fragmentBinding = FragmentOptionsBinding.inflate(inflater, container, false)
        binding = fragmentBinding
        return fragmentBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.optionsFragment = this

        binding.apply {
            statisticButton.setOnClickListener { goToStatisticsScreen() }
        }

        binding.apply {
            tuneButton.setOnClickListener { goToTuneScreen() }
        }
    }

    fun goToStatisticsScreen() {
        findNavController().navigate(R.id.action_optionsFragment_to_statisticsFragment)
    }

    fun goToTuneScreen() {
        findNavController().navigate(R.id.action_optionsFragment_to_tuneFragment)
    }

//    override fun onDestroyView() {
//        super.onDestroyView()
    //       binding = null
//    }

}
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
import com.example.shafakhousehost.databinding.FragmentStatisticsBinding
import com.example.shafakhousehost.databinding.FragmentTuneBinding

class TuneFragment : Fragment() {

    private lateinit var binding: FragmentTuneBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val fragmentBinding = FragmentTuneBinding.inflate(inflater, container, false)
        binding = fragmentBinding
        return fragmentBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.tuneFragment = this

    }

}
package com.geeks.home_work_5_3_ai

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.geeks.home_work_5_3_ai.databinding.FragmentFirstBinding
import com.geeks.home_work_5_3_ai.databinding.FragmentSecondBinding
import java.util.zip.Inflater


class SecondFragment : Fragment() {
private lateinit var binding:FragmentSecondBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSecondBinding.inflate(inflater, container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val result = arguments?.getString(FirstFragment.RESULT_KEY)
        binding.tvRes.text = result
    }

}
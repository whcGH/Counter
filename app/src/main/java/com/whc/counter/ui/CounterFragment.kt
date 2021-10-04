package com.whc.counter.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.whc.counter.R
import com.whc.counter.databinding.FragmentCounterBinding
import com.whc.counter.viewmodel.CounterViewModel

class CounterFragment : Fragment(R.layout.fragment_counter) {
    private val binding by lazy { FragmentCounterBinding.bind(requireView()) }
    private val viewModel by viewModels<CounterViewModel> { defaultViewModelProviderFactory }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.run {
            viewModel.currentCount.observe(viewLifecycleOwner, {
                tvCurrentCount.text = it.toString()
            })
            btnAdd1.setOnClickListener { viewModel.add(1) }
            btnMinus1.setOnClickListener { viewModel.minus(1) }
        }
    }
}
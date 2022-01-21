package com.example.tipcalculatorpart3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.tipcalculatorpart3.databinding.FragmentTipBinding

private var _binding : FragmentTipBinding? = null
private val binding get() = _binding!!

class FinalTotalFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_final_total, container, false)

    }

    override fun onDestroyView() {
        super.onDestroyView()
    }
}
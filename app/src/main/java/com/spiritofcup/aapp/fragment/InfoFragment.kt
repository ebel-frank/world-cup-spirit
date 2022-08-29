package com.spiritofcup.aapp.fragment

import android.graphics.ColorFilter
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.spiritofcup.aapp.DataManager
import com.spiritofcup.aapp.R
import com.spiritofcup.aapp.databinding.FragmentInfoBinding

class InfoFragment : Fragment() {

    private val args: InfoFragmentArgs by navArgs()
    private var _binding: FragmentInfoBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentInfoBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        (activity as AppCompatActivity).setSupportActionBar(binding.toolbar)
        (activity as AppCompatActivity).supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val teamInfo = DataManager.getTeamInfo[args.teamId]!!

        // setup the data
        binding.teamFlag.setImageResource(teamInfo.teamIcon)
        binding.teamName.text = teamInfo.teamName
        binding.group.text = teamInfo.teamGroup
        binding.tour1.text = teamInfo.tour1
        binding.tour2.text = teamInfo.tour2
        binding.tour3.text = teamInfo.tour3
        binding.date1.text = teamInfo.date1
        binding.date2.text = teamInfo.date2
        binding.date3.text = teamInfo.date3
        binding.match1.text = teamInfo.match1
        binding.match2.text = teamInfo.match2
        binding.match3.text = teamInfo.match3
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
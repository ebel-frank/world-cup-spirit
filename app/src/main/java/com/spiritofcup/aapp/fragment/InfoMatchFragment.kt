package com.spiritofcup.aapp.fragment

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
import com.spiritofcup.aapp.databinding.FragmentInfoMatchBinding
import com.spiritofcup.aapp.model.StageMatches

class InfoMatchFragment : Fragment() {

    private val args: InfoMatchFragmentArgs by navArgs()
    private var _binding: FragmentInfoMatchBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentInfoMatchBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        (activity as AppCompatActivity).setSupportActionBar(binding.toolbar)
        (activity as AppCompatActivity).supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val matchInfo = DataManager.getStageMatches[args.matchId] as StageMatches

        // setup with data
        binding.firstTeamIcon.setImageResource(matchInfo.firstTeamIcon)
        binding.firstTeamName.text = matchInfo.firstTeamName
        binding.secondTeamIcon.setImageResource(matchInfo.secondTeamIcon)
        binding.secondTeamName.text = matchInfo.secondTeamName
        binding.firstOdd.text = matchInfo.firstOdd
        binding.secondOdd.text = matchInfo.secondOdd
        binding.thirdOdd.text = matchInfo.thirdOdd

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
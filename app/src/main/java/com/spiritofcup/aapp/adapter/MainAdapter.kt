package com.spiritofcup.aapp.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.spiritofcup.aapp.databinding.HeaderLayoutBinding
import com.spiritofcup.aapp.databinding.MatchLayoutBinding
import com.spiritofcup.aapp.databinding.TitleLayoutBinding
import com.spiritofcup.aapp.fragment.MainFragmentDirections
import com.spiritofcup.aapp.model.StageMatches

class MainAdapter(private val items: List<Any>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    private val TITLE = 0
    private val HEADER = 1
    private val CONTENT = 2

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return when (viewType) {
            TITLE ->
                TitleViewHolder(TitleLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false))
            HEADER ->
                HeaderViewHolder(HeaderLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false))
            else -> // CONTENT type
                ContentViewHolder(MatchLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false))
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (holder) {
            is TitleViewHolder -> {
                holder.bind(items[position] as String)
            }
            is HeaderViewHolder -> {
                holder.bind(items[position] as String)
            }
            is ContentViewHolder -> {
                holder.bind(items[position] as StageMatches)
            }
        }
    }

    override fun getItemCount(): Int = items.size

    override fun getItemViewType(position: Int): Int {
        return when (items[position]) {
            is StageMatches -> {
                CONTENT
            }
            else -> {   // items of String type
                try {
                    if (items[position-1] is String || items[position-1] is StageMatches) {
                        if(items[position+1] is String) {
                            TITLE
                        } else {
                            HEADER
                        }
                    } else {
                        TITLE
                    }
                } catch (e: Exception) { TITLE }
            }
        }
    }

    class TitleViewHolder(itemBinding: TitleLayoutBinding) : RecyclerView.ViewHolder(itemBinding.root) {
        private val title = itemBinding.title
        fun bind(title: String) {
            this.title.text = title
        }
    }

    class HeaderViewHolder(itemBinding: HeaderLayoutBinding) : RecyclerView.ViewHolder(itemBinding.root) {
        private val date = itemBinding.date
        fun bind(date: String) {
            this.date.text = date
        }
    }

    inner class ContentViewHolder(itemBinding: MatchLayoutBinding) : RecyclerView.ViewHolder(itemBinding.root) {
        private val matchTime = itemBinding.matchTime
        private val firstTeamIcon = itemBinding.firstTeamIcon
        private val secondTeamIcon = itemBinding.secondTeamIcon
        private val firstTeamName = itemBinding.firstTeamName
        private val secondTeamName = itemBinding.secondTeamName
        private val firstOdd = itemBinding.firstOdd
        private val secondOdd = itemBinding.secondOdd
        private val thirdOdd = itemBinding.thirdOdd

        init {
            firstTeamName.setOnClickListener {
                val action = MainFragmentDirections.actionMainFragmentToInfoFragment()
                action.teamId = (items[adapterPosition] as StageMatches).firstTeamId
                itemView.findNavController().navigate(action)
            }
            secondTeamName.setOnClickListener {
                val action = MainFragmentDirections.actionMainFragmentToInfoFragment()
                action.teamId = (items[adapterPosition] as StageMatches).secondTeamId
                itemView.findNavController().navigate(action)
            }

        }

        fun bind(match: StageMatches) {
            matchTime.text = match.time
            firstTeamIcon.setImageResource(match.firstTeamIcon)
            secondTeamIcon.setImageResource(match.secondTeamIcon)
            firstTeamName.text = match.firstTeamName
            secondTeamName.text = match.secondTeamName
            firstOdd.text = match.firstOdd
            secondOdd.text = match.secondOdd
            thirdOdd.text = match.thirdOdd
        }
    }
}
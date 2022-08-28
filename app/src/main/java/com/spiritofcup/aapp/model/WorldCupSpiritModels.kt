package com.spiritofcup.aapp.model

data class StageMatches(
    val time: String,
    val firstTeamIcon: Int,
    val firstTeamName: String,
    val firstTeamId: Int,
    val secondTeamIcon: Int,
    val secondTeamName: String,
    val secondTeamId: Int,
    val firstOdd: String,
    val secondOdd: String,
    val thirdOdd: String
)


data class TeamInfo(
    val teamIcon: Int,
    val teamName: String,
    val teamGroup: String,
    val tour1: String,
    val tour2: String,
    val tour3: String,
    val date1: String,
    val date2: String,
    val date3: String,
    val match1: String,
    val match2: String,
    val match3: String,
)
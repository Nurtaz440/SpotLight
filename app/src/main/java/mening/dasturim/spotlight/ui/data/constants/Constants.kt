package mening.dasturim.spotlight.ui.data.constants

import mening.dasturim.spotlight.R
import mening.dasturim.spotlight.ui.data.model.ClubItems
import mening.dasturim.spotlight.ui.data.model.FlowersItem

object Constants {

    fun getFlowerItems():ArrayList<FlowersItem>{
        return arrayListOf(
            FlowersItem(R.drawable.flow1,R.string.goggles),
            FlowersItem(R.drawable.flow2,R.string.seense),
            FlowersItem(R.drawable.flow3,R.string.farfetch),
            FlowersItem(R.drawable.flow4,R.string.acasis),
            FlowersItem(R.drawable.flow5,R.string.sunflower),
            FlowersItem(R.drawable.flow6,R.string.assos)

        )
    }
    fun getFlowersItems():ArrayList<FlowersItem>{
        return arrayListOf(
            FlowersItem(R.drawable.flower,R.string.lantana),
            FlowersItem(R.drawable.flower2,R.string.pollinators),
            FlowersItem(R.drawable.flower3,R.string.calibrachoa),
            FlowersItem(R.drawable.flower4,R.string.sunflower),
            FlowersItem(R.drawable.flower5,R.string.galidaria),
            FlowersItem(R.drawable.flower6,R.string.assos),
            FlowersItem(R.drawable.flower7,R.string.sunshine),
            FlowersItem(R.drawable.flower8,R.string.farfetch),
            FlowersItem(R.drawable.flower9,R.string.acasis),
            FlowersItem(R.drawable.flower10,R.string.seense)

        )
    }

    fun getClubItems():ArrayList<ClubItems>{
        return arrayListOf(
            ClubItems("Mentors"),
            ClubItems("Chat"),
            ClubItems("Meeting"),
            ClubItems("Course")

        )
    }
}
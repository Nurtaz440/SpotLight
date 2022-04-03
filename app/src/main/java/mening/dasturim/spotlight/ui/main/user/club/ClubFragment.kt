package mening.dasturim.spotlight.ui.main.user.club

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import mening.dasturim.spotlight.R
import mening.dasturim.spotlight.ui.data.constants.Constants
import mening.dasturim.spotlight.ui.data.model.ClubItems

class ClubFragment : Fragment() {
    lateinit var clubAapter: ClubAapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view= inflater.inflate(R.layout.fragment_club, container, false)
        clubAapter = ClubAapter()
        clubAapter.setData(Constants.getClubItems())

        view.findViewById<RecyclerView>(R.id.recycler_view3).apply {
            layoutManager = LinearLayoutManager(context,RecyclerView.VERTICAL,false)
            adapter = clubAapter
        }
        clubAapter.onItemClick = {
            when(it){
                ClubItems("Mentors") ->{
                    findNavController().navigate(R.id.mentorsFragment)
                }
                ClubItems("Chat") ->{
                    findNavController().navigate(R.id.chatFragment)
                }
                ClubItems("Meeting") ->{
                    findNavController().navigate(R.id.meetingFragment)
                }
                ClubItems("Course") ->{
                    findNavController().navigate(R.id.courseFragment)
                }
            }
        }

        return view
    }

}
package mening.dasturim.spotlight.ui.main.user.flower

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import mening.dasturim.spotlight.R

class LotusFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
       val view= inflater.inflate(R.layout.fragment_lotus, container, false)
        view.findViewById<Button>(R.id.button).setOnClickListener {
            findNavController().navigate(R.id.clubFragment)
        }
        return view
    }

}
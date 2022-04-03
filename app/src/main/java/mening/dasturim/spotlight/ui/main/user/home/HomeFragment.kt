package mening.dasturim.spotlight.ui.main.user.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import mening.dasturim.spotlight.R
import mening.dasturim.spotlight.ui.data.constants.Constants

class HomeFragment : Fragment() {
    lateinit var homeAdapter: HomeAdapter
    lateinit var homeAdapter2: HomeAdapter
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_home, container, false)

        homeAdapter = HomeAdapter(context!!)
        homeAdapter2 = HomeAdapter(context!!)
        homeAdapter.setData(Constants.getFlowerItems())
        homeAdapter2.setData(Constants.getFlowersItems())

        val recyclerView: RecyclerView = view.findViewById(R.id.recycler_view)
        val recyclerView2: RecyclerView = view.findViewById(R.id.recycler_view2)

        recyclerView.apply {
            layoutManager = LinearLayoutManager(context, RecyclerView.HORIZONTAL, false)
            setHasFixedSize(true)
            adapter = homeAdapter
        }
        recyclerView2.apply {
            layoutManager = StaggeredGridLayoutManager(2,RecyclerView.VERTICAL)
            adapter = homeAdapter2
        }

        homeAdapter.onItemClick = {
            findNavController().navigate(R.id.lotusFragment)
        }
        homeAdapter2.onItemClick = {
            findNavController().navigate(R.id.lotusFragment)
        }
        return view
    }
}
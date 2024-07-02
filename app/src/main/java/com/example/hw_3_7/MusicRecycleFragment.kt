package com.example.hw_3_7

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.hw_3_7.databinding.FragmentRecycleBinding

class MusicRecycleFragment : Fragment() {

    lateinit var binding: FragmentRecycleBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentRecycleBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initAdapter()
    }

    private fun initAdapter() {
        val adapter = MusicAdapter(arrayListOf(
            Music("Autumn","Alex",1,3.00),
            Music("Garry","Alexiy",2,2.00),
            Music("Pitecantrop","Lil Pip",3,3.52),
            Music("Jumanji","Miagi",4,3.02),
            Music("Karagat","bakr",5,5.00),
            Music("Glaza","Bakr",6,3.40),
            Music("Show","Quest Pistols",7,2.44),
            Music("Fred","KISH",8,1.01),
            Music("Sadagam","Kanykei",9,6.28),
            Music("Jashsyn","Aidar",10,1.50),
            Music("La Da De","Gorrila Zoe",11,2.18),
        ))
        binding.rvMusic.adapter = adapter

    }
}
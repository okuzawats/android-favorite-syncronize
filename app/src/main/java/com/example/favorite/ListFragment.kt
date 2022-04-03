package com.example.favorite

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.favorite.databinding.FragmentListBinding
import com.wada811.databinding.dataBinding

class ListFragment : Fragment(R.layout.fragment_list) {

    private val binding: FragmentListBinding by dataBinding()

    private val controller: ListController by lazy {
        ListController {
            findNavController().navigate(R.id.detailFragment)
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.recyclerView.adapter = controller.adapter
        controller.setData(listOf(ListItemRegistry.find(1)))
    }

    override fun onDestroyView() {
        binding.recyclerView.adapter = null
        super.onDestroyView()
    }
}

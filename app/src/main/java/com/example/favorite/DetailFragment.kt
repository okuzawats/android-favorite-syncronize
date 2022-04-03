package com.example.favorite

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.favorite.databinding.FragmentDetailBinding
import com.wada811.databinding.dataBinding

class DetailFragment : Fragment(R.layout.fragment_detail) {

    private val binding: FragmentDetailBinding by dataBinding()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.name = ListItemRegistry.find(1).name
        binding.isFavorite = ListItemRegistry.find(1).isFavorite
        binding.button.setOnClickListener {
            val item = ListItemRegistry.find(1)
            item.isFavorite.set(item.isFavorite.get().not())
        }
    }
}

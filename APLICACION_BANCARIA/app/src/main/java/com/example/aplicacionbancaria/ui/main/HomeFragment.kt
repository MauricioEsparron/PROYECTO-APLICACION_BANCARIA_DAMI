package com.example.aplicacionbancaria.ui.main

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import androidx.viewbinding.ViewBinding
import com.example.aplicacionbancaria.DataMain
import com.example.aplicacionbancaria.MainActivity
import com.example.aplicacionbancaria.R
import com.example.aplicacionbancaria.databinding.FragmentHomeBinding
import com.example.aplicacionbancaria.databinding.ItemImageSizeLayoutBinding
import org.imaginativeworld.whynotimagecarousel.listener.CarouselListener
import org.imaginativeworld.whynotimagecarousel.listener.CarouselOnScrollListener
import org.imaginativeworld.whynotimagecarousel.model.CarouselItem
import org.imaginativeworld.whynotimagecarousel.utils.setImage


class HomeFragment : Fragment(R.layout.fragment_home) {

    lateinit var mainActivity: MainActivity
    lateinit var binding: FragmentHomeBinding

    //override fun onCreateView(
    //    inflater: LayoutInflater, container: ViewGroup?,
    //    savedInstanceState: Bundle?
    //): View? {
    //    // Inflate the layout for this fragment
    //    return inflater.inflate(R.layout.fragment_home, container, false)
    //}

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentHomeBinding.bind(view)

        binding.carousel.registerLifecycle(lifecycle)

        binding.carousel.carouselListener =
            object : CarouselListener {
                override fun onCreateViewHolder(
                    layoutInflater: LayoutInflater,
                    parent: ViewGroup
                ): ViewBinding? {
                    return ItemImageSizeLayoutBinding.inflate(layoutInflater, parent, false)
                }

                override fun onBindViewHolder(
                    binding: ViewBinding,
                    item: CarouselItem,
                    position: Int
                ) {
                    val currentBinding = binding as ItemImageSizeLayoutBinding

                    currentBinding.imageView.apply {
                        scaleType = ImageView.ScaleType.CENTER_CROP

                        setImage(item, org.imaginativeworld.whynotimagecarousel.R.drawable.carousel_default_placeholder)
                    }
                }
            }
        val listOne = mutableListOf<CarouselItem>()

        for(item in DataMain.one) {
            listOne.add(
                CarouselItem(
                    imageDrawable = item.first,
                    caption = item.second,
                ),
            )
        }
        binding.carousel.setData(listOne)

        binding.buttonPanel.isSelected = true

        binding.carousel.onScrollListener =
            object : CarouselOnScrollListener {
                override fun onScrollStateChanged(
                    recyclerView: RecyclerView,
                    newState: Int,
                    position: Int,
                    carouselItem: CarouselItem?
                ) {
                    if( newState == RecyclerView.SCROLL_STATE_IDLE) {
                        carouselItem?.apply {
                            binding.buttonPanel.text = caption
                        }
                    }
                }

                override fun onScrolled(
                    recyclerView: RecyclerView,
                    dx: Int,
                    dy: Int,
                    position: Int,
                    carouselItem: CarouselItem?
                ) { }
            }
        //Custom Indicator
        binding.carousel.setIndicator(binding.customIndicator)
    }
}
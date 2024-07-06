package com.example.aplicacionbancaria

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import androidx.recyclerview.widget.RecyclerView
import androidx.viewbinding.ViewBinding
import com.example.aplicacionbancaria.databinding.ActivityMainBinding
import com.example.aplicacionbancaria.databinding.ItemImageSizeLayoutBinding
import org.imaginativeworld.whynotimagecarousel.listener.CarouselListener
import org.imaginativeworld.whynotimagecarousel.listener.CarouselOnScrollListener
import org.imaginativeworld.whynotimagecarousel.model.CarouselItem
import org.imaginativeworld.whynotimagecarousel.utils.setImage

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

    val navHostFragment = supportFragmentManager.findFragmentById(R.id.bancoNavHostFragment) as NavHostFragment
    val navController = navHostFragment.navController
    binding.bottomNavigationView.setupWithNavController(navController)
    }
}
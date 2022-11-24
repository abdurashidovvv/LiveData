package com.abdurashidov.livedata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.abdurashidov.livedata.adapters.RvAdapter
import com.abdurashidov.livedata.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var rvAdapter: RvAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        rvAdapter=RvAdapter(this)
        binding.myViewPager2.adapter=rvAdapter

    }
}
package com.example.meishaapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.meishaapp.databinding.ActivityBookKidBinding

class BookKidActivity : AppCompatActivity() {
    private lateinit var binding: ActivityBookKidBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBookKidBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonFairy.setOnClickListener {
            replaceFragment(FairyFragment())
        }

        binding.buttonFable.setOnClickListener {
            replaceFragment(FableFragment())
        }

        binding.buttonScience.setOnClickListener {
            replaceFragment(ScienceFragment())
        }
    }

    // ganti fragment
    fun replaceFragment(frg:Fragment) {
        val fragmentManager = supportFragmentManager
        val fragmentTrx = fragmentManager.beginTransaction()
        fragmentTrx.replace(R.id.fragmentKidBook, frg)
        fragmentTrx.commit()
    }
}
package com.system.assignment.ui.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.system.assignment.data.api.ApiHelperImpl
import com.system.assignment.data.api.RetrofitBuilder
import com.system.assignment.data.local.DatabaseBuilder
import com.system.assignment.data.local.DatabaseHelperImpl
import com.system.assignment.databinding.ActivityMainBinding
import com.system.assignment.ui.viewmodels.MainActivityViewModel
import com.system.assignment.application.ViewModelFactory

class MainActivity : AppCompatActivity() {

    private lateinit var viewModel: MainActivityViewModel
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel = ViewModelProvider(
            this, ViewModelFactory(
                ApiHelperImpl(RetrofitBuilder.apiService),
                DatabaseHelperImpl(DatabaseBuilder.getInstance(applicationContext))
            )
        )[MainActivityViewModel::class.java]

    }

}
package com.system.assignment.ui.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.ViewDataBinding
import androidx.databinding.library.baseAdapters.BR
import androidx.lifecycle.ViewModelProvider
import com.system.assignment.R
import com.system.assignment.data.api.ApiHelperImpl
import com.system.assignment.data.api.RetrofitBuilder
import com.system.assignment.data.local.DatabaseBuilder
import com.system.assignment.data.local.DatabaseHelperImpl
import com.system.assignment.databinding.ActivityMainBinding
import com.system.assignment.ui.viewmodels.MainActivityViewModel
import com.system.assignment.application.ViewModelFactory
import com.system.assignment.di.component.ActivityComponent
import com.system.assignment.ui.base.BaseActivity

class MainActivity : BaseActivity<ViewDataBinding, MainActivityViewModel>() {

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

    override fun getBindingVariable(): Int {
        return BR._all
    }

    override fun getLayoutId(): Int {
        return R.layout.activity_main
    }

    override fun performDependencyInjection(buildComponent: ActivityComponent?) {
        buildComponent!!.inject(this)
    }

}
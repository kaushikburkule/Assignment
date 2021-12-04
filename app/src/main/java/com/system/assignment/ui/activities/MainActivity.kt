package com.system.assignment.ui.activities

import android.os.Bundle
import androidx.databinding.library.baseAdapters.BR
import androidx.recyclerview.widget.LinearLayoutManager
import com.system.assignment.R
import com.system.assignment.databinding.ActivityMainBinding
import com.system.assignment.di.component.ActivityComponent
import com.system.assignment.ui.adapter.MainAdapter
import com.system.assignment.ui.base.BaseActivity
import com.system.assignment.ui.viewmodels.MainActivityViewModel

class MainActivity : BaseActivity<ActivityMainBinding, MainActivityViewModel>() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = viewDataBinding

        binding.listView.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = MainAdapter(mutableListOf("Kaushik", "Burkule"))
        }

    }

    // Binding and initialization of basic components
    override fun getBindingVariable(): Int = BR._all
    override fun getLayoutId(): Int = R.layout.activity_main
    override fun performDependencyInjection(buildComponent: ActivityComponent?) =
        buildComponent!!.inject(this)

}
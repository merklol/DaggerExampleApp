package com.maximapps.feature.a.ui

import android.content.Context
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import by.kirich1409.viewbindingdelegate.viewBinding
import com.maximapps.core.extensions.launchWhenViewCreated
import com.maximapps.feature.a.R
import com.maximapps.feature.a.databinding.FragmentFeatureABinding
import com.maximapps.feature.a.di.FeatureAComponentHolder
import kotlinx.coroutines.flow.collectLatest
import javax.inject.Inject

class FeatureAFragment : Fragment(R.layout.fragment_feature_a) {
    private val binding: FragmentFeatureABinding by viewBinding()

    @Inject
    lateinit var factory: FeatureAViewModel.Factory
    private val viewModel: FeatureAViewModel by viewModels { factory }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        FeatureAComponentHolder.getComponent().inject(this)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val (button, messageView) = binding

        button.setOnClickListener { viewModel.getLastUnreadMessage() }
        launchWhenViewCreated {
            viewModel.lastUnreadMessage.collectLatest { messageView.text = it }
        }
    }
}
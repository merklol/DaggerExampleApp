package com.maximapps.feature.a.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.maximapps.core.extensions.mutableSharedFlowAsLiveData
import com.maximapps.feature.core.domain.GetLastUnreadMessageUseCase
import kotlinx.coroutines.flow.asSharedFlow
import javax.inject.Inject
import javax.inject.Provider

class FeatureAViewModel(
    private val getLastUnreadMessageUseCase: GetLastUnreadMessageUseCase
) : ViewModel() {

    private val _lastUnreadMessage = mutableSharedFlowAsLiveData<String>()
    val lastUnreadMessage = _lastUnreadMessage.asSharedFlow()

    fun getLastUnreadMessage() =
        _lastUnreadMessage.tryEmit(getLastUnreadMessageUseCase())

    @Suppress("unchecked_cast")
    class Factory @Inject constructor(
        private val getLastUnreadMessageUseCase: Provider<GetLastUnreadMessageUseCase>
    ) : ViewModelProvider.Factory {
        override fun <T : ViewModel> create(modelClass: Class<T>): T {
            require(modelClass == FeatureAViewModel::class.java)
            return FeatureAViewModel(getLastUnreadMessageUseCase.get()) as T
        }
    }
}
package com.badvok.ingreed.ui.base

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.StateFlow

interface State
interface Action
interface Effect

interface BaseViewModel<S: State, A : Action, E : Effect> {
    fun observeState(): StateFlow<S>
    fun observeSideEffect(): Flow<E>
    fun dispatch(action :E)
}
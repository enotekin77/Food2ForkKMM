package com.enestekin.food2forkkmm.domain.util

import com.enestekin.food2forkkmm.domain.model.GenericMessageInfo

class DataState<T>(
    val message: GenericMessageInfo.Builder? = null,
    val data: T? = null,
    val isLoading: Boolean = false,
) {
    companion object {

        fun <T> error(
            message: GenericMessageInfo.Builder? = null,
        ): DataState<T> {
            return DataState(
                message = message,
                data = null
            )
        }

        fun <T> data(
            message: GenericMessageInfo.Builder? = null,
            data: T? = null,
        ): DataState<T> {
            return  DataState(
                message = message,
                data = data,
            )
        }

        fun <T> loading() = DataState<T>(isLoading = true)
    }
}
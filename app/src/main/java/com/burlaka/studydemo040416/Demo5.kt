package com.burlaka.studydemo040416

import android.content.Context
import android.view.View

/**
 * @author BRCJU
 * @since 04.04.2019
 */

fun hideView(viewContainer: Container<out View>, context: Context) {

    viewContainer.getData().visibility = View.GONE;
    //некорректен даже такой вызов, потому что неизвестно, содержит контейнер View (или какого-то из его потомков) или View?
    // viewContainer.putData(null)

    // viewContainer.putData(TextView(context))

    viewContainer.getData()


}

// Kotlin
interface Container<T> {
    fun getData(): T
    fun putData(data: T)
}
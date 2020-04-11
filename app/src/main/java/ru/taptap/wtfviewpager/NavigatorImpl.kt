package ru.taptap.wtfviewpager

import androidx.fragment.app.FragmentManager
import androidx.navigation.NavController
import androidx.navigation.NavDirections

object NavigatorImpl {

    private var navController: NavController? = null

    fun bind(navController: NavController) {
        this.navController = navController
    }

    fun unbind() {
        this.navController = null
    }

    private fun NavDirections.move() {
        navController?.navigate(this)
    }

    fun moveToEdit(position: Int) {
        PagerFragmentDirections.actionPagerFragmentToEditFragment(
            ARG = position
        ).move()
    }

    fun moveBackToPager() {
        navController?.popBackStack()
    }

}
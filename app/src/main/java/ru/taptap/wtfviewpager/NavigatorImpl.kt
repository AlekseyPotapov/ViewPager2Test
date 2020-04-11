package ru.taptap.wtfviewpager

import androidx.fragment.app.FragmentManager
import androidx.navigation.NavController
import androidx.navigation.NavDirections

object NavigatorImpl {

    private var navController: NavController? = null
    private var fragmentManager: FragmentManager? = null

    fun bind(navController: NavController, fragmentManager: FragmentManager) {
        this.navController = navController
        this.fragmentManager = fragmentManager
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
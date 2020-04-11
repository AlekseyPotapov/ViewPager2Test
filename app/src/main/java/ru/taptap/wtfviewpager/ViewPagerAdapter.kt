package ru.taptap.wtfviewpager

import android.util.Log
import android.view.View
import android.widget.FrameLayout
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter

/**
 * A simple pager adapter that represents 5 ScreenSlidePageFragment objects, in
 * sequence.
 */
internal class ViewPagerAdapter(
    private val wordList: List<String>,
    fragmentManager: FragmentManager,
    lifeCycle: Lifecycle
) : FragmentStateAdapter(fragmentManager, lifeCycle) {

    override fun getItemCount(): Int = wordList.size

    override fun createFragment(position: Int): Fragment {
        Log.d("WTFViewPager", "createFragment")
        return ItemFragment.newInstance(position)
    }

}
package ru.taptap.wtfviewpager

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2

class PagerFragment : Fragment() {
    private val viewPager: ViewPager2 by bindView(R.id.pager)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("WTFViewPager", "onCreate")
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d("WTFViewPager", "onCreateView")
        return inflater.inflate(R.layout.pager_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d("WTFViewPager", "onViewCreated")
        viewPager.adapter = ViewPagerAdapter(
            wordList = Data.dataList.toList(),
            fragmentManager = childFragmentManager,
            lifeCycle = lifecycle
        )
    }

    override fun onResume() {
        super.onResume()
        Log.d("WTFViewPager", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("WTFViewPager", "onPause")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d("WTFViewPager", "onDestroyView")
    }
}
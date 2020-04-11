package ru.taptap.wtfviewpager

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment

class ItemFragment : Fragment() {

    private val textView by bindView<TextView>(R.id.value)

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d("WTFViewPager", "ItemFragment onCreateView")
        return inflater.inflate(R.layout.item_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d("WTFViewPager", "ItemFragment onViewCreated")
        val position = requireArguments().getInt(ARG)

        textView.text = Data.dataList[position]
        textView.setOnClickListener {
            NavigatorImpl.moveToEdit(position)
        }
    }

    override fun onResume() {
        super.onResume()
        Log.d("WTFViewPager", "ItemFragment onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("WTFViewPager", "ItemFragment onPause")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d("WTFViewPager", "ItemFragment onDestroyView")
    }

    companion object {
        private const val ARG = "arg"

        fun newInstance(position: Int): Fragment {
            return Bundle()
                .apply { putInt(ARG, position) }
                .let { ItemFragment().apply { arguments = it } }
        }

    }
}
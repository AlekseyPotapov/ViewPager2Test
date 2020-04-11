package ru.taptap.wtfviewpager

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment

class EditFragment : Fragment() {

    private val backButton by bindView<Button>(R.id.back)
    private val editText by bindView<EditText>(R.id.edit_value)
    private var position: Int? = null
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.edit_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        position = requireArguments().getInt("ARG")

        editText.setText(Data.dataList[position!!])
        backButton.setOnClickListener {
            Data.dataList[position!!]
            NavigatorImpl.moveBackToPager()
        }
    }
}
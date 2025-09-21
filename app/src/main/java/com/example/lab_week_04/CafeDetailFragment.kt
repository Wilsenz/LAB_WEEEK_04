package com.example.lab_week_04

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment

class CafeDetailFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_cafe_detail, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val resId = arguments?.getInt(ARG_DESCRIPTION_RES_ID) ?: 0
        if (resId != 0) {
            view.findViewById<TextView>(R.id.content_description)?.text = getString(resId)
        }
    }

    companion object {
        private const val ARG_DESCRIPTION_RES_ID = "ARG_DESCRIPTION_RES_ID"

        fun newInstance(contentResId: Int): CafeDetailFragment {
            val fragment = CafeDetailFragment()
            val args = Bundle()
            args.putInt(ARG_DESCRIPTION_RES_ID, contentResId)
            fragment.arguments = args
            return fragment
        }
    }
}

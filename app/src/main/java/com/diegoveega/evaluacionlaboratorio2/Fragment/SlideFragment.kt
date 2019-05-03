package com.diegoveega.evaluacionlaboratorio2.Fragment

import android.content.Context
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

import com.diegoveega.evaluacionlaboratorio2.R

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private val previus:Button? = null
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Activities that contain this fragment must implement the
 * [SlideFragment.OnFragmentInteractionListener] interface
 * to handle interaction events.
 * Use the [SlideFragment.newInstance] factory method to
 * create an instance of this fragment.
 *
 */
class SlideFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: Button? = null
    private var param2: Button? = null
    private var listener: ListenerToolBox? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(previus)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_slide, container, false)
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        //ES TOOLBOX?
        if(context is ListenerToolBox){

        } else{
            throw Exception("Se necesita toolboxListener")
        }
    }

    override fun onDetach() {
        super.onDetach()
        listener = null
    }

    interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        fun onFragmentInteraction(uri: Uri)
    }

    companion object {
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
                SlideFragment().apply {
                    arguments = Bundle().apply {
                        putString(ARG_PARAM1, param1)
                        putString(ARG_PARAM2, param2)
                    }
                }
    }

    interface ListenerToolBox{
        fun ClickListenerHandler(view: TextView)
    }


}

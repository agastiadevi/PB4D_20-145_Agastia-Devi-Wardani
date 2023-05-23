package com.example.modul5praktikum

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.modul5praktikum.databinding.FragmentSecondBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [SecondFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class SecondFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    private lateinit var binding: FragmentSecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSecondBinding.inflate(inflater, container, false)
        val list = ArrayList<NoteLists>()

        list.addAll(
            arrayOf(
                NoteLists("01 Januari 2023", "Catatan Pertama", "Lorem Ipsum dolor sit amet....."),
                NoteLists("02 Februari 2023", "Catatan Kedua", "Lorem Ipsum dolor sit amet....."),
                NoteLists("03 Maret 2023", "Catatan Ketiga", "Lorem Ipsum dolor sit amet....."),
                NoteLists("04 April 2023", "Catatan Keempat", "Lorem Ipsum dolor sit amet....."),
                NoteLists("05 Mei 2023", "Catatan Kelima", "Lorem Ipsum dolor sit amet....."),
                NoteLists("06 Juni 2023", "Catatan Keenam", "Lorem Ipsum dolor sit amet....."),
                NoteLists("07 Juli 2023", "Catatan Ketujuh", "Lorem Ipsum dolor sit amet....."),
                NoteLists("08 Agustus 2023", "Catatan Kedelapan", "Lorem Ipsum dolor sit amet....."),
                NoteLists("10 Oktober 2023", "Catatan Kesepuluh", "Lorem Ipsum dolor sit amet.....")

            )
        )

        val myAdapter = NoteAdapter(list)

        binding.recyclerViewNote.layoutManager = LinearLayoutManager(requireContext())
        binding.recyclerViewNote.setHasFixedSize(true)
        binding.recyclerViewNote.adapter = myAdapter

        return binding.root
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment SecondFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            SecondFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}
package com.websarve.wings.android.fragmentsample

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ListView
import android.widget.SimpleAdapter

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [MenuListFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class MenuListFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

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
        // Inflate the layout for this fragment
        // return inflater.inflate(R.layout.fragment_menu_list, container, false)

        val view = inflater.inflate(R.layout.fragment_menu_list, container, false)
        val lvMenu = view.findViewById<ListView>(R.id.lvMenu)

        val menuList : MutableList<MutableMap<String, String>> = mutableListOf()
        var menu = mutableMapOf( "name" to "ハンバーグ定食", "price" to "850en")
        menuList.add(menu)
        menu = mutableMapOf( "name" to "からあげ定食", "price" to "850en")
        menuList.add(menu)
        menu = mutableMapOf( "name" to "オムライス定食", "price" to "450en")
        menuList.add(menu)
        menu = mutableMapOf( "name" to "うどん定食", "price" to "830en")
        menuList.add(menu)
        menu = mutableMapOf( "name" to "ラーメン定食", "price" to "760en")
        menuList.add(menu)
        menu = mutableMapOf( "name" to "チャーハン定食", "price" to "450en")
        menuList.add(menu)
        menu = mutableMapOf( "name" to "レバニラ定食", "price" to "1050en")
        menuList.add(menu)
        menu = mutableMapOf( "name" to "そば定食", "price" to "540en")
        menuList.add(menu)
        menu = mutableMapOf( "name" to "牛丼定食", "price" to "440en")
        menuList.add(menu)
        menu = mutableMapOf( "name" to "日替わり定食", "price" to "700en")
        menuList.add(menu)
        menu = mutableMapOf( "name" to "カレー定食", "price" to "500en")
        menuList.add(menu)

        val from = arrayOf("name", "price")
        val to = intArrayOf(android.R.id.text1, android.R.id.text2)
        val adapter = SimpleAdapter(activity, menuList, android.R.layout.simple_list_item_2, from, to)
        lvMenu.adapter = adapter
        return view
    }
    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment MenuListFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            MenuListFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}
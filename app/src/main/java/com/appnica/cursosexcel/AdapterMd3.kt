package com.appnica.cursosexcel

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView

class AdapterMd3 (context: Context, val valores:List<Modulo3>):
    ArrayAdapter<Modulo3>(context,0,valores) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        var itemview = convertView

        if (itemview == null)
            itemview = LayoutInflater.from(context).inflate(android.R.layout.simple_list_item_2, parent,false)


        val modulo3 = valores[position]


        itemview!!.findViewById<TextView>(android.R.id.text1).setText(modulo3.subjectMd3)


        return itemview!!
    }

}
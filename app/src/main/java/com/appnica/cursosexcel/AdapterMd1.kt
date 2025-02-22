package com.appnica.cursosexcel

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView

class AdapterMd1(context:Context, val valores:List<Contacto>):
    ArrayAdapter<Contacto>(context, 0, valores){

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        var itemview = convertView

        if (itemview == null)
            itemview = LayoutInflater.from(context).inflate(android.R.layout.simple_list_item_2, parent,false)


        val contacto = valores[position]

        itemview!!.findViewById<TextView>(android.R.id.text1).setText(contacto.subjectMd1)

        return itemview!!
    }

}
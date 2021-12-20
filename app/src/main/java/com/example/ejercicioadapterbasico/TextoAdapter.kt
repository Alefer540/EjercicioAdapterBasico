package com.example.ejercicioadapterbasico

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.ejercicioadapterbasico.databinding.ItemTextoBinding

class TextoAdapter: RecyclerView.Adapter<TextoAdapter.TextoViewHolder>() {

        class TextoViewHolder(var itemBinding: ItemTextoBinding):RecyclerView.ViewHolder(itemBinding.root)

    override fun getItemCount(): Int {
        return 50 //posicion
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TextoViewHolder {
        //creacion de elementos
        var binding = ItemTextoBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return TextoViewHolder(binding)

    }
        //Como relleno las vistas
    override fun onBindViewHolder(holder: TextoViewHolder, position: Int) {
            if (position %2 == 0) {
                holder.itemBinding.layoutPrincipal.setBackgroundColor(ContextCompat.getColor(holder.itemBinding.root.context,R.color.design_default_color_primary))
                holder.itemBinding.textView.text = "La posicion es  $position par"
            }else
                holder.itemBinding.layoutPrincipal.setBackgroundColor(ContextCompat.getColor(holder.itemBinding.root.context,R.color.design_default_color_error))
                holder.itemBinding.textView.text="La posicion es  $position impar"
    }
}
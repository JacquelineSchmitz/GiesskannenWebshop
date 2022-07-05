package com.example.giekannenwebshop.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.databinding.adapters.CardViewBindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.giekannenwebshop.R
import com.example.giekannenwebshop.data.model.Kanne
import com.example.giekannenwebshop.databinding.CardBinding


class KannenAdapter(
    private val context: Context,
    private val dataset: List<Kanne>
    ): RecyclerView.Adapter<KannenAdapter.ItemViewHolder>() {

    class ItemViewHolder(val binding: CardBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val binding = CardBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ItemViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {

        val item = dataset[position]

        holder.binding.blaueKanne.setImageResource(item.pictureResource)
        holder.binding.kanneNameText.text = item.name
        holder.binding.kannePreisText.text = "€${item.preis}"

    }



    // damit der LayoutManager weiß wie lang die Liste ist
    override fun getItemCount(): Int {
        return dataset.size
    }
}


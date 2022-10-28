package com.zen.recyclerview_membuatlistlagu

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class MusikAdapter(private val listMusik: ArrayList<Musik>): RecyclerView.Adapter<MusikAdapter.CardViewViewHolder>() {
    inner class CardViewViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_photo)
        var tvJudul: TextView = itemView.findViewById(R.id.txt_judul)
        var tvArtis: TextView = itemView.findViewById(R.id.txt_artist)
        var tvAlbum: TextView = itemView.findViewById(R.id.txt_album)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_view, parent, false)
        return CardViewViewHolder(view)
    }

    override fun onBindViewHolder(holder: CardViewViewHolder, position: Int) {
        val musik = listMusik[position]

        Glide.with(holder.itemView.context)
            .load(musik.gambar)
            .apply(RequestOptions().override(350, 550))
            .into(holder.imgPhoto)

        holder.tvJudul.text = musik.judul
        holder.tvArtis.text = musik.artis
        holder.tvAlbum.text = musik.album

        holder.itemView.setOnClickListener {
            Toast.makeText(holder.itemView.context, "Kamu memilih " + listMusik[holder.bindingAdapterPosition].judul, Toast.LENGTH_SHORT).show()
        }
    }

    override fun getItemCount(): Int {
        return listMusik.size
    }

}
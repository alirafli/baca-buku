package com.example.bacabuku.viewholder;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.bacabuku.R;

public class BukuViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    TextView txJudulBuku;
    TextView txPenulis;
    ImageView imGambarBuku;
    Context context;

    public BukuViewHolder(@NonNull View itemView) {
        super(itemView);
        context = itemView.getContext();
        txJudulBuku = itemView.findViewById(R.id.id_judulBuku);
        txPenulis = itemView.findViewById(R.id.id_penulis);
        imGambarBuku = itemView.findViewById(R.id.id_gambarBuku);
    }

    @Override
    public void onClick(View view) {

    }

    public TextView getTxJudulBuku() {
        return txJudulBuku;
    }

    public TextView getTxPenulis() {
        return txPenulis;
    }

    public ImageView getImGambarBuku() {
        return imGambarBuku;
    }

    public Context getContext() {
        return context;
    }
}

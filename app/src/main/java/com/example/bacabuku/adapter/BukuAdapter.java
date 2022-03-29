package com.example.bacabuku.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.bacabuku.R;
import com.example.bacabuku.model.Buku;
import com.example.bacabuku.viewholder.BukuViewHolder;

import java.util.ArrayList;

public class BukuAdapter extends RecyclerView.Adapter<BukuViewHolder> {

    private ArrayList<Buku> listBuku;
    private Context context;

    public BukuAdapter(ArrayList<Buku> listBuku, Context context) {
        this.listBuku = listBuku;
        this.context = context;
    }

    @NonNull
    @Override
    public BukuViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_item, parent, false);
        BukuViewHolder viewHolder = new BukuViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull BukuViewHolder holder, int position) {

        holder.getTxJudulBuku().setText(listBuku.get(position).getJudulBuku());
        Glide.with(context).load(listBuku.get(position).getGambarBuku()).into(holder.getImGambarBuku());
        holder.getTxPenulis().setText(listBuku.get(position).getPenulis());
    }

    @Override
    public int getItemCount() {
        return listBuku.size();
    }
}

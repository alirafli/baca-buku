package com.example.bacabuku;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;

import com.example.bacabuku.adapter.BukuAdapter;
import com.example.bacabuku.model.Buku;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    BukuAdapter bukuAdapter;
    ArrayList<Buku> listBuku;
    int[] gambarBuku = {R.drawable.buku1,R.drawable.buku2,R.drawable.buku3,R.drawable.buku4,R.drawable.buku5};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loadData();
        initRecyclerView();
    }

    private void initRecyclerView(){
        RecyclerView recyclerView = findViewById(R.id.id_rvBuku);
        bukuAdapter = new BukuAdapter(listBuku, this);
        recyclerView.setAdapter(bukuAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void loadData(){

        listBuku = new ArrayList<>();
        listBuku.add(new Buku("The Godfather", "Mario Puzo", gambarBuku[0]));
        listBuku.add(new Buku("The Art Of War", "Andri Wang", gambarBuku[1]));
        listBuku.add(new Buku("Marmut Merah Jambu", "Raditya Dika", gambarBuku[2]));
        listBuku.add(new Buku("Bulan", "Tere Liye", gambarBuku[3]));
        listBuku.add(new Buku("The Alchemist", "Paulo Coelho", gambarBuku[4]));
    }
}
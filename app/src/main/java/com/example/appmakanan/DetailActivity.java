package com.example.appmakanan;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class DetailActivity  extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        String nama = intent.getStringExtra("nama");
        String deskripsi = intent.getStringExtra("deskripsi");
        String harga = intent.getStringExtra("harga");
        int image = getIntent().getIntExtra("image", 0);
        getSupportActionBar().setTitle(nama);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        ImageView gambar_makanan;
        TextView nama_makanan, harga_makanan, deskripsi_makanan;
        gambar_makanan = findViewById(R.id.gambar_makanan);
        nama_makanan = findViewById(R.id.nama_makanan);
        deskripsi_makanan = findViewById(R.id.deskripsi_makanan);
        harga_makanan = findViewById(R.id.harga_makanan);

        gambar_makanan.setImageResource(image);
        nama_makanan.setText(nama);
        deskripsi_makanan.setText(deskripsi);
        harga_makanan.setText(harga);

    }


}

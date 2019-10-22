package com.example.appmakanan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class MainActivity extends AppCompatActivity {
    private List<MakananModel> makananList = new ArrayList<>();
    private MakananAdapter mAdapter;

    // Class name for Log tag
    private static final String LOG_TAG = MainActivity.class.getSimpleName();

    public static final String EXTRA_MESSAGE
            = "com.example.android.appmakanan.extra.MESSAGE";
    // Unique tag for the intent reply
    public static final int TEXT_REQUEST = 1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        mAdapter = new MakananAdapter(this,makananList);
        LinearLayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);
        prepareMakananData();
    }

    private void prepareMakananData() {
        MakananModel makanan = new MakananModel("Pecel Lele", "Pecel Lele Sambal Ijo Level 5", "15.000", R.drawable.makanan);
        makananList.add(makanan);
        makanan = new MakananModel("Nasi Goreng Mercon", "Nasi Goreng Yang Pedasnya Sadap", "14.500", R.drawable.makanan);
        makananList.add(makanan);
        makanan = new MakananModel("Sate Kambing", "Sate Kambing Super Mantab", "20.000", R.drawable.makanan);
        makananList.add(makanan);
        makanan = new MakananModel("Ayam Geprek Keju", "Ayam Geprek Ynag Ditambah Keju", "17.500", R.drawable.makanan);
        makananList.add(makanan);
        makanan = new MakananModel("Bebek Bakar", "Bebek Bakar Salju Sambal", "23.000", R.drawable.makanan);
        makananList.add(makanan);
        mAdapter.notifyDataSetChanged();
    }

    public void launchDetailActivity(View view) {
        Log.d(LOG_TAG, "Button clicked!");
        Intent intent = new Intent(MainActivity.this, DetailActivity.class);
        MakananModel makanan = makananList.get(1);
        String message = makanan.getNama_makanan();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivityForResult(intent, TEXT_REQUEST);
    }

}

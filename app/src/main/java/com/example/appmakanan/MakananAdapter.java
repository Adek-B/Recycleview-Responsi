package com.example.appmakanan;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MakananAdapter extends RecyclerView.Adapter<MakananAdapter.MyViewHolder> {
    private Context Ctx;

    private List<MakananModel> makananList;
    class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView gambar_makanan;
        TextView nama_makanan, harga_makanan;
        RelativeLayout index_makanan;
        MyViewHolder(View view) {
            super(view);
            gambar_makanan = view.findViewById(R.id.gambar_makanan);
            nama_makanan = view.findViewById(R.id.nama_makanan);
            harga_makanan = view.findViewById(R.id.harga_makanan);
            index_makanan = view.findViewById(R.id.index_makanan);
        }
    }
    public MakananAdapter(Context ctx, List<MakananModel> makananList) {
        Ctx = ctx;
        this.makananList = makananList;
    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.makanan_list, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        final MakananModel makanan = makananList.get(position);
        holder.gambar_makanan.setImageResource(makanan.getGambar_makanan());
        holder.nama_makanan.setText(makanan.getNama_makanan());
        holder.harga_makanan.setText(makanan.getHarga_makanan());
        holder.index_makanan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Ctx,DetailActivity.class);
                intent.putExtra("image", makanan.getGambar_makanan());
                intent.putExtra("nama", makanan.getNama_makanan());
                intent.putExtra("deskripsi", makanan.getDeskripsi_makanan());
                intent.putExtra("harga", makanan.getHarga_makanan());
                Ctx.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return makananList.size();
    }
}

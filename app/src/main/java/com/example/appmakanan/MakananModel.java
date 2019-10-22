package com.example.appmakanan;

import android.os.Parcelable;

public class MakananModel {
    private String nama_makanan, deskripsi_makanan, harga_makanan;
    private int gambar_makanan;

    public MakananModel(){

    }
    public MakananModel(String nama_makanan, String deskripsi_makanan, String harga_makanan, int gambar_makanan){
        this.nama_makanan = nama_makanan;
        this.deskripsi_makanan = deskripsi_makanan;
        this.harga_makanan = harga_makanan;
        this.gambar_makanan = gambar_makanan;
    }
    public String getNama_makanan(){
        return nama_makanan;
    }
    public void setNama_makanan(String nama_makanan){
        this.nama_makanan = nama_makanan;
    }
    public String getDeskripsi_makanan(){
        return deskripsi_makanan;
    }
    public void setDeskripsi_makanan(String deskripsi_makanan){
        this.deskripsi_makanan = deskripsi_makanan;
    }
    public String getHarga_makanan(){
        return harga_makanan;
    }
    public void setHarga_makanan(String harga_makanan){
        this.harga_makanan = harga_makanan;
    }
    public int getGambar_makanan(){
        return gambar_makanan;
    }
    public void setGambar_makanan(int gambar_makanan){
        this.gambar_makanan = gambar_makanan;
    }
}

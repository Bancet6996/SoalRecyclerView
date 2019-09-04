package com.example.soalrecyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;

public class Mail extends AppCompatActivity {

    private String judul, nama, isi, jam, kar;
    private int bulat;

    public Mail(String kar, String nama, String judul, String isi, String jam, int bulat){
        this.nama = nama;
        this.judul = judul;
        this.isi = isi;
        this.jam = jam;
        this.kar = kar;
        this.bulat = bulat;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getIsi() {
        return isi;
    }

    public void setIsi(String isi) {
        this.isi = isi;
    }

    public String getJam() {
        return jam;
    }

    public void setJam(String jam) {
        this.jam = jam;
    }

    public String getKar() {
        return kar;
    }

    public void setKar(String kar) {
        this.kar = kar;
    }

    public int getBulat() {
        return bulat;
    }

    public void setBulat(int bulat) {
        this.bulat = bulat;
    }

//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_mail);
//    }
}

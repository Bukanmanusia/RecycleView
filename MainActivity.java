package com.example.cobarecycleview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView = findViewById(R.id.recyclerview);

        List<student> items = new ArrayList<student>();
        items.add(new student("Nama: Abmi Sukma Edri","Nim: 1205012o0341",R.drawable.abmi));
        items.add(new student("Nama: Ahmad Kurniawan","Nim: 12250111514",R.drawable.ahmad));
        items.add(new student("Nama: Aufa Hajati","Nim: 12250120338",R.drawable.aufa));
        items.add(new student("Nama: Daffa Finanda","Nim: 12250111603",R.drawable.dafin));
        items.add(new student("Nama: Daffa Ikhwan Nurfauzan","Nim: 12250110979",R.drawable.daffa));
        items.add(new student("Nama: Dwi Jelita Adhliyah","Nim: 12250120331",R.drawable.jelita));
        items.add(new student("Nama: Dwi Mahdini","Nim: 12250111298",R.drawable.mahdi));
        items.add(new student("Nama: Fajri ","Nim: 12250110382",R.drawable.fajri));
        items.add(new student("Nama: Fakhri","Nim: 12250111381",R.drawable.fakhri));
        items.add(new student("Nama: Farras Lathief","Nim: 12250111328",R.drawable.faras));
        items.add(new student("Nama: Gilang Ramadhan Indra","Nim: 12250111323",R.drawable.gilang));
        items.add(new student("Nama: Hafidz Alhadid Rahman","Nim: 12250111794",R.drawable.hafiz));
        items.add(new student("Nama: Haritsah Naufaldy","Nim: 12250110361",R.drawable.aldy));
        items.add(new student("Nama: M. Nabil Dawami ","Nim: 12250111527",R.drawable.nabil));
        items.add(new student("Nama: Muh. Zaki Erbai Syas","Nim: 12250111134",R.drawable.zaki));
        items.add(new student("Nama: Muhammad Aditya Rinaldi ","Nim: 12250111048",R.drawable.adit));
        items.add(new student("Nama: Muhammad Dhimas Hadid Fahrezi","Nim: 12250111231",R.drawable.dimas));
        items.add(new student("Nama: Muhammad Faruq","Nim: 12250111791",R.drawable.faruq));
        items.add(new student("Nama: Muhammad Rafly Wirayudha","Nim: 12250111489",R.drawable.rafly));
        items.add(new student("Nama: Nurika Dwi Wahyuni","Nim: 12250120360",R.drawable.nurika));
        items.add(new student("Nama: Ogya Secio Noegroho.s ","Nim: 12250111346\n",R.drawable.ogik));
        items.add(new student("Nama: Rahma Laksita","Nim: 12250124357",R.drawable.rahma));
        items.add(new student("Nama: Surya Hidayatullah Firdaus","Nim: 12250111759",R.drawable.surya));

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new liststudentadapter(getApplicationContext(),items));

    }
}
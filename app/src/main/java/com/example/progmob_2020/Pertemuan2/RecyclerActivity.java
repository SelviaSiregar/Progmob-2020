package com.example.progmob_2020.Pertemuan2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.progmob_2020.Adapter.MahasiswaRecycleAdapter;
import com.example.progmob_2020.Model.Mahasiswa;
import com.example.progmob_2020.R;

import java.util.ArrayList;
import java.util.List;

public class RecyclerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);

        RecyclerView rv = (RecyclerView)findViewById(R.id.rvLatihan);
        MahasiswaRecycleAdapter mahasiswaRecycleAdapter;

        //data dummy
        List<Mahasiswa> mahasiswaList = new ArrayList<Mahasiswa>();

        //generate data mahasiswa
        Mahasiswa m1 = new Mahasiswa("Ester", "72180264", "0812345678490");
        Mahasiswa m2 = new Mahasiswa("Tesa", "72180266", "08123678954370");
        Mahasiswa m3 = new Mahasiswa("Chelsea", "72180267", "0812345678930");
        Mahasiswa m4 = new Mahasiswa("Glorya", "72180268", "0812345678907");
        Mahasiswa m5 = new Mahasiswa("Priska", "72180269", "0812345678903");

        mahasiswaList.add(m1);
        mahasiswaList.add(m2);
        mahasiswaList.add(m3);
        mahasiswaList.add(m4);
        mahasiswaList.add(m5);

        mahasiswaRecycleAdapter = new MahasiswaRecycleAdapter(RecyclerActivity.this);
        mahasiswaRecycleAdapter.setMahasiswaList(mahasiswaList);

        rv.setLayoutManager(new LinearLayoutManager(RecyclerActivity.this));
        rv.setAdapter(mahasiswaRecycleAdapter);
    }
}
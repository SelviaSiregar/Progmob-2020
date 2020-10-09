package com.example.progmob_2020.Pertemuan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.progmob_2020.Adapter.MahasiswaCardAdapter;
import com.example.progmob_2020.Adapter.MahasiswaRecyclerAdapter;
import com.example.progmob_2020.Model.Mahasiswa;
import com.example.progmob_2020.R;

import java.util.ArrayList;
import java.util.List;

public class CardViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_view);

        CardView rv  = (CardView)findViewById(R.id.rvLatihan);
        MahasiswaCardAdapter mahasiswaRecyclerAdapter;

        List<Mahasiswa> mahasiswaList = new ArrayList<Mahasiswa>();
        Mahasiswa m1 = new Mahasiswa("Selvia", "72180265", "081265875645");
        Mahasiswa m2 = new Mahasiswa("Ani", "72180266", "081265756986");
        Mahasiswa m3 = new Mahasiswa("Calno", "72180245", "081265873457");
        Mahasiswa m4 = new Mahasiswa("Tarnis", "72180224", "081265786453");
        Mahasiswa m5 = new Mahasiswa("Nurli", "72180234", "0812986770987");

        mahasiswaList.add(m1);
        mahasiswaList.add(m2);
        mahasiswaList.add(m3);
        mahasiswaList.add(m4);
        mahasiswaList.add(m5);


        MahasiswaCardAdapter mahasiswaCardAdapter = new MahasiswaCardAdapter(CardViewActivity.this);
        mahasiswaCardAdapter.setMahasiswaList(mahasiswaList);

        //rv.getLayoutManager(new LinearLayoutManager(CardViewActivity.this));
        //rv.setAdapter(mahasiswaCardAdapter);



    }
}
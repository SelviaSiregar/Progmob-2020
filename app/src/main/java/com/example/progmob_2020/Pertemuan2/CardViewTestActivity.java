package com.example.progmob_2020.Pertemuan2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ListView;

import com.example.progmob_2020.Adapter.MahasiswaRecycleAdapter;
import com.example.progmob_2020.Model.Mahasiswa;
import com.example.progmob_2020.R;

import java.util.ArrayList;
import java.util.List;

public class CardViewTestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_view_test);

        CardView cv = (CardView)findViewById(R.id.cvMahasiswa);
    }
}
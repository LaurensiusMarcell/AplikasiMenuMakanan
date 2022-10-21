package com.example.aplikasimenumakanan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recMakanan;
    private ArrayList<Makanan> listMakanan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recMakanan = findViewById(R.id.recMakanan);
        initData();

        recMakanan.setAdapter(new MakananAdapter(listMakanan));
        recMakanan.setLayoutManager(new LinearLayoutManager(this));
    }

    private void initData(){
        this.listMakanan = new ArrayList<>();
        listMakanan.add(new Makanan("Nasi Campur Bali",
                "35.000",
                "Nasi Campur Bali merupakan campuran nasi dengan berbagai macam lauk pauk seperti ayam, telur sayuran dan juga sate lilit yang biasanya terbuat dari ikan atau ayam..",
                R.drawable.nasi_campur));

        listMakanan.add(new Makanan("Seblak Bandung",
                "20.000",
                "Seblak Bandung adalah masakan khas Sunda yang dikenal berasal dari wilayah Parahyangan dengan cita rasa gurih dan pedas.",
                R.drawable.seblak_bandung));

        listMakanan.add(new Makanan("Soto Betawi",
                "28.000",
                "Soto Betawi merupakan soto yang khas dari daerah DKI Jakarta.",
                R.drawable.soto_betawi));

        listMakanan.add(new Makanan("Salad Buah",
                "12.000",
                "Salad buah merupakan sejenis makanan yang berasal dari berbagai buah-buahan kemudian diberi saus olahan dari mayonaise dan susu kental manis.",
                R.drawable.salad_buah));

        listMakanan.add(new Makanan("Wedang Ronde",
                "15.000",
                "Perpaduan antara tangyuan dan kuah jahe plus gula khas Nusantara. Tangyuan juga terbuat dari tepung ketan dan sedikit air, bisa diberi isian maupun polosan.",
                R.drawable.wedang_ronde));

        listMakanan.add(new Makanan("Siomay",
                "10.000",
                "Siomai adalah salah satu jenis dimsum. Dalam bahasa Mandarin, makanan ini disebut shaomai, sementara dalam bahasa Kanton disebut siu maai..",
                R.drawable.siomay_spesial));
    }
}
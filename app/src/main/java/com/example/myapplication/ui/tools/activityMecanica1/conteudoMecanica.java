package com.example.myapplication.ui.tools.activityMecanica1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.myapplication.R;
import com.example.myapplication.ui.tools.adapterMecanica1.AdapterMecanica1;
import com.example.myapplication.ui.tools.modelMecanica1.Postagemmec;

import java.util.ArrayList;
import java.util.List;

public class conteudoMecanica extends AppCompatActivity {



    private RecyclerView videoMecanica1;
    private List<Postagemmec> postagensmec = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conteudo_mecanica);

        videoMecanica1 = findViewById(R.id.videoMecanica1);

        //Define layout
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        videoMecanica1.setLayoutManager(layoutManager);

        //define adapter
        this.prepararPostagensmec();
        AdapterMecanica1 adapter1= new AdapterMecanica1( postagensmec );
        videoMecanica1.setAdapter(adapter1);
    }

    public void prepararPostagensmec(){

        Postagemmec p;
        p= new Postagemmec("Aula 1 -  Unidades de Medidas", "Agora ficou fácil!", R.drawable.acaomecuni);
        postagensmec.add(p);
        p = new Postagemmec("Aula 2 -  Notação Científica", "Agora ficou fácil!", R.drawable.acaomecdois);
        postagensmec.add(p);
        //Lista adicionar imagens ou videos


    }

}

package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.myapplication.ui.conteudoEletro;
import com.example.myapplication.ui.tools.activityMecanica1.conteudoMecanica;
import com.example.myapplication.ui.conteudotermodinamica;

public class paginaicial extends AppCompatActivity {

    private Button mecanicaAcesso;
    private Button termodinamicaAcesso;
    private Button eletromagnetismoAcesso;
    private Button apostilaAcesso;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paginaicial);

        mecanicaAcesso = findViewById(R.id.mecanicaAcesso);

        mecanicaAcesso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(),  conteudoMecanica.class);
                startActivity(intent);

            }
        });

        termodinamicaAcesso = findViewById(R.id.termodinamicaAcesso);

        termodinamicaAcesso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), conteudotermodinamica.class);
                startActivity(intent);

            }
        });

        eletromagnetismoAcesso = findViewById(R.id.eletromagnetismoAcesso);

        eletromagnetismoAcesso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), conteudoEletro.class);
                startActivity(intent);

            }
        });
    }

}


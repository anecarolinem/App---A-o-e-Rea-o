package com.example.myapplication.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.myapplication.R;
import com.example.myapplication.paginaicial;

public class pagprincipal extends AppCompatActivity {
    public Button acessoFisica;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagprincipal);
        acessoFisica = findViewById(R.id.acessoFisica);

        acessoFisica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), paginaicial.class);
                startActivity(intent);

            }
        });
    }
}

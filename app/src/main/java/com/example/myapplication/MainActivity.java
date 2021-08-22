package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.myapplication.ui.pagprincipal;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthException;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    private Button acessarPlataforma;
    private Button whatsapp;
    private Button instagram;
    private FirebaseAuth alunousuario = FirebaseAuth.getInstance();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        acessarPlataforma = findViewById(R.id.acessarPlataforma);

        acessarPlataforma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), pagprincipal.class);
                startActivity(intent);
            }
        });


        whatsapp = findViewById(R.id.whatsapp);

        whatsapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String contato = "https://api.whatsapp.com/message/5KYAIFIFCNAIB1";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(contato));
                startActivity(intent);

            }
        });

        instagram = findViewById(R.id.instagram);
        // Efeito de clicar e acessar um link
        instagram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String inscontato = "https://www.instagram.com/acao_reacaoo/";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(inscontato));
                startActivity(intent);
            }
        });

        //Cadrasto de Usuário//

        alunousuario.createUserWithEmailAndPassword
                ("anecarolinemaciel2@gmail.com", "91918190")
                .addOnCompleteListener(MainActivity.this, new OnCompleteListener<AuthResult>() {

                    //aperta com ctrl em cima de oncomplete... para abrir uma interface//
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        //boolean para retornar o sucesso no cadastro via - True e false
                        if (task.isSuccessful()) {
                            Log.i("CreateUser", "Cadastro efetivado");
                        } else {
                            Log.i("CreateUser", "Erro. Cadastro não efetivado");
                        }
                    }

                    ;


                });




        /*Verificação do usuario
            if  (unousuario.getCurrentUser() != null){
                Log.i("CreateUser", "Usuário logado!");
            }else{
                Log.i("CreateUser", "Usuário não logado");
            }
 */
    }
}








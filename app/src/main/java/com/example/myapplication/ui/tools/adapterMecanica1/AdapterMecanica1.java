package com.example.myapplication.ui.tools.adapterMecanica1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;
import com.example.myapplication.ui.tools.modelMecanica1.Postagemmec;

import java.util.List;

public class AdapterMecanica1 extends RecyclerView.Adapter <AdapterMecanica1.MecanicaHolder1> {

    private List<Postagemmec> postagemmec;

    public AdapterMecanica1(List<Postagemmec> p) {
        this.postagemmec = p;
    }

    @NonNull
    @Override
    public MecanicaHolder1 onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View itemListamec = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.mecanicadet, parent,false);

        return new MecanicaHolder1(itemListamec);
    }

    @Override
    public void onBindViewHolder(@NonNull MecanicaHolder1 holder, int position) {
//Recuperar postagem//
        Postagemmec postagem = postagemmec.get( position);

        // Resposta da postagem
        holder.textoVideo1.setText(postagem.getNome1());
        holder.textoPosmec.setText(postagem.getPostagem1());
        holder.videoMec1.setImageResource(postagem.getImagem1());

    }

    @Override
    //Quantidade de vezes//
    public int getItemCount() {
        return postagemmec.size();
    }

    public class MecanicaHolder1 extends RecyclerView.ViewHolder {

    private TextView textoVideo1;
    private TextView textoPosmec;
    private ImageView videoMec1;

    public MecanicaHolder1(View itemView) {

        super(itemView);
        textoVideo1 = itemView.findViewById(R.id.textoVideo1);
        textoPosmec = itemView.findViewById(R.id.textoPosmec);
        videoMec1 = itemView.findViewById(R.id.videoMec1);


        }

    }

}

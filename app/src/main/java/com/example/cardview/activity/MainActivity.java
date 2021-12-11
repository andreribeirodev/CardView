package com.example.cardview.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.helper.widget.Carousel;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Adapter;
import android.widget.LinearLayout;

import com.example.cardview.R;
import com.example.cardview.adapter.PostagemAdapter;
import com.example.cardview.model.Postagem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerPostagem;
    private List<Postagem> postagens = new ArrayList<>();

    @SuppressLint("WrongConstant")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerPostagem = findViewById(R.id.recyclerPostagem);


        // configura recyclerview - definição de layout
        LinearLayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        layoutManager.setOrientation(LinearLayout.VERTICAL);
        recyclerPostagem.setLayoutManager(layoutManager);
        recyclerPostagem.setHasFixedSize(true);

        // configura o adapter
        this.prepararPostagem();

        PostagemAdapter adapter = new PostagemAdapter(postagens);
        recyclerPostagem.setAdapter(adapter);
    }

    public void prepararPostagem() {
        Postagem p = new Postagem("André Ribeiro",
                "#TBT Jesus te Ama", R.drawable.imagem1);
        this.postagens.add(p);

        p = new Postagem("Hotel JM ",
                "Viaje, aproveito nossos combos", R.drawable.imagem2);
        this.postagens.add(p);

        p = new Postagem("Maria Luiza",
                "#Paris", R.drawable.imagem3);
        this.postagens.add(p);

        p = new Postagem("Marcos Paulo",
                "Que foto linda!", R.drawable.imagem4);
        this.postagens.add(p);


    }
}
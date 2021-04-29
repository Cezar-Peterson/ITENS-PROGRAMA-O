package com.example.aulafrasesdodia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gerarNovaFrase(View v){
        String [] frases = {
                "Nenhum homem será um grande líder se quiser fazer tudo sozinho ou se quiser levar todo o crédito por fazer isso",
                "Bom mesmo é ir à luta com determinação, abraçar a vida com paixão, perder com classe e vencer com ousadia, porque o mundo pertence a quem se atreve e a vida é muito curta, para ser insignificante",
                "Só existem dois dias do ano em que você não pode fazer nada: um se chama ontem e outro amanhã",
                "Frase 4",
                "Para ser um campeão você tem que acreditar em si mesmo quando ninguém mais acredita",
        };
        // Sortear um número
        int posicaoSorteada = new Random().nextInt(frases.length);

        TextView texto = (TextView) findViewById(R.id.textView2);
        String fraseDoDia = frases[posicaoSorteada];
        texto.setText(fraseDoDia);
        //System.out.println(frases[posicaoSorteada]);


    }
}
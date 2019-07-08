package com.example.armstrong.festivaldevero.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.TextView;

import com.example.armstrong.festivaldevero.R;

public class MainActivity extends AppCompatActivity {

    private TextView botaocontato;
    private TextView botaopalestras;
    private TextView botaoapresentacao;
    private TextView botaoincriscoes;
    private TextView botaolocalizacao;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        botaocontato = findViewById(R.id.botaocontato);
        botaopalestras = findViewById(R.id.botaopalestras);
        botaoapresentacao = findViewById(R.id.botaoapresentacao);
        botaoincriscoes = findViewById(R.id.botaoincriscoes);
        botaolocalizacao = findViewById(R.id.botaolocalizacao);



        botaocontato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),ContatoActivity.class);



                startActivity(intent);
            }




        });

        botaopalestras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),PalestrasActivity.class);



                startActivity(intent);
            }




        });

        botaoapresentacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),ApresentacaoActivity.class);



                startActivity(intent);
            }




        });


        botaolocalizacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),MapasGoogle.class);



                startActivity(intent);
            }




        });










        //public void clicaDuvidas(View view){
//
//
//        TextView textoDuvidas = findViewById(R.id.textoDuvidas);
//        textoDuvidas.setText("DEU CERTO!");

    }



}

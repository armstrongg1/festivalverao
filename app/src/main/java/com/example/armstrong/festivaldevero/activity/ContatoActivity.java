package com.example.armstrong.festivaldevero.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;

import com.example.armstrong.festivaldevero.R;

public class ContatoActivity extends AppCompatActivity {

    private Button botaovoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_duvidas);


        botaovoltar = findViewById(R.id.botaovoltar);


        botaovoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                finish();

            }
        });


    }
}

package com.example.armstrong.festivaldevero.activity;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
import android.support.design.widget.Snackbar;
import android.support.design.widget.SnackbarContentLayout;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Gravity;
import android.view.View;

import android.widget.AdapterView;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

import com.example.armstrong.festivaldevero.RecyclerItemClickListener;
import com.example.armstrong.festivaldevero.model.Palestras;

import com.example.armstrong.festivaldevero.R;
import com.example.armstrong.festivaldevero.adapter.AdapterPalestras;

import java.util.ArrayList;
import java.util.List;

public class PalestrasActivity extends AppCompatActivity {


    private RecyclerView recliclerviewprogramacao;
    private AlertDialog alerta;



    private List<Palestras> listaPalestras = new ArrayList<>();




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_palestras);

        this.criarlistaprogramacao();

        recliclerviewprogramacao =  findViewById(R.id.recliclerviewpalestras);



        //configurar adapter
        final AdapterPalestras adapterPalestras = new AdapterPalestras(listaPalestras);



        //configurar recycleviewer
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recliclerviewprogramacao.setLayoutManager(layoutManager);
        recliclerviewprogramacao.setHasFixedSize(true);
        recliclerviewprogramacao.addItemDecoration( new DividerItemDecoration(this,LinearLayout.VERTICAL));
        recliclerviewprogramacao.setAdapter(adapterPalestras);


        recliclerviewprogramacao.addOnItemTouchListener (
                    new RecyclerItemClickListener (getApplicationContext (), recliclerviewprogramacao, new RecyclerItemClickListener.OnItemClickListener () {
                        @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR1)
                        @Override
                        public void onItemClick(View view, int position) {
                            Palestras palestras = listaPalestras.get(position);
                            //botaodetalhes = findViewById(R.id.botaodetalhes);

                            //Toast toast = Toast.makeText (getApplicationContext (),"Vagas:"+ palestras.getVagas (),Toast.LENGTH_LONG);
                            //toast.setGravity(Gravity.CENTER, 0, 0);
                            //toast.show();

                            //Snackbar snack = Snackbar.make (view.findViewById (R.id.botaodetalhes), "Vagas: " + palestras.getVagas () + "\\n Período: " + palestras.getPeriodo () + "\\n Preço: " + palestras.getPreco () + palestras.getPublicoalvo () + palestras.getLocal (), Snackbar.LENGTH_INDEFINITE);


                            //snack.show ();

                            //new AlertDialog.Builder(PalestrasActivity.this).setTitle("Deletando curso").setMessage("Tem certeza que deseja deletar esse curso?").show();


                            new AlertDialog.Builder(PalestrasActivity.this)
                                    .setTitle("Detalhes")
                                    .setMessage("Vagas: " + palestras.getVagas () + "\n Período: " + palestras.getPeriodo () +
                                            "\n Preço: " + palestras.getPreco () + "\n Público Alvo: "+ palestras.getPublicoalvo () + "\n Local: " + palestras.getLocal ())
                                    .setPositiveButton("Fechar",null)
                                    .show();










                        }

                        @Override
                        public void onLongItemClick(View view, int position) {

                        }

                        @Override
                        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                        }
                    })

            );





        //publicoalvo = findViewById(R.id.publicoalvo);
        //botaodetalhes = findViewById(R.id.botaodetalhes);

        //botaodetalhes.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                //Intent intent = new Intent(getApplicationContext(),PalestrasActivity.class);

  //              publicoalvo.setVisibility (View.VISIBLE);

                //startActivity(intent);
    //        }

      //  });



    }

    public void criarlistaprogramacao(){

        Palestras palestras = new Palestras("Olhares expandidos a partir da perspectiva do teatro negro","estudantes e interessados em teatro e arte em geral.","01","6 de fevereiro de 2018","11h às 12h","Conservatório UFMG – miniauditório","a partir de 12 anos","Entrada franca, limitada à capacidade do espaço","O lugar do negro nas Artes Cênicas é o foco desta leitura, que busca lançar um olhar atento sobre a cena negra produzida no teatro de Belo Horizonte e, por sua vez, apresentar e tecer algumas reflexões a partir do livro O teatro negro em perspectiva: dramaturgia e cena negra no Brasil e Cuba, lançado no ano de 2017, pela editora Malê.","Marcos Alexandre (UFMG) – Professor da UFMG, onde atua na graduação e na pós-graduação do curso de Letras e ministra disciplinas no curso de Teatro. É bolsista do CNPq, integrante cofundador do Mayombe Grupo de Teatro (1995) e coordenador do NEIA – FALE/UFMG. Realizou pesquisas de pós-doutorado no ISA – Havana e no PPGAC, da UFBA (2008-2009); e no Instituto de Performance e Política das Américas – NYU e no NEPPA – PPGAC – Unirio (2017-2018). Publica e desenvolve pesquisas sobre literaturas hispânicas, performance, teatro latino-americano e teatro negro.","Carlos José");
        listaPalestras.add(palestras);

        palestras = new Palestras("teste","testealvo","02","0","0","0","0","0","0","0","Armstrong");
        listaPalestras.add(palestras);

        palestras = new Palestras("teste","testealvo","03","0","0","0","0","0","0","0","Tiago");
        listaPalestras.add(palestras);


    }



}

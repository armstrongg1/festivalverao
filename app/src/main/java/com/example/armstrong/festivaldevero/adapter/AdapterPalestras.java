package com.example.armstrong.festivaldevero.adapter;



import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.util.List;

import com.example.armstrong.festivaldevero.R;
import com.example.armstrong.festivaldevero.model.Palestras;

public class AdapterPalestras extends RecyclerView.Adapter<AdapterPalestras.MyViewHolder> {

    private List<Palestras> listaPalestras;


    public AdapterPalestras(List<Palestras> lista) {
        this.listaPalestras = lista;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {

        View itemLista = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.palestraslayout,viewGroup,false);

        return new MyViewHolder(itemLista);
    }

    @Override
    public void onBindViewHolder(MyViewHolder myViewHolder, int i) {

        Palestras palestras = listaPalestras.get(i);
        myViewHolder.titulo.setText(myViewHolder.titulo.getText()+palestras.getTitulo());
        //myViewHolder.titulo.setText("galo");
        myViewHolder.palestrante.setText(myViewHolder.palestrante.getText()+palestras.getPalestrante());
        //myViewHolder.palestrante.setText("galonaveia");

        myViewHolder.publicoalvo.setText(myViewHolder.publicoalvo.getText()+palestras.getPublicoalvo());
        //myViewHolder.vagas.setText(myViewHolder.vagas.getText()+palestras.getVagas());
        //myViewHolder.periodo.setText(myViewHolder.periodo.getText()+palestras.getPeriodo());
        //myViewHolder.horario.setText(myViewHolder.horario.getText()+palestras.getHorario());
        //myViewHolder.local.setText(myViewHolder.local.getText()+palestras.getLocal());
        //myViewHolder.classificacaoetaria.setText(myViewHolder.classificacaoetaria.getText()+palestras.getClassificacaoetaria());
        //myViewHolder.preco.setText(myViewHolder.preco.getText()+palestras.getPreco());
        //myViewHolder.resumopalestra.setText(myViewHolder.resumopalestra.getText()+palestras.getResumopalestra());
        //myViewHolder.curriculopalestrante.setText(myViewHolder.curriculopalestrante.getText()+palestras.getCurriculopalestrante());



       // myViewHolder.titulo.setText("Teste");
        //myViewHolder.publicoalvo.setText("TESTE01");
        //myViewHolder.vagas.setText("50");

    }

    @Override
    public int getItemCount() {
       // return 5;
        return listaPalestras.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{


        TextView titulo;
        TextView publicoalvo;
        TextView vagas;
        TextView periodo;
        TextView horario;
        TextView local;
        TextView classificacaoetaria;
        TextView preco;
        TextView resumopalestra;
        TextView curriculopalestrante;
        TextView palestrante;
        Button mostrarmais;



        public MyViewHolder(View itemView) {
            super(itemView);

            titulo = itemView.findViewById(R.id.titulo);
            publicoalvo = itemView.findViewById(R.id.publicoalvo);
            //vagas = itemView.findViewById(R.id.vagas);
            //periodo = itemView.findViewById(R.id.periodo);
            //horario = itemView.findViewById(R.id.horario);
            //local = itemView.findViewById(R.id.local);
            //classificacaoetaria = itemView.findViewById(R.id.classificacaoetaria);
            //preco = itemView.findViewById(R.id.preco);
            //resumopalestra = itemView.findViewById(R.id.resumopalestra);
            //curriculopalestrante = itemView.findViewById(R.id.curriculopalestrante);
            palestrante = itemView.findViewById(R.id.palestrante);
            //mostrarmais = itemView.findViewById(R.id.detalhes);

//            publicoalvo.setVisibility (View.INVISIBLE);

        }







    }



}



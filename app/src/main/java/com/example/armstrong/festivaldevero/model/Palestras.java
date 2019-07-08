package com.example.armstrong.festivaldevero.model;

import java.io.Serializable;

public class Palestras implements Serializable {

    private String titulo;
    private String publicoalvo;
    private String vagas;
    private String periodo;
    private String horario;
    private String local;
    private String classificacaoetaria;
    private String preco;
    private String resumopalestra;
    private String curriculopalestrante;
    private String palestrante;


    public Palestras(){ }

    public Palestras(String titulo, String publicoalvo, String vagas, String periodo, String horario, String local, String classificacaoetaria, String preco, String resumopalestra, String curriculopalestrante, String palestrante) {
        this.titulo = titulo;
        this.publicoalvo = publicoalvo;
        this.vagas = vagas;
        this.periodo = periodo;
        this.horario = horario;
        this.local = local;
        this.classificacaoetaria = classificacaoetaria;
        this.preco = preco;
        this.resumopalestra = resumopalestra;
        this.curriculopalestrante = curriculopalestrante;
        this.palestrante = palestrante;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getPublicoalvo() {
        return publicoalvo;
    }

    public void setPublicoalvo(String publicoalvo) {
        this.publicoalvo = publicoalvo;
    }

    public String getVagas() {
        return vagas;
    }

    public void setVagas(String vagas) {
        this.vagas = vagas;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getClassificacaoetaria() {
        return classificacaoetaria;
    }

    public void setClassificacaoetaria(String classificacaoetaria) {
        this.classificacaoetaria = classificacaoetaria;
    }

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }

    public String getResumopalestra() {
        return resumopalestra;
    }

    public void setResumopalestra(String resumopalestra) {
        this.resumopalestra = resumopalestra;
    }

    public String getCurriculopalestrante() {
        return curriculopalestrante;
    }

    public void setCurriculopalestrante(String curriculopalestrante) {
        this.curriculopalestrante = curriculopalestrante;
    }

    public String getPalestrante() {
        return palestrante;
    }

    public void setPalestrante(String palestrante) {
        this.palestrante = palestrante;
    }
}




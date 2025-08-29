package com.sokolovski.projetojavagit.model;

import jakarta.persistence.*;

@Entity
@Table(name = "pessoa")

public class Pessoa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private int idade;

    public  Pessoa() {}
    public Pessoa(String nome, int idade){

        this.idade = idade;
        this.nome = nome;
    }
    public String getNome() { return nome;}
    public void setNome(String nome) { this.nome=nome;}
    public Integer getIdade() { return idade;}
    public void  setIdade(Integer idade) { this.idade= idade;}


}

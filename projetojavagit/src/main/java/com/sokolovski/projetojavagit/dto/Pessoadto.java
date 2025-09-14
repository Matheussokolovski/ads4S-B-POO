package com.sokolovski.projetojavagit.dto;

public class Pessoadto {
    private String nome;
    private Integer idade;

    public Pessoadto() {}
    public Pessoadto(String nome, Integer idade) {
        this.nome = nome;
        this.idade = idade;
    }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public Integer getIdade() { return idade; }
    public void setIdade(Integer idade) { this.idade = idade; }
}

package com.tulipa.flor.dto;

public class ProfessorDto {
    public String nome;
    public String cpf;

    @Deprecated
    public ProfessorDto() {
    }

    public ProfessorDto(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getCpf() {
        return cpf;
    }


    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}

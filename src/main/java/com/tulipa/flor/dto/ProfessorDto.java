package com.tulipa.flor.dto;

import com.tulipa.flor.modelo.Professor;

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

    public Professor novoProfessor(){
        return new Professor(nome, cpf);
    }   
}

package com.example.demo.DTO;

import com.example.demo.Enum.Risco;

public class InvestimentoDTO {
    private String email;
    private String nome;
    private String cpf;
    private double valorPrevisto;
    private int periodoDeAplicacao;
    private Risco risco;

    public InvestimentoDTO(String email, String nome, String cpf, double valorPrevisto, int periodoDeAplicacao, Risco risco) {
        this.email = email;
        this.nome = nome;
        this.cpf = cpf;
        this.valorPrevisto = valorPrevisto;
        this.periodoDeAplicacao = periodoDeAplicacao;
        this.risco = risco;
    }

    public InvestimentoDTO() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public double getValorPrevisto() {
        return valorPrevisto;
    }

    public void setValorPrevisto(double valorPrevisto) {
        this.valorPrevisto = valorPrevisto;
    }

    public int getPeriodoDeAplicacao() {
        return periodoDeAplicacao;
    }

    public void setPeriodoDeAplicacao(int periodoDeAplicacao) {
        this.periodoDeAplicacao = periodoDeAplicacao;
    }

    public Risco getRisco() {
        return risco;
    }

    public void setRisco(Risco risco) {
        this.risco = risco;
    }
}

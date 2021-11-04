package com.example.demo.Investimento;

public enum Risco {
    ALTO(0.025),
    MEDIO(0.015),
    BAIXO(0.005);

    private double taxaDeRetorno;

    public double getTaxaDeRetorno() {
        return taxaDeRetorno;
    }

    public void setTaxaDeRetorno(double taxaDeRetorno) {
        this.taxaDeRetorno = taxaDeRetorno;
    }

    Risco(double taxaDeRetorno) {
        this.taxaDeRetorno = taxaDeRetorno;
    }
}

package com.senai.polimorfism.example2;

public class PJ extends Pagamentos {
    double workTime;
    private Double valuePerHour;
    public PJ(String nome, double workTime, double valuePerHour) {
        super(nome);
        this.workTime = workTime;
        this.valuePerHour = valuePerHour;
    }

    @Override
    double calcularPagamento() {
        return valuePerHour*workTime;
    }
}

package com.senai.abstracao.example2_payment_employee;

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

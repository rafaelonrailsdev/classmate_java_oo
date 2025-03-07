package com.senai.polimorfism.example2;

public class CLT extends Pagamentos {
    double salary;
    public CLT(String nome, double salary) {
        super(nome);
        this.salary = salary;
    }

    @Override
    double calcularPagamento() {
        return salary;
    }
}

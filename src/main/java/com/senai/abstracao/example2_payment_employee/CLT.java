package com.senai.abstracao.example2_payment_employee;

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

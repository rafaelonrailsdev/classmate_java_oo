package com.senai.abstracao.example_gerenciamento_funcionarios;

public class FuncionarioTemporario extends Funcionario{
    private int horaExtra;
    private double valorHoraExata;

    public FuncionarioTemporario(String nome, double salario, int horasExtra, double valorHoraExtra) {
        super(nome, salario);
        this.horaExtra = horasExtra;
        this.valorHoraExata = valorHoraExtra;
    }

    @Override
    public void calcularBonus() {
        salario+= horaExtra*valorHoraExata;
    }
}

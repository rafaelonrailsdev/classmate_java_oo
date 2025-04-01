package com.senai.abstracao.example_gerenciamento_funcionarios;

public class FuncionarioEfetivo extends Funcionario {
    private double bonusMensal;

    public FuncionarioEfetivo(String nome, double salario, double bonusMensal) {
        super(nome, salario);
        this.bonusMensal = bonusMensal;

    }


    @Override
    public void calcularBonus() {
        salario+=bonusMensal;
    }
}

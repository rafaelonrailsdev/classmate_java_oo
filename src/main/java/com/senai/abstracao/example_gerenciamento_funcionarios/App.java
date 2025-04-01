package com.senai.abstracao.example_gerenciamento_funcionarios;

public class App {

    public static void main(String[] args) {
        testarFuncionarios(new FuncionarioEfetivo("Rafael",1000,10));

        testarFuncionarios(new FuncionarioTemporario("Gislene", 1000, 100,200));
    }
    public static void testarFuncionarios(Funcionario funcionario){
        funcionario.exibirDados();
        funcionario.aumentarSalario(10);
        funcionario.calcularBonus();
        funcionario.exibirDados();
        System.out.println();
    }
}

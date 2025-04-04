package org.example;

import javax.swing.*;

public class Caixa extends Funcionario{

    public Caixa(String nome, double salario, int idade) {
        super(nome, salario, idade);
    }



    public double calculaSalario() {
        return salario;
    }

    @Override
    public String toString() {
        return "Caixa " + nome + "\n" +
                "Salário total: R$" + calculaSalario() + "\n";
    }
}

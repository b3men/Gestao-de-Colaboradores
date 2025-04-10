package org.example;

import javax.swing.*;

public class Seguranca extends Funcionario{

    protected String periodoTrabalhado;
    protected double valorAdicional;
    public Seguranca (String nome, double salario, int idade, String periodoTrabalhado, double valorAdicional){
        super(nome, salario, idade);
        this.periodoTrabalhado = "Matutino";
        this.valorAdicional = 0;
    }
    public void verificaPeriodoTrabalhado() {
            if (periodoTrabalhado != null) {
                this.periodoTrabalhado = periodoTrabalhado;
            } else {
                JOptionPane.showMessageDialog(null, "A quantidade de vendas não pode ser negativa. Definindo como 0.");
                this.periodoTrabalhado = null ;
            }
    }

    public void verificaValorNegativo(double valorAdicional) {
        if (periodoTrabalhado == "Noturno") {
            if (valorAdicional >= 0) {
                this.valorAdicional = valorAdicional;
            } else {
                JOptionPane.showMessageDialog(null, "A quantidade de vendas não pode ser negativa. Definindo como 0.");
                this.valorAdicional = 0;
            }
        }
    }

    public double calculaSalario() {
        return salario + valorAdicional;
    }

    @Override
    public String toString() {
        return "Segurança " + nome + "\n" +
                "Salário total: R$" + calculaSalario() + "\n";
    }

}

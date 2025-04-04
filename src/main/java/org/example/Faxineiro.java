package org.example;

import javax.swing.*;

public class Faxineiro extends Funcionario{
    private double qtdTurnoTrabalhado;
    private double valorBonusPorTurno;

    public Faxineiro(String nome, double salario, int idade) {
        super(nome, salario, idade);
        this.qtdTurnoTrabalhado = 0;
        this.valorBonusPorTurno = 0;
    }

    public void verificaValorNegativo(double qtdTurnoTrabalhado, double valorBonusPorTurno) {
        if (qtdTurnoTrabalhado >= 0 && valorBonusPorTurno >= 0) {
            this.qtdTurnoTrabalhado = qtdTurnoTrabalhado;
            this.valorBonusPorTurno = valorBonusPorTurno;
        } else {
            JOptionPane.showMessageDialog(null, "A quantidade de vendas não pode ser negativa. Definindo como 0.");
            this.qtdTurnoTrabalhado = 0;
            this.valorBonusPorTurno = 0;
        }
    }

    public double calculaSalario() {
        double totalAdicionalTurno;
        totalAdicionalTurno = qtdTurnoTrabalhado * valorBonusPorTurno;
        return salario + totalAdicionalTurno;
    }

    @Override
    public String toString() {
        return "Vendedor " + nome + "\n" +
                "Salário total: R$" + calculaSalario() + "\n";
    }
}




package org.example;

import javax.swing.*;

public class Repositor extends Funcionario{
    protected double qtdHoraTrabalhada;
    protected double valorHora;

    public Repositor(String nome, double salario, int idade){
        super(nome, salario, idade);
        this.qtdHoraTrabalhada = 0;
        this.valorHora = 0;
    }

    public void verificaValorNegativo(double qtdHoraTrabalhada, double valorHora) {
        if (qtdHoraTrabalhada >= 0 && valorHora >= 0) {
            this.qtdHoraTrabalhada = qtdHoraTrabalhada;
            this.valorHora = valorHora;
        } else {
            JOptionPane.showMessageDialog(null, "A quantidade de horas trabalhadas e/ou o valor da hora não podem ser negativas(os). Definindo como 0.");
            this.qtdHoraTrabalhada = 0;
            this.valorHora = 0;
        }
    }

    public double calculaSalario() {
        return qtdHoraTrabalhada * valorHora;
    }

    @Override
    public String toString() {
        return "Repositor " + nome + "\n" +
                "Salário total: R$" + calculaSalario() + "\n";
    }
}

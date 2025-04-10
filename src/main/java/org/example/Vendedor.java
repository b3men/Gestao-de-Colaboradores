package org.example;

import javax.swing.*;

public class Vendedor extends Funcionario {
    protected double quantidadeVenda;
    protected double valorComissaoPorVenda;

    public Vendedor(String nome, double salario, int idade) {
        super(nome, salario, idade);
        this.quantidadeVenda = 0;
        this.valorComissaoPorVenda = 0;
    }

    public void verificaValorNegativo(double quantidadeVenda, double valorComissaoPorVenda) {
        if (quantidadeVenda >= 0 && valorComissaoPorVenda >= 0) {
            this.quantidadeVenda = quantidadeVenda;
            this.valorComissaoPorVenda = valorComissaoPorVenda;
        } else {
            JOptionPane.showMessageDialog(null, "A quantidade de vendas e/ou o valor da comissão não podem ser negativas(os). Definindo como 0.");
            this.quantidadeVenda = 0;
            this.valorComissaoPorVenda = 0;
        }
    }

    public double calculaSalario() {
        double totalComissao;
        totalComissao = valorComissaoPorVenda * quantidadeVenda;
        return salario + totalComissao;
    }

    @Override
    public String toString() {
        return "Vendedor " + nome + "\n" +
                "Salário total: R$" + calculaSalario() + "\n";
    }
}

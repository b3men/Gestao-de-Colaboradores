package org.example;

import javax.swing.*;

public class Funcionario {
    protected String nome;
    protected double salario;
    protected int idade;
    protected String periodoTrabalhado;

    public Funcionario(String nome, double salario, int idade) {
        this.nome = nome;
        this.salario = salario;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getPeriodoTrabalhado() {
        return periodoTrabalhado;
    }

    public void setPeriodoTrabalhado(String periodoTrabalhado) {
        this.periodoTrabalhado = periodoTrabalhado;
    }

    protected double verificaSalarioNegativo(double salario){
        if (salario < 0){
            JOptionPane.showMessageDialog(null, " O valor inserido é negativo, por esse motivo será definido como 0 (zero). ");
            salario = 0;
        }
        return salario;
    }

    @Override
    public String toString() {
        String ret = "Funcionario: " + nome +
                     "Idade: " + idade +
                     "Salário: " + salario;
        return ret;
    }
}

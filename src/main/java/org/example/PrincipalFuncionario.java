package org.example;

import javax.swing.*;
import java.util.ArrayList;

public class PrincipalFuncionario {

    //relatório e cadastro de caixas
    static ArrayList<Caixa> caixas = new ArrayList<>();
    public static ArrayList<Caixa> getCaixas() { return caixas; }
    public static void cadastraCaixa(String nome, double salario, int idade) {
        Caixa c = new Caixa(nome,salario,idade);
        caixas.add(c);
    }

    //relatório e cadastro de vendedores
    static ArrayList<Vendedor> vendedores = new ArrayList<>();
    public static ArrayList<Vendedor> getVendedores() { return vendedores;    }
    public static void cadastraVendedor(String nome, double salario, int idade) {
        Vendedor v = new Vendedor(nome, salario, idade);
        vendedores.add(v);
    }

    //relatório e cadastro de repositores
    static ArrayList<Repositor> repositores = new ArrayList<>();
    public static ArrayList<Repositor> getRepositores() { return repositores;    }
    public static void cadastraRepositor(String nome, double salario, int idade) {
        Repositor r = new Repositor(nome,salario,idade);
        repositores.add(r);
    }

    //relatório e cadastro de seguranças
    static ArrayList<Seguranca> segurancas = new ArrayList<>();
    public static ArrayList<Seguranca> getSeguranca() { return segurancas; }
    public static void cadastraSeguranca(String nome, double salario, int idade, String periodoTrabalhado, double valorAdicional) {
        Seguranca s = new Seguranca(nome,salario,idade,periodoTrabalhado,valorAdicional);
        segurancas.add(s);
    }

    //relatório e cadastro de faxineiro
    static ArrayList<Faxineiro> faxineiros = new ArrayList<>();
    public static ArrayList<Faxineiro> getFaxineiro() { return faxineiros; }
    public static void cadastraFaxineiro(String nome, double salario, int idade, double qtdTurnoTrabalhado, double valorBonusPorTurno) {
        Faxineiro f = new Faxineiro(nome, salario, idade, qtdTurnoTrabalhado, valorBonusPorTurno);
        faxineiros.add(f);
    }


    public static void main(String[] args) {
        int op = 0;
        String menu = " Menu \n" +
                "1- Inserir um caixa. \n" +
                "2- Inserir um vendedor. \n" +
                "3- Inserir um repositor. \n" +
                "4- Inserir um segurança. \n" +
                "5- Inserir um faxineiro. \n" +
                "6- Sair. \n";

        do {
            op = Integer.parseInt(JOptionPane.showInputDialog(null, menu));

            String nome = JOptionPane.showInputDialog("Digite o nome:");
            int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade:"));
            double salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o salário:"));
            String periodoTrabalhado = JOptionPane.showInputDialog("Digite o período trabalhado:");
            double valorAdicional = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor adicional:"));
            double qtdTurnoTrabalhado = Double.parseDouble(JOptionPane.showInputDialog("Digite o quantidade de turnos trabalhados:"));
            double valorBonusPorTurno = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor bonus por turno:"));


            if (op == 1) cadastraCaixa(nome,salario,idade);
            if (op == 2) cadastraVendedor(nome, salario, idade);
            if (op == 3) cadastraRepositor(nome,salario,idade);
            if (op == 4) cadastraSeguranca(nome, salario, idade, periodoTrabalhado, valorAdicional);
            if (op == 5) cadastraFaxineiro(nome,salario,idade,qtdTurnoTrabalhado, valorBonusPorTurno);

            JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");
        } while (op != 6);

    }

}
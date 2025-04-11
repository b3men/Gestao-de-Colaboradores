package org.example;

import javax.swing.*;
import java.util.ArrayList;

public class PrincipalFuncionario {

    public static void imprimeFuncionario() {
        if (caixas.isEmpty() && vendedores.isEmpty() && repositores.isEmpty() && segurancas.isEmpty() && faxineiros.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nenhum colaborador cadastrado.");
            return;
        }
        StringBuilder mensagem = new StringBuilder("Lista de Colaboradores:\n");
        if (!caixas.isEmpty()) {
            mensagem.append("\n-- Caixas --\n");
            for (Caixa c : caixas) {
                mensagem.append(c.getNome()).append(" - Salário: R$").append(c.calculaSalario()).append("\n");
            }
        }
        if (!vendedores.isEmpty()) {
            mensagem.append("\n-- Vendedores --\n");
            for (Vendedor v : vendedores) {
                mensagem.append(v.getNome()).append(" - Salário: R$").append(v.calculaSalario()).append("\n");
            }
        }
        if (!repositores.isEmpty()) {
            mensagem.append("\n-- Repositores --\n");
            for (Repositor r : repositores) {
                mensagem.append(r.getNome()).append(" - Salário: R$").append(r.calculaSalario()).append("\n");
            }
        }
        if (!segurancas.isEmpty()) {
            mensagem.append("\n-- Seguranças --\n");
            for (Seguranca s : segurancas) {
                mensagem.append(s.getNome()).append(" - Salário: R$").append(s.calculaSalario()).append("\n");
            }
        }
        if (!faxineiros.isEmpty()) {
            mensagem.append("\n-- Faxineiros --\n");
            for (Faxineiro f : faxineiros) {
                mensagem.append(f.getNome()).append(" - Salário: R$").append(f.calculaSalario()).append("\n");
            }
        }
        JOptionPane.showMessageDialog(null, mensagem.toString());
    }
    /*-------------------------------------------------------------------------------------------------*/
    static ArrayList<Caixa> caixas = new ArrayList<>();
    public static ArrayList<Caixa> getCaixas() { return caixas; }
    public static void cadastraCaixa(String nome, double salario, int idade) {
        Caixa c = new Caixa(nome,salario,idade);
        caixas.add(c);
    }
    public static void imprimeCaixa(){
        if (caixas.isEmpty()){
            JOptionPane.showMessageDialog(null, "Nenhum caixa cadastrado.");
            return;
        }
        StringBuilder mensagemCaixa = new StringBuilder("Lista de caixas cadastrados: \n");
        if (!caixas.isEmpty()){
            for (Caixa c : caixas){
                mensagemCaixa.append(c.getNome()).append(" - Salário: R$").append(c.calculaSalario()).append("\n");
            }
        }
        JOptionPane.showMessageDialog(null, mensagemCaixa.toString());
    }
    /*-------------------------------------------------------------------------------------------------*/
    static ArrayList<Vendedor> vendedores = new ArrayList<>();
    public static ArrayList<Vendedor> getVendedores() { return vendedores;    }
    public static void cadastraVendedor(String nome, double salario, int idade) {
        Vendedor v = new Vendedor(nome, salario, idade);
        vendedores.add(v);
    }
    public static void imprimeVendedor(){
        if (vendedores.isEmpty()){
            JOptionPane.showMessageDialog(null, "Nenhum vendedor cadastrado.");
            return;
        }
        StringBuilder mensagemVendedor = new StringBuilder("Lista de vendedores cadastrados: \n");
        if (!vendedores.isEmpty()){
            for (Vendedor v : vendedores){
                mensagemVendedor.append(v.getNome()).append(" - Salário: R$").append(v.calculaSalario()).append("\n");
            }
        }
        JOptionPane.showMessageDialog(null, mensagemVendedor.toString());
    }
    /*-------------------------------------------------------------------------------------------------*/
    static ArrayList<Repositor> repositores = new ArrayList<>();
    public static ArrayList<Repositor> getRepositores() { return repositores;    }
    public static void cadastraRepositor(String nome, double salario, int idade) {
        Repositor r = new Repositor(nome,salario,idade);
        repositores.add(r);
    }
    public static void imprimeRepositor(){
        if (repositores.isEmpty()){
            JOptionPane.showMessageDialog(null, "Nenhum repositor cadastrado.");
            return;
        }
        StringBuilder mensagemRepositor = new StringBuilder("Lista de repositores cadastrados: \n");
        if (!repositores.isEmpty()){
            for (Repositor r : repositores){
                mensagemRepositor.append(r.getNome()).append(" - Salário: R$").append(r.calculaSalario()).append("\n");
            }
        }
        JOptionPane.showMessageDialog(null, mensagemRepositor.toString());
    }
    /*-------------------------------------------------------------------------------------------------*/
    static ArrayList<Seguranca> segurancas = new ArrayList<>();
    public static ArrayList<Seguranca> getSegurancas() { return segurancas; }
    public static void cadastraSeguranca(String nome, double salario, int idade, String periodoTrabalhado, double valorAdicional) {
        Seguranca s = new Seguranca(nome,salario,idade,periodoTrabalhado,valorAdicional);
        segurancas.add(s);
    }
    public static void imprimeSeguranca(){
        if (segurancas.isEmpty()){
            JOptionPane.showMessageDialog(null, "Nenhum segurança cadastrado.");
            return;
        }
        StringBuilder mensagemSeguranca = new StringBuilder("Lista de seguranças cadastrados: \n");
        if (!segurancas.isEmpty()){
            for (Seguranca s : segurancas){
                mensagemSeguranca.append(s.getNome()).append(" - Salário: R$").append(s.calculaSalario()).append("\n");
            }
        }
        JOptionPane.showMessageDialog(null, mensagemSeguranca.toString());
    }
    /*-------------------------------------------------------------------------------------------------*/
    static ArrayList<Faxineiro> faxineiros = new ArrayList<>();
    public static ArrayList<Faxineiro> getFaxineiros() { return faxineiros; }
    public static void cadastraFaxineiro(String nome, double salario, int idade, double qtdTurnoTrabalhado, double valorBonusPorTurno) {
        Faxineiro f = new Faxineiro(nome, salario, idade, qtdTurnoTrabalhado, valorBonusPorTurno);
        faxineiros.add(f);
    }
    public static void imprimeFaxineiro(){
        if (faxineiros.isEmpty()){
            JOptionPane.showMessageDialog(null, "Nenhum faxineiro cadastrado.");
            return;
        }
        StringBuilder mensagemFaxineiro = new StringBuilder("Lista de faxineiros cadastrados: \n");
        if (!faxineiros.isEmpty()){
            for (Faxineiro f : faxineiros){
                mensagemFaxineiro.append(f.getNome()).append(" - Salário: R$").append(f.calculaSalario()).append("\n");
            }
        }
        JOptionPane.showMessageDialog(null, mensagemFaxineiro.toString());
    }
    /*-------------------------------------------------------------------------------------------------*/

    public static void main(String[] args) {
        int op = 0;
        String menu = " Menu \n" +
                "1- Cadastrar um caixa. \n" +
                "2- Cadastrar um vendedor. \n" +
                "3- Cadastrar um repositor. \n" +
                "4- Cadastrar um segurança. \n" +
                "5- Cadastrar um faxineiro. \n" +
                "6- Imprime todos os funcionários cadastrados. \n" +
                "7- Imprime todos os caixas. \n" +
                "8- Imprime todos os vendedores. \n" +
                "9- Imprime todos os repositores. \n" +
                "10- Imprime todos os seguranças. \n" +
                "11- Imprime todos os faxineiros. \n" +
                "12- Sair. \n";

        do {
            op = Integer.parseInt(JOptionPane.showInputDialog(null, menu));

            if (op == 1) {
                String nomeCaixa = JOptionPane.showInputDialog("Digite o nome:");
                int idadeCaixa = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade:"));
                double salarioCaixa = Double.parseDouble(JOptionPane.showInputDialog("Digite o salário:"));
                cadastraCaixa(nomeCaixa,salarioCaixa,idadeCaixa);
                JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");
            }
            if (op == 2){
                String nomeVendedor = JOptionPane.showInputDialog("Digite o nome:");
                int idadeVendedor = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade:"));
                double salarioVendedor = Double.parseDouble(JOptionPane.showInputDialog("Digite o salário:"));
                cadastraVendedor(nomeVendedor, salarioVendedor, idadeVendedor);
                JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");
            }
            if (op == 3) {
                String nomeRepositor = JOptionPane.showInputDialog("Digite o nome:");
                int idadeRepositor = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade:"));
                double salarioRepositor = Double.parseDouble(JOptionPane.showInputDialog("Digite o salário:"));
                cadastraRepositor(nomeRepositor,salarioRepositor,idadeRepositor);
                JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");
            }
            if (op == 4) {
                String nomeSeguranca = JOptionPane.showInputDialog("Digite o nome:");
                int idadeSeguranca = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade:"));
                double salarioSeguranca = Double.parseDouble(JOptionPane.showInputDialog("Digite o salário:"));
                String periodoTrabalhado = JOptionPane.showInputDialog("Digite o período trabalhado:");
                double valorAdicional = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor adicional:"));
                cadastraSeguranca(nomeSeguranca, salarioSeguranca, idadeSeguranca, periodoTrabalhado, valorAdicional);
                JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");
            }
            if (op == 5) {
                String nomeFaxineiro = JOptionPane.showInputDialog("Digite o nome:");
                int idadeFaxineiro = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade:"));
                double salarioFaxineiro = Double.parseDouble(JOptionPane.showInputDialog("Digite o salário:"));
                double qtdTurnoTrabalhado = Double.parseDouble(JOptionPane.showInputDialog("Digite o quantidade de turnos trabalhados:"));
                double valorBonusPorTurno = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor bonus por turno:"));
                cadastraFaxineiro(nomeFaxineiro,salarioFaxineiro,idadeFaxineiro,qtdTurnoTrabalhado, valorBonusPorTurno);
                JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");
            }
            if (op == 6) imprimeFuncionario();
            if (op == 7) imprimeCaixa();
            if (op == 8) imprimeVendedor();
            if (op == 9) imprimeRepositor();
            if (op == 10) imprimeSeguranca();
            if (op == 11) imprimeFaxineiro();

        } while (op != 12);

    }

}
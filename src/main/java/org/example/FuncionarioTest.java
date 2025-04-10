package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FuncionarioTest {
    @Test
    public void testCaixaComSalarioFixo() {
        Caixa caixa = new Caixa("Ana", 2500.00, 30);
        assertEquals(2500.00, caixa.calculaSalario());
    }

    @Test
    public void testVendedorComComissao() {
        Vendedor vendedor = new Vendedor("Carlos", 1200.00, 25);
        vendedor.verificaValorNegativo(10, 50.00); // 10 vendas * R$50 + salário base
        assertEquals(1700.00, vendedor.calculaSalario());
    }

    @Test
    public void testVendedorComValoresNegativos() {
        Vendedor vendedor = new Vendedor("Carlos", 1200.00, 25);
        vendedor.verificaValorNegativo(-5, -50.00);
        assertEquals(1200.00, vendedor.calculaSalario()); // apenas salário base
    }

    @Test
    public void testRepositorPagamentoPorHora() {
        Repositor repositor = new Repositor("João", 0, 28);
        repositor.verificaValorNegativo(160, 15.00); // 160h * R$15
        assertEquals(2400.00, repositor.calculaSalario());
    }

    @Test
    public void testRepositorComValoresNegativos() {
        Repositor repositor = new Repositor("João", 0, 28);
        repositor.verificaValorNegativo(-160, -15.00);
        assertEquals(0.00, repositor.calculaSalario());
    }

    @Test
    public void testSegurancaSemAdicionalNoturno() {
        Seguranca seguranca = new Seguranca("Bruno", 2200.00, 40, "Matutino", 300.00);
        seguranca.verificaPeriodoTrabalhado(); // define o período correto
        seguranca.verificaValorNegativo(300.00); // como não é noturno, não soma
        assertEquals(2200.00, seguranca.calculaSalario());
    }

    @Test
    public void testSegurancaComAdicionalNoturno() {
        Seguranca seguranca = new Seguranca("Bruno", 2200.00, 40, "Noturno", 300.00);
        seguranca.verificaPeriodoTrabalhado();
        seguranca.verificaValorNegativo(300.00);
        assertEquals(2500.00, seguranca.calculaSalario());
    }

    @Test
    public void testSegurancaComValoresNegativos() {
        Seguranca seguranca = new Seguranca("Bruno", 2200.00, 40, "Noturno", -300.00);
        seguranca.verificaPeriodoTrabalhado();
        seguranca.verificaValorNegativo(-300.00);
        assertEquals(2200.00, seguranca.calculaSalario()); // adicional zera
    }

    @Test
    public void testFaxineiroSemTurnoExtra() {
        Faxineiro faxineiro = new Faxineiro("Maria", 1800.00, 35, 0, 100.00);
        faxineiro.verificaValorNegativo(0, 100.00);
        assertEquals(1800.00, faxineiro.calculaSalario());
    }

    @Test
    public void testFaxineiroComTurnoExtra() {
        Faxineiro faxineiro = new Faxineiro("Maria", 1800.00, 35, 0, 0); // valores padrão
        faxineiro.verificaValorNegativo(3, 100.00);
        assertEquals(2100.00, faxineiro.calculaSalario());
    }

    @Test
    public void testFaxineiroComValoresNegativos() {
        Faxineiro faxineiro = new Faxineiro("Maria", 1800.00, 35, 0, 0);
        faxineiro.verificaValorNegativo(-3, -100.00);
        assertEquals(1800.00, faxineiro.calculaSalario());
    }
}



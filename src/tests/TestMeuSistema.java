package tests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import profissao.Caminhoneiro;
import profissao.Medico;
import profissao.Professor;
import profissao.Taxista;
import sistema.MeuSistemaDeTributacao;

public class TestMeuSistema {

    MeuSistemaDeTributacao sistema = new MeuSistemaDeTributacao();

    Taxista contribuinte1;
    Caminhoneiro contribuinte2;
    Medico contribuinte3;
    Professor contribuinte4;
    Taxista contribuinte5;

    @Before
    public void start() {
        contribuinte1 = sistema.cadastrarTaxista("Lucas", 200);
        contribuinte2 = sistema.cadastrarCaminhoneiro("Davi", 25);
        contribuinte3 = sistema.cadastrarMedico("Vanessa", 700);
        contribuinte4 = sistema.cadastrarProfessor("Tiago", 1212);
    }

    @Test
    public void testNome() {
        Assert.assertEquals("Lucas", contribuinte1.getNome());
        Assert.assertEquals("Davi", contribuinte2.getNome());
    }

    @Test
    public void testContribuinte() {
        Assert.assertEquals(700, contribuinte3.getPacientesAno());
        Assert.assertEquals(1212, contribuinte4.getSalarioAno(), 10);
    }

    @Test
    public void testImposto() {
        Assert.assertEquals(11, contribuinte1.calcularImposto(100), 0);
        Assert.assertEquals(2050, contribuinte2.calcularImposto(5000), 0);
        Assert.assertEquals(6500, contribuinte3.calcularImposto(500), 0);
        Assert.assertEquals(0, contribuinte4.calcularImposto(325), 0);
    }

    @Test
    public void testRiqueza() {
        Assert.assertFalse(sistema.avaliarRiquza(contribuinte1));
        contribuinte5 = sistema.cadastrarTaxista("Pedro", 180);
        contribuinte1.addBem("Carro", 100000);
        Assert.assertTrue(sistema.avaliarRiquza(contribuinte1));
    }
}

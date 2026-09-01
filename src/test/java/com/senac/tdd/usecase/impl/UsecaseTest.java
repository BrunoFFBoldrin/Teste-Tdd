package com.senac.tdd.usecase.impl;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class UsecaseTest{
    @Test
    public void testSomar(){
        Usecase calculadora = new Usecase();
        Double actual = calculadora.somar((double) 2,3.0);
        Assertions.assertEquals(5, actual);

    }
    @Test
    public void testeSomarQuandoPassarValorNull(){
        Usecase calculadora = new Usecase();
        RuntimeException actual = Assertions.assertThrows(RuntimeException.class, () -> {
            calculadora.somar(null,null);
        }) ;

        Assertions.assertEquals("Não pode passar nulo, seu burro!", actual.getMessage());
    }

    @Test
    public void testeSomarQuandoPassarValorAcimade10000(){
        Usecase calculadora = new Usecase();
        RuntimeException actual = Assertions.assertThrows(RuntimeException.class, () -> {
            calculadora.somar(10000.1, 5.0);
        });

        Assertions.assertEquals("Não pode ser maior que 10 mil",actual.getMessage());
    }

    @Test
    public void testeSomarQuandoPassarNumerosIguais(){
        Usecase calculadora = new Usecase();
        RuntimeException actual = Assertions.assertThrows(RuntimeException.class, () -> {
            calculadora.somar(5000.0,5000.0);
        });

        Assertions.assertEquals("Não pode somar valores iguais",actual.getMessage());
    }

    @Test
    public void testeDivisaoDividendoPorZero(){
        Usecase calculadora = new Usecase();
        RuntimeException actual = Assertions.assertThrows(RuntimeException.class, () -> {
            calculadora.divisao(0.0, 5.0);
        });

        Assertions.assertEquals("Dividendo não pode ser 0", actual.getMessage());
    }

    @Test
    public void testeDivisorPorZero(){
        Usecase calculadora = new Usecase();
        RuntimeException actual = Assertions.assertThrows(RuntimeException.class, () -> {
            calculadora.divisao(5.0, 0.0);
        });

        Assertions.assertEquals("Divisor não pode ser 0",  actual.getMessage());
    }

    @Test
    public void testeDivisaoNaoPodeDividirPorSete(){
        Usecase calculadora = new Usecase();
        RuntimeException actual = Assertions.assertThrows(RuntimeException.class, () -> {
            calculadora.divisao(7.0, 5.0);
        });
        //Kojima (Fernndo) falou que não pode
        Assertions.assertEquals("Kojima falou, que não pode dividir por sete", actual.getMessage());
    }

    @Test
    public void testeMutiplicacaoPorZero(){
        Usecase calculadora = new Usecase();
        RuntimeException actual = Assertions.assertThrows(RuntimeException.class, ()-> {
            calculadora.multiplicar(7.0, 0.0);
        });
        Assertions.assertEquals("Falha, valor não alterado. Ao multiplicar por 0, o valor não altera.", actual.getMessage());
    }

    @Test
    public void testeSubtracaoSemValor(){
        Usecase calculadora = new Usecase();
        RuntimeException actual = Assertions.assertThrows(RuntimeException.class, () -> {
            calculadora.subtrair(0.0,0.0);
        });
        Assertions.assertEquals("Falha, para poder fazer essa operaçãpo, pelo menos um dos valores deve ser maior que zero.", actual.getMessage());
    }
}

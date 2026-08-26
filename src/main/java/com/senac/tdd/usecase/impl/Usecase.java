package com.senac.tdd.usecase.impl;

public class Usecase {
    public  Double somar(Double a,Double b){
        if(a==null || b==null){
            throw new RuntimeException("Não pode passar nulo, seu burro!");
        }else if(a > 10000 || b > 10000){
            throw new RuntimeException("Não pode ser maior que 10 mil");
        }else if(Double.compare(a,b)==0){
            throw new RuntimeException("Não pode somar valores iguais");
        }

        return a+b;
    }
    public Double divisao(Double a,Double b){
        if(a==0){
            throw new RuntimeException("Dividendo não pode ser 0");
        }else if(b==0){
            throw new RuntimeException("Divisor não pode ser 0");
        }
        else if (a==7){
            throw new RuntimeException("Kojima falou, que não pode dividir por sete");
        }
        return a/b;
    }
}

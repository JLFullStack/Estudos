package com.projeto.atribuicaoreferencia;

public class Main {
    public static void main(String[] args) {
        int
            a = 1,
            b = a;

        System.out.println("a = " + a);
        System.out.println("b = " + b + "\n");

        b = 2;
        System.out.println("a = " + a);
        System.out.println("b = " + b  + "\n");

        MeuObj
            objA = new MeuObj(1),
            objB = objA;

        System.out.println("objA = " + objA);
        System.out.println("objB = " + objB + "\n");

        objA.setNum(2);
        System.out.println("objA = " + objA);
        System.out.println("objB = " + objB + "\n");
    }
}

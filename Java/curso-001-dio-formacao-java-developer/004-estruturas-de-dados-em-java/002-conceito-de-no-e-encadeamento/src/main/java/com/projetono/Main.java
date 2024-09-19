package com.projetono;

public class Main {
    public static void main(String[] args) {
        No<String>
            no1 = new No<>("Conteúdo no1"),
            no2 = new No<>("Conteúdo no2"),
            no3 = new No<>("Conteúdo no3"),
            no4 = new No<>("Conteúdo no4");

        no1.setPoximoNo(no2);
        no2.setPoximoNo(no3);
        no3.setPoximoNo(no4);

        System.out.println(no1);
        System.out.println(no1.getPoximoNo());
        System.out.println(no1.getPoximoNo().getPoximoNo());
        System.out.println(no1.getPoximoNo().getPoximoNo().getPoximoNo());
        System.out.println(no1.getPoximoNo().getPoximoNo().getPoximoNo().getPoximoNo());
    }
}

package io.github.dearrudam.falandodecollections;

import java.util.*;

public class Parte01 {

    public static void main(String[] args) {

        int num1=1;
        int num2=2;
        int num3=3;
        int[] numeros2 = new int[]{num1,num2};
//         0, 1
//        [1, 2]
        System.out.println("numeros = " + Arrays.toString(numeros2));


        Collection listaDeNumeros = new ArrayList();
        listaDeNumeros.add(num1);
        listaDeNumeros.add(num2);
        listaDeNumeros.add(num3);
        listaDeNumeros.add(num3);

        System.out.println("numeros utilizando list = " + listaDeNumeros.toString());

        Collection listaDeNumeros2 = new HashSet();
        listaDeNumeros2.add(num1);
        listaDeNumeros2.add(num2);
        listaDeNumeros2.add(num3);
        listaDeNumeros2.add(num3);
        System.out.println("numeros utilizando set = " + listaDeNumeros2.toString());



    }

}

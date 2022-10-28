package edu.Java.tema.operadores;

public class Operadores {
    
    public static void main(String[] args) {
        
        /////////operadores aritméticos//////////

        String nomeCompleto = "LINGUAGEM " + "JAVA";
        System.out.println(nomeCompleto);

        int somaNumeros = 5 + 10;
        System.out.println(somaNumeros);

        String contatenacao = "?";

        contatenacao = 1 + 1 + 1 + "1";
        System.out.println(contatenacao);

        contatenacao = 1 + "1" + 1 + 1;
        System.out.println(contatenacao);

        contatenacao = "1" + (1+1+1);
        System.out.println(contatenacao);

        //////// operadores unarios /////////
         
        int numero = 5;
        numero = - numero;
        System.out.println(numero);
        
        numero = numero * -1; //PARA TORNAR POSITIVO NOVAMENTE 
        System.out.println(numero);
    }

}

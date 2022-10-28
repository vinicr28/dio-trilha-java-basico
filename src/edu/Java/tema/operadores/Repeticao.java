package edu.Java.tema.operadores;

public class Repeticao {
    
    public static void main(String[] args) {
        int numero = 5;

       /// numero = numero + 1;

        ///numero++; 

        System.out.println(numero--);//não foi 4 aqui pois ele faz o print antes e depois faz a decrementação 

        System.out.println(numero);

        boolean variavel = true;

        System.out.println(!variavel);

        System.out.println(variavel);

        variavel = !variavel;
        System.out.println(variavel);
    }
}

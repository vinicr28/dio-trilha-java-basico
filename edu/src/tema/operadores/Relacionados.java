package edu.Java.tema.operadores;

public class Relacionados {
    
    public static void main(String[] args) {
        
        String nomeUm = "vini";
        String nomeDois = new String("vini");

        System.out.println(nomeUm == nomeDois);
        System.out.println(nomeUm.equals(nomeDois)); //comparar objetos
        
        
        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        if(numero1 < numero2) {
            System.out.println("Nossa condicao e verdadeira");
        }

        System.out.println("Os numeros são iguais? " + simNao);

        simNao = numero1 != numero2;

        System.out.println("Os numeros são diferentes? " + simNao);

        simNao = numero1 < numero2;

        System.out.println("Os numero1 é menor que numero2? " + simNao);

        simNao = numero1 > numero2;

        System.out.println("Os numero1 é maior que numero2? " + simNao);
    }
}

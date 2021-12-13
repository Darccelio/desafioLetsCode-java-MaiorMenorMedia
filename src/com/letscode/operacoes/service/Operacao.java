package com.letscode.operacoes.service;

import com.letscode.operacoes.utils.Leitor;

public class Operacao {

    private static int tam = 5;
    private static float maiorNum = 0f;
    private static float menorNum = 0f;
    private static float media = 0f;
    private static int[] array = new int[tam];

    public static void armazenarArray() {
        for( int i=0; i<tam; i++ ) {
            array[i] = Leitor.escanearEntradaNumeros();
        }
    }

    public static float maiorNumero() {
        int i=0;
        maiorNum = array[0];
        for(i=0; i<tam; i++ ) {
            if(array[i] > maiorNum) {
                maiorNum = array[i];
            }
        }
        return maiorNum;
    }

    public static float menorNumero() {
        int i=0;
        menorNum = array[0];
        for(i=0; i<tam; i++ ) {
            if(array[i] < menorNum) {
                menorNum = array[i];
            }
        }
        return menorNum;
    }

    public static float mediaArray() {
        float soma = 0f;

        for(int i=0; i<tam; i++) {
            media = media + array[i];
        }
        return media/tam;
    }



}

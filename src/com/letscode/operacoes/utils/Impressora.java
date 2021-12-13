package com.letscode.operacoes.utils;

public class Impressora {

    private final static String MENSAGEM_INSERCAO_NUMEROS = "Por favor, insira um número .....: ";
    private final static String MOSTRAR_MAIOR_NUMERO = "O maior número do array é .....: ";
    private final static String MOSTRAR_MENOR_NUMERO = "O menor número do array é .....: ";
    private final static String MOSTRAR_MEDIA_NUMEROS= "A média dos números do array é .....: ";


    public static void mostrarInserirNumArray() {
        System.out.print(MENSAGEM_INSERCAO_NUMEROS);
    }

    public static void mostrarMsgMaiorNum(float num) {
        System.out.println(MOSTRAR_MAIOR_NUMERO + num);
    }

    public static void mostrarMsgMenorNum(float num) {
        System.out.println(MOSTRAR_MENOR_NUMERO + num);
    }

    public static void mostrarMsgMediarNum(float num) {
        System.out.println(MOSTRAR_MEDIA_NUMEROS + num);
    }


}

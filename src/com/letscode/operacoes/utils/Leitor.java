package com.letscode.operacoes.utils;

        import java.util.Scanner;

public class Leitor {

    private static Scanner sc = new Scanner(System.in);

    public static int escanearEntradaNumeros() {
        Impressora.mostrarInserirNumArray();
        return sc.nextInt();
    }
}


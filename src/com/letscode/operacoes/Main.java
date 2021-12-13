package com.letscode.operacoes;

import com.letscode.operacoes.service.Operacao;
import com.letscode.operacoes.utils.Impressora;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Operacao.armazenarArray();
        float maior = Operacao.maiorNumero();
        float menor = Operacao.menorNumero();
        float media =Operacao.mediaArray();

        Impressora.mostrarMsgMaiorNum(maior);
        Impressora.mostrarMsgMenorNum(menor);
        Impressora.mostrarMsgMediarNum(media);



    }
}

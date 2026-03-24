package com.paulo.pagamentos;

public class GerenciadorPagamentos {
    public static void main(String[] args) {
        
        // Lambda para PIX
        MetodoPagamento pix = valor -> 
            System.out.println("[PIX] Processando R$ " + valor + " com 5% de desconto.");

        // Lambda para Cartão
        MetodoPagamento cartao = valor -> 
            System.out.println("[CARTÃO] Processando R$ " + valor + " em até 12x.");

        double valorVenda = 150.0;

        System.out.println("--- INICIANDO PAGAMENTOS ---");
        executarOperacao(valorVenda, pix);
        executarOperacao(valorVenda, cartao);
    }

    public static void executarOperacao(double valor, MetodoPagamento metodo) {
        metodo.processar(valor);
    }
}
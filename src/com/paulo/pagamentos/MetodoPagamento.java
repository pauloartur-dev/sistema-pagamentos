package com.paulo.pagamentos;

@FunctionalInterface
public interface MetodoPagamento {
    void processar(double valor);
}
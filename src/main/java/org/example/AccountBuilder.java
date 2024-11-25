package org.example;

public class AccountBuilder {
    private String titular = "";
    private double cantidad = 0;

    public AccountBuilder setTitular(String titular) {
        this.titular = titular;
        return this;
    }

    public AccountBuilder setCantidad(double cantidad) {
        this.cantidad = cantidad;
        return this;
    }

    public Account createAccount() {
        return new Account(titular, cantidad);
    }
}
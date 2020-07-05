package br.com.extrato.utils;

public class ApiException extends RuntimeException{
    public int codigo;

    public ApiException(int codigo,String message) {
        super(message);
        this.codigo = codigo;
    }
}

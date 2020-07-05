package br.com.extrato.model.dto;

public class DadosDomicilioBancario {
    private Integer codigoBanco;
    private Integer numeroAgencia;
    private String numeroContaCorrente;

    public DadosDomicilioBancario() {
    }

    public DadosDomicilioBancario(Integer codigoBanco, Integer numeroAgencia, String numeroContaCorrente) {
        this.codigoBanco = codigoBanco;
        this.numeroAgencia = numeroAgencia;
        this.numeroContaCorrente = numeroContaCorrente;
    }

    public Integer getCodigoBanco() {
        return codigoBanco;
    }

    public void setCodigoBanco(Integer codigoBanco) {
        this.codigoBanco = codigoBanco;
    }

    public Integer getNumeroAgencia() {
        return numeroAgencia;
    }

    public void setNumeroAgencia(Integer numeroAgencia) {
        this.numeroAgencia = numeroAgencia;
    }

    public String getNumeroContaCorrente() {
        return numeroContaCorrente;
    }

    @Override
    public String toString() {
        return " Ag:" + numeroAgencia+" | CC:" + numeroContaCorrente;
    }

    public void setNumeroContaCorrente(String numeroContaCorrente) {
        this.numeroContaCorrente = numeroContaCorrente;
    }
}

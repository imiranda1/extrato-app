package br.com.extrato.model;

import java.math.BigDecimal;

public class ItemExtrato {

    private String dataLancamento;
    private String descricao;
    private Long numero;
    private String situacao;
    private String dataConfirmacao;
    private String dadosBancarios;
    private BigDecimal valorFinal;

    public ItemExtrato() {
    }

    public ItemExtrato(String dataLancamento, String descricao, Long numero, String situacao, String dataConfirmacao, String dadosBancarios, BigDecimal valorFinal) {
        this.dataLancamento = dataLancamento;
        this.descricao = descricao;
        this.numero = numero;
        this.situacao = situacao;
        this.dataConfirmacao = dataConfirmacao;
        this.dadosBancarios = dadosBancarios;
        this.valorFinal = valorFinal;
    }

    public String getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(String dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Long getNumero() {
        return numero;
    }

    public void setNumero(Long numero) {
        this.numero = numero;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public String getDataConfirmacao() {
        return dataConfirmacao;
    }

    public void setDataConfirmacao(String dataConfirmacao) {
        this.dataConfirmacao = dataConfirmacao;
    }

    public String getDadosBancarios() {
        return dadosBancarios;
    }

    public void setDadosBancarios(String dadosBancarios) {
        this.dadosBancarios = dadosBancarios;
    }

    public BigDecimal getValorFinal() {
        return valorFinal;
    }

    public void setValorFinal(BigDecimal valorFinal) {
        this.valorFinal = valorFinal;
    }
}

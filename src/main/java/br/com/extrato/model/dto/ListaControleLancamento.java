package br.com.extrato.model.dto;

import java.math.BigDecimal;
import java.util.Date;

public class ListaControleLancamento {
    private LancamentoContaCorrenteCliente lancamentoContaCorrenteCliente;
    private String dataEfetivaLancamento;
    private String dataLancamentoContaCorrenteCliente;
    private Long numeroEvento;
    private String descricaoGrupoPagamento;
    private String codigoIdentificadorUnico;
    private String nomeBanco;
    private Integer quantidadeLancamentoRemessa;
    private String numeroRaizCNPJ;
    private String numeroSufixoCNPJ;
    private BigDecimal valorLancamentoRemessa;
    private Date dateLancamentoContaCorrenteCliente;
    private Date dateEfetivaLancamento;


    public ListaControleLancamento() {
    }

    public ListaControleLancamento(LancamentoContaCorrenteCliente lancamentoContaCorrenteCliente,
                                   String dataEfetivaLancamento,
                                   String dataLancamentoContaCorrente,
                                   Long numeroEvento, String descricaoGrupoPagamento,
                                   String codigoIdentificadorUnico, String nomeBanco,
                                   Integer quantidadeLancamentoRemessa,
                                   String numeroRaizCNPJ, String numeroSufixoCNPJ,
                                   BigDecimal valorLancamentoRemessa,
                                   Date dateLancamentoContaCorrenteCliente,
                                   Date dateEfetivaLancamento) {
        this.lancamentoContaCorrenteCliente = lancamentoContaCorrenteCliente;
        this.dataEfetivaLancamento = dataEfetivaLancamento;
        this.dataLancamentoContaCorrenteCliente = dataLancamentoContaCorrente;
        this.numeroEvento = numeroEvento;
        this.descricaoGrupoPagamento = descricaoGrupoPagamento;
        this.codigoIdentificadorUnico = codigoIdentificadorUnico;
        this.nomeBanco = nomeBanco;
        this.quantidadeLancamentoRemessa = quantidadeLancamentoRemessa;
        this.numeroRaizCNPJ = numeroRaizCNPJ;
        this.numeroSufixoCNPJ = numeroSufixoCNPJ;
        this.valorLancamentoRemessa = valorLancamentoRemessa;
        this.dateLancamentoContaCorrenteCliente = dateLancamentoContaCorrenteCliente;
        this.dateEfetivaLancamento = dateEfetivaLancamento;
    }

    public LancamentoContaCorrenteCliente getLancamentoContaCorrenteCliente() {
        return lancamentoContaCorrenteCliente;
    }

    public void setLancamentoContaCorrenteCliente(LancamentoContaCorrenteCliente lancamentoContaCorrenteCliente) {
        this.lancamentoContaCorrenteCliente = lancamentoContaCorrenteCliente;
    }

    public String getDataEfetivaLancamento() {
        return dataEfetivaLancamento;
    }

    public void setDataEfetivaLancamento(String dataEfetivaLancamento) {
        this.dataEfetivaLancamento = dataEfetivaLancamento;
    }

    public String getDataLancamentoContaCorrenteCliente() {
        return dataLancamentoContaCorrenteCliente;
    }

    public void setDataLancamentoContaCorrenteCliente(String dataLancamentoContaCorrenteCliente) {
        this.dataLancamentoContaCorrenteCliente = dataLancamentoContaCorrenteCliente;
    }

    public Long getNumeroEvento() {
        return numeroEvento;
    }

    public void setNumeroEvento(Long numeroEvento) {
        this.numeroEvento = numeroEvento;
    }

    public String getDescricaoGrupoPagamento() {
        return descricaoGrupoPagamento;
    }

    public void setDescricaoGrupoPagamento(String descricaoGrupoPagamento) {
        this.descricaoGrupoPagamento = descricaoGrupoPagamento;
    }

    public String getCodigoIdentificadorUnico() {
        return codigoIdentificadorUnico;
    }

    public void setCodigoIdentificadorUnico(String codigoIdentificadorUnico) {
        this.codigoIdentificadorUnico = codigoIdentificadorUnico;
    }

    public String getNomeBanco() {
        return nomeBanco;
    }

    public void setNomeBanco(String nomeBanco) {
        this.nomeBanco = nomeBanco;
    }

    public Integer getQuantidadeLancamentoRemessa() {
        return quantidadeLancamentoRemessa;
    }

    public void setQuantidadeLancamentoRemessa(Integer quantidadeLancamentoRemessa) {
        this.quantidadeLancamentoRemessa = quantidadeLancamentoRemessa;
    }

    public String getNumeroRaizCNPJ() {
        return numeroRaizCNPJ;
    }

    public void setNumeroRaizCNPJ(String numeroRaizCNPJ) {
        this.numeroRaizCNPJ = numeroRaizCNPJ;
    }

    public String getNumeroSufixoCNPJ() {
        return numeroSufixoCNPJ;
    }

    public void setNumeroSufixoCNPJ(String numeroSufixoCNPJ) {
        this.numeroSufixoCNPJ = numeroSufixoCNPJ;
    }

    public BigDecimal getValorLancamentoRemessa() {
        return valorLancamentoRemessa;
    }

    public void setValorLancamentoRemessa(BigDecimal valorLancamentoRemessa) {
        this.valorLancamentoRemessa = valorLancamentoRemessa;
    }

    public Date getDateLancamentoContaCorrenteCliente() {
        return dateLancamentoContaCorrenteCliente;
    }

    public void setDateLancamentoContaCorrenteCliente(Date dateLancamentoContaCorrenteCliente) {
        this.dateLancamentoContaCorrenteCliente = dateLancamentoContaCorrenteCliente;
    }

    public Date getDateEfetivaLancamento() {
        return dateEfetivaLancamento;
    }

    public void setDateEfetivaLancamento(Date dateEfetivaLancamento) {
        this.dateEfetivaLancamento = dateEfetivaLancamento;
    }
}

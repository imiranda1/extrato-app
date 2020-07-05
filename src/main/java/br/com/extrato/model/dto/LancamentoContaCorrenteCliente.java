package br.com.extrato.model.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.ArrayList;
import java.util.List;

public class LancamentoContaCorrenteCliente {

    private Long numeroRemessaBanco;
    @JsonIgnore
    private List<?> dadosAnaliticoLancamentoFinanceiroCliente = new ArrayList<>(); // dados não idenficados
    private String nomeSituacaoRemessa;
    private DadosDomicilioBancario dadosDomicilioBancario;
    private String nomeTipoOperacao;

    public LancamentoContaCorrenteCliente() {
    }

    public LancamentoContaCorrenteCliente(Long numeroRemessaBanco,
                                          List<?> dadosAnaliticosLancamentoFinanceiroCliente,
                                          String nomeSituacaoRemessa,
                                          DadosDomicilioBancario dadosDomicilioBancario,
                                          String nomeTipoOperacao) {
        this.numeroRemessaBanco = numeroRemessaBanco;
        this.dadosAnaliticoLancamentoFinanceiroCliente = dadosAnaliticosLancamentoFinanceiroCliente;
        this.nomeSituacaoRemessa = nomeSituacaoRemessa;
        this.dadosDomicilioBancario = dadosDomicilioBancario;
        this.nomeTipoOperacao = nomeTipoOperacao;
    }

    public Long getNumeroRemessaBanco() {
        return numeroRemessaBanco;
    }

    public void setNumeroRemessaBanco(Long numeroRemessaBanco) {
        this.numeroRemessaBanco = numeroRemessaBanco;
    }

    public List<?> getDadosAnaliticoLancamentoFinanceiroCliente() {
        return dadosAnaliticoLancamentoFinanceiroCliente;
    }

    public void setDadosAnaliticoLancamentoFinanceiroCliente(List<?> dadosAnaliticoLancamentoFinanceiroCliente) {
        this.dadosAnaliticoLancamentoFinanceiroCliente = dadosAnaliticoLancamentoFinanceiroCliente;
    }

    public String getNomeSituacaoRemessa() {
        return nomeSituacaoRemessa;
    }

    public void setNomeSituacaoRemessa(String nomeSituacaoRemessa) {
        this.nomeSituacaoRemessa = nomeSituacaoRemessa;
    }

    public DadosDomicilioBancario getDadosDomicilioBancario() {
        return dadosDomicilioBancario;
    }

    public void setDadosDomicilioBancario(DadosDomicilioBancario dadosDomicilioBancario) {
        this.dadosDomicilioBancario = dadosDomicilioBancario;
    }

    public String getNomeTipoOperacao() {
        return nomeTipoOperacao;
    }

    public void setNomeTipoOperacao(String nomeTipoOperacao) {
        this.nomeTipoOperacao = nomeTipoOperacao;
    }
}

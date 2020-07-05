package br.com.extrato.model.dto;

import java.util.ArrayList;
import java.util.List;

public class ExtratoConta {
    private TotalControleLancamento totalControleLancamento;
    private List<ListaControleLancamento> listaControleLancamento = new ArrayList<>();
    private Integer indice;
    private Integer tamanhoPagina;
    private Integer totalElements;

    public ExtratoConta() {
    }

    public ExtratoConta(TotalControleLancamento totalControleLancamento,
                        List<ListaControleLancamento> listaControleLancamentoList,
                        Integer indice, Integer tamanhoPagina,
                        Integer totalElements) {
        this.totalControleLancamento = totalControleLancamento;
        this.listaControleLancamento = listaControleLancamentoList;
        this.indice = indice;
        this.tamanhoPagina = tamanhoPagina;
        this.totalElements = totalElements;
    }

    public TotalControleLancamento getTotalControleLancamento() {
        return totalControleLancamento;
    }

    public void setTotalControleLancamento(TotalControleLancamento totalControleLancamento) {
        this.totalControleLancamento = totalControleLancamento;
    }

    public List<ListaControleLancamento> getListaControleLancamento() {
        return listaControleLancamento;
    }

    public void setListaControleLancamento(List<ListaControleLancamento> listaControleLancamento) {
        this.listaControleLancamento = listaControleLancamento;
    }

    public Integer getIndice() {
        return indice;
    }

    public void setIndice(Integer indice) {
        this.indice = indice;
    }

    public Integer getTamanhoPagina() {
        return tamanhoPagina;
    }

    public void setTamanhoPagina(Integer tamanhoPagina) {
        this.tamanhoPagina = tamanhoPagina;
    }

    public Integer getTotalElements() {
        return totalElements;
    }

    public void setTotalElements(Integer totalElements) {
        this.totalElements = totalElements;
    }

}

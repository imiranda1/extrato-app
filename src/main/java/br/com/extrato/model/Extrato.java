package br.com.extrato.model;


import java.util.ArrayList;
import java.util.List;

/*classe modelo para expor os dados na API*/

public class Extrato {
    private List<ItemExtrato> lancamentos = new ArrayList<>();
    private Integer indice;
    private Integer tamanhoPagina;
    private Integer totalElementos;

    public Extrato() {
    }

    public Extrato(List<ItemExtrato> lancamentos, Integer indice, Integer tamanhoPagina, Integer totalElementos) {
        this.lancamentos = lancamentos;
        this.indice = indice;
        this.tamanhoPagina = tamanhoPagina;
        this.totalElementos = totalElementos;
    }

    public List<ItemExtrato> getLancamentos() {
        return lancamentos;
    }

    public void setLancamentos(List<ItemExtrato> lancamentos) {
        this.lancamentos = lancamentos;
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

    public Integer getTotalElementos() {
        return totalElementos;
    }

    public void setTotalElementos(Integer totalElementos) {
        this.totalElementos = totalElementos;
    }
}

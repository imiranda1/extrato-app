package br.com.extrato.service;
/* classe responsavel por converter o json do legado*/

import br.com.extrato.model.Extrato;
import br.com.extrato.model.ItemExtrato;
import br.com.extrato.model.dto.ExtratoConta;
import br.com.extrato.model.dto.ListaControleLancamento;
import br.com.extrato.utils.ApiException;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;


import java.io.*;
import java.util.ArrayList;
import java.util.List;
@Component
public class ExtratoServico {


    public ExtratoConta converterLegado() {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            FileReader fileReader = new FileReader("./lancamento-conta-legado.json");
            ExtratoConta extrato = objectMapper.readValue(fileReader, ExtratoConta.class);
            return extrato;
        }
        catch  (JsonParseException e) {
            throw new ApiException(2,"Erro na conversão do arquivo");
        } catch (JsonMappingException e) {
            throw new ApiException(3,"Erro no mapeamento do Objeto/Json");
        } catch (IOException e) {
            throw new ApiException(1,"Erro na leitura do arquivo");
        }

    }

    public Extrato manipularDados (ExtratoConta extratoConta) {
        List<ItemExtrato> lancamentos = new ArrayList<ItemExtrato>();
        Extrato extrato = new Extrato();

        if (!(CollectionUtils.isEmpty(extratoConta.getListaControleLancamento()))) {
            for (ListaControleLancamento lista : extratoConta.getListaControleLancamento()) {
                ItemExtrato itemExtrato = new ItemExtrato();
                itemExtrato.setDataLancamento(lista.getDataLancamentoContaCorrenteCliente());
                itemExtrato.setDescricao(lista.getLancamentoContaCorrenteCliente().getNomeTipoOperacao());
                itemExtrato.setNumero(lista.getLancamentoContaCorrenteCliente().getNumeroRemessaBanco());
                itemExtrato.setSituacao(lista.getLancamentoContaCorrenteCliente().getNomeSituacaoRemessa());
                itemExtrato.setDataConfirmacao(lista.getDataEfetivaLancamento());
                itemExtrato.setDadosBancarios(lista.getNomeBanco().toString().trim() + lista.getLancamentoContaCorrenteCliente().getDadosDomicilioBancario().toString());
                itemExtrato.setValorFinal(lista.getValorLancamentoRemessa());
                lancamentos.add(itemExtrato);
            }

            extrato.setLancamentos(lancamentos);
            extrato.setIndice(extratoConta.getIndice());
            extrato.setTamanhoPagina(extratoConta.getTamanhoPagina());
            extrato.setTotalElementos(extratoConta.getTotalElements());
            return extrato;
        }

        return extrato;
    }


    public Extrato gerarExtrato(){
        ExtratoConta extratoConta = converterLegado();
        return manipularDados(extratoConta);
    }
}

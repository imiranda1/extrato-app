package br.com.extrato.controller;

import br.com.extrato.model.Extrato;
import br.com.extrato.service.ExtratoServico;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Api(value="ApiREST Extrato")
@RestController
@RequestMapping(value = "/extrato")
public class ExtratoController {
    @Autowired
    ExtratoServico extratoServico;


    @ApiOperation(value="Lista Extrato")
    @GetMapping(produces="application/json")
    public Extrato listarExtrato(){

        return extratoServico.gerarExtrato();
    }
}
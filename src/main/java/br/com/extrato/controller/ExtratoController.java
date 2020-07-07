package br.com.extrato.controller;

import br.com.extrato.model.Extrato;
import br.com.extrato.service.ExtratoServico;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Api(value="Extrato")
@RestController
@RequestMapping(value = "/extrato")
@CrossOrigin
public class ExtratoController {

    @Autowired
    ExtratoServico extratoServico;

    @ApiOperation(value = "listarExtrato", nickname = "consultaExtrato", notes = "consulta lançamentos extrato", response = Extrato.class, tags={ "Extrato"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Consulta efetuada com sucesso", response = Extrato.class),
            @ApiResponse(code = 400, message = "requisição inválida"),
            @ApiResponse(code = 500, message = "Erro no servidor") })

    @GetMapping(produces="application/json")
    public Extrato listarExtrato(){

        return extratoServico.gerarExtrato();
    }
}
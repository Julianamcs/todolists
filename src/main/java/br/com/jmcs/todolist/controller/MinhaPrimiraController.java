package br.com.jmcs.todolist.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//http://localhost:8080/rota
@RequestMapping("/primeiraRota")
public class MinhaPrimiraController {

     /*Metodos de acesso do HTTP
     *GET - Buscar uma informacao ou dados
     *POST - Adicionar uma informacao ou dados
     *PUT - Alterar uma informacao ou dados
     *DELETE - Remover uma informacao ou dados
     *PATCH - Alterar somente um parte de uma informacao ou dado
     *VOID 
     */

     /*Metodos (Funcionalidade) de uma classe */
     @GetMapping("/")
    public String primeiroMensagem(){
        return "Funcionou";
    }
}

package com.maquinadebusca.app.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping ("/coletor") // URL: http://localhost:8080/coletor
public class Coletor {
    // URL: http://localhost:8080/coletor/iniciar
    @GetMapping (value = "/iniciar", produces = MediaType.TEXT_PLAIN_VALUE)
    public String iniciar () {
        return "{resp: 'coletor iniciado com sucesso'}";
    }

    @GetMapping (value = "/", produces = MediaType.TEXT_PLAIN_VALUE)
    public String index () {
        return "{resp: 'coletor iniciado com sucesso'}";
    }    
}
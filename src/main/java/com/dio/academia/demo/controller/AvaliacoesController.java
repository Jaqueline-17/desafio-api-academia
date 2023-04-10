package com.dio.academia.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dio.academia.demo.entity.AvaliacaoFisica;
import com.dio.academia.demo.entity.dto.AvaliacaoDto;
import com.dio.academia.demo.service.impl.AvaliacaoFisicaServiceImpl;

@RestController
@RequestMapping("/avaliacoes")
public class AvaliacoesController {
    
    @Autowired
    private AvaliacaoFisicaServiceImpl service;

    @PostMapping
    public AvaliacaoFisica create(@RequestBody AvaliacaoDto avaliacao) {
        return service.create(avaliacao);
    }
}

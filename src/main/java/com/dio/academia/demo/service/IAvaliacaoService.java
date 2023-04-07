package com.dio.academia.demo.service;

import java.util.List;

import com.dio.academia.demo.entity.AvaliacaoFisica;

public interface IAvaliacaoService {

    AvaliacaoFisica create(AvaliacaoFisicaForm form);

    AvaliacaoFisica get(Long id);

    List<AvaliacaoFisica> getAll();

    AvaliacaoFisica update(Long id, AvaliacaoFisicaUpdateForm formUpdate);

    void delete(Long id);
}

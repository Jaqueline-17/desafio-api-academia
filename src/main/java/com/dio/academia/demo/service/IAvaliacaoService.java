package com.dio.academia.demo.service;

import java.util.List;

import com.dio.academia.demo.entity.AvaliacaoFisica;
import com.dio.academia.demo.entity.dto.AvaliacaoDto;
import com.dio.academia.demo.entity.dto.AvaliacaoUpdateDto;

public interface IAvaliacaoService {

    AvaliacaoFisica create(AvaliacaoDto form);

    AvaliacaoFisica get(Long id);

    List<AvaliacaoFisica> getAll();

    AvaliacaoFisica update(Long id, AvaliacaoUpdateDto formUpdate);

    void delete(Long id);
}

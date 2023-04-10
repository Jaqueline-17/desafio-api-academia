package com.dio.academia.demo.service;

import java.util.List;

import com.dio.academia.demo.entity.Aluno;
import com.dio.academia.demo.entity.AvaliacaoFisica;
import com.dio.academia.demo.entity.dto.AlunoDto;
import com.dio.academia.demo.entity.dto.AlunoUpdateDto;

public interface IAlunoService {

    Aluno create(AlunoDto form);

    Aluno get(Long id);

    List<Aluno> getAll(String dataDeNascimento);

    Aluno update(Long id, AlunoUpdateDto formUpdate);

    void delete(Long id);

    List<AvaliacaoFisica> getAvaliacaoFisicaId(Long id);
}

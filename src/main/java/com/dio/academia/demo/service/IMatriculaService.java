package com.dio.academia.demo.service;

import java.util.List;

import com.dio.academia.demo.entity.Matricula;

public interface IMatriculaService {

    Matricula create(MatriculaForm form);

    Matricula get(Long id);

    List<Matricula> getAll(String bairro);

    void delete(Long id);
}

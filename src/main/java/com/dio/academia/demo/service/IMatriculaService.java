package com.dio.academia.demo.service;

import java.util.List;

import com.dio.academia.demo.entity.Matricula;
import com.dio.academia.demo.entity.dto.MatriculaDto;

public interface IMatriculaService {

    Matricula create(MatriculaDto form);

    Matricula get(Long id);

    List<Matricula> getAll(String bairro);

    void delete(Long id);
}

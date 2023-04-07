package com.dio.academia.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dio.academia.demo.entity.Aluno;
import com.dio.academia.demo.entity.AvaliacaoFisica;
import com.dio.academia.demo.entity.dto.AlunoDto;
import com.dio.academia.demo.entity.dto.AlunoUpdateDto;
import com.dio.academia.demo.repository.AlunoRepository;
import com.dio.academia.demo.service.IAlunoService;

@Service
public class AlunoServiceImpl implements IAlunoService {

    @Autowired
    private AlunoRepository repository;
    
    public Aluno create(AlunoDto form) {
        Aluno aluno = new Aluno();
        aluno.setNome(form.getNome());
        aluno.setCpf(form.getCpf());
        aluno.setBairro(form.getBairro());
        aluno.setDataDeNascimento(form.getDataDeNascimento());

        return repository.save(aluno);
    }

    public Aluno get(Long id) {

    }

    public List<Aluno> getAll(String dataDeNascimento) {
        return repository.findAll();
    }

    public Aluno update(Long id, AlunoUpdateDto formUpdate) {

    }

    public void delete(Long id) {

    }

    public List<AvaliacaoFisica> getAllAvaliacaoFisicaId(Long id) {

    }
}

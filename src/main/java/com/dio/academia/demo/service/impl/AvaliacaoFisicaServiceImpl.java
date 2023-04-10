package com.dio.academia.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dio.academia.demo.entity.Aluno;
import com.dio.academia.demo.entity.AvaliacaoFisica;
import com.dio.academia.demo.entity.dto.AvaliacaoDto;
import com.dio.academia.demo.entity.dto.AvaliacaoUpdateDto;
import com.dio.academia.demo.repository.AlunoRepository;
import com.dio.academia.demo.repository.AvaliacaoFisicaRepository;
import com.dio.academia.demo.service.IAvaliacaoService;

@Service
public class AvaliacaoFisicaServiceImpl implements IAvaliacaoService{

    @Autowired
    private AvaliacaoFisicaRepository avaliacaoRepositorio;

    @Autowired
    private AlunoRepository alunoRepositorio;

    @Override
    public AvaliacaoFisica create(AvaliacaoDto form) {
        AvaliacaoFisica avaliacaoFisica = new AvaliacaoFisica();
        Aluno aluno = alunoRepositorio.findById(form.getAlunoId()).get();

        avaliacaoFisica.setAluno(aluno);
        avaliacaoFisica.setPeso(form.getPeso());
        avaliacaoFisica.setAltura(form.getAltura());

        return avaliacaoRepositorio.save(avaliacaoFisica);
    }

    @Override
    public AvaliacaoFisica get(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'get'");
    }

    @Override
    public List<AvaliacaoFisica> getAll() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAll'");
    }

    @Override
    public AvaliacaoFisica update(Long id, AvaliacaoUpdateDto formUpdate) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public void delete(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

    
    

}

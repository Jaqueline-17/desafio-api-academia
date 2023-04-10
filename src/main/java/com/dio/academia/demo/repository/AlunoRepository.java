package com.dio.academia.demo.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dio.academia.demo.entity.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Long>{
    
    List<Aluno> findByDataDeNascimento(LocalDate dataDeNascimento);
}

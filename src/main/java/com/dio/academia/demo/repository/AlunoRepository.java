package com.dio.academia.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dio.academia.demo.entity.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Long>{
    
    
}

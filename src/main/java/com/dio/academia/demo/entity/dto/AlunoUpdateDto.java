package com.dio.academia.demo.entity.dto;

import java.time.LocalDate;

import lombok.Data;

@Data
public class AlunoUpdateDto {

  private String nome;

  private String bairro;

  private LocalDate dataDeNascimento;
}

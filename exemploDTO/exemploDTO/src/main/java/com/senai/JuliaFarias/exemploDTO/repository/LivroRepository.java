package com.senai.JuliaFarias.exemploDTO.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.senai.JuliaFarias.exemploDTO.entities.Livro;

public interface LivroRepository extends JpaRepository<Livro, Long> {

}

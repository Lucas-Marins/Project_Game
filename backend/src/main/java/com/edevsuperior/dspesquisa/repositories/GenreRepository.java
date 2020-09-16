package com.edevsuperior.dspesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edevsuperior.dspesquisa.entities.Genre;

public interface GenreRepository extends JpaRepository<Genre, Long> {

}

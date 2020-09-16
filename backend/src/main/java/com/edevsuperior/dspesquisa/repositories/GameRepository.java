package com.edevsuperior.dspesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edevsuperior.dspesquisa.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}

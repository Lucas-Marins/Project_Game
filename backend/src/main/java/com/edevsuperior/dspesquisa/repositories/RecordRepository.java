package com.edevsuperior.dspesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edevsuperior.dspesquisa.entities.Record;

public interface RecordRepository extends JpaRepository<Record, Long> {

}

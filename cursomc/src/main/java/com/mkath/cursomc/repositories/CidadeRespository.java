package com.mkath.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mkath.cursomc.domain.Cidade;

@Repository
public interface CidadeRespository extends JpaRepository<Cidade, Integer>{

}

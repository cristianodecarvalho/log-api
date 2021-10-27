package com.cristianofilho.log.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cristianofilho.log.domain.model.Entrega;

@Repository
public interface EntregaRepository extends JpaRepository<Entrega, Long>{

}

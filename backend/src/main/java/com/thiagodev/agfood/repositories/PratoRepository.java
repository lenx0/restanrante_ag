package com.thiagodev.agfood.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.thiagodev.agfood.domain.Prato;

@Repository
public interface PratoRepository extends JpaRepository<Prato, Integer> {

}

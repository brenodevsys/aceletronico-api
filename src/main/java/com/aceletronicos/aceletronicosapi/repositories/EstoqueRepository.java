package com.aceletronicos.aceletronicosapi.repositories;

import com.aceletronicos.aceletronicosapi.models.Estoque;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstoqueRepository extends JpaRepository<Estoque, Long> {
}

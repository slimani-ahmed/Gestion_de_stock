package com.ahmed.gestiondestock.repository;

import com.ahmed.gestiondestock.model.Vente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VentesRepository extends JpaRepository<Vente,Long> {
}

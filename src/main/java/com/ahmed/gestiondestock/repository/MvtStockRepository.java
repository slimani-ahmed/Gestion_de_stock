package com.ahmed.gestiondestock.repository;

import com.ahmed.gestiondestock.model.MvtStk;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MvtStockRepository extends JpaRepository<MvtStk,Long> {
}

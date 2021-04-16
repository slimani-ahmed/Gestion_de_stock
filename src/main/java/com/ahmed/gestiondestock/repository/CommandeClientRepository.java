package com.ahmed.gestiondestock.repository;

import com.ahmed.gestiondestock.model.CommandeClient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommandeClientRepository extends JpaRepository<CommandeClient,Long> {
}

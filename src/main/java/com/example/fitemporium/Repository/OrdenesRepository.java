package com.example.fitemporium.Repository;

import com.example.fitemporium.Model.Ordenes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrdenesRepository extends JpaRepository<Ordenes, Long> {
}

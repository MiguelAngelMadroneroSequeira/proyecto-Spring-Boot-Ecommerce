package com.example.fitemporium.Repository;


import com.example.fitemporium.Model.Pagos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PagosRepository extends JpaRepository<Pagos, Long> {
}

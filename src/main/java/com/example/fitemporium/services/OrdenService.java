package com.example.fitemporium.services;

import com.example.fitemporium.models.Orden;
import com.example.fitemporium.repositories.OrdenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrdenService {

  @Autowired
  private OrdenRepository ordenRepository;


  public List<Orden> getListaOrdenes() {
    return ordenRepository.findAll();
  }

  public Orden agregarOrden(Orden orden) {
    return ordenRepository.save(orden);
  }

  public void eliminarOrden(Long ordenId) {
    ordenRepository.deleteById(ordenId);
  }
}

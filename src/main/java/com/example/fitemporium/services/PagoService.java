package com.example.fitemporium.services;


import com.example.fitemporium.models.Pago;
import com.example.fitemporium.repositories.PagoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PagoService {
  @Autowired
  private PagoRepository pagoRepository;

  public List<Pago>getListaPagos(){

    return pagoRepository.findAll();
  }

  public Pago agregarPago(Pago pago){
    return pagoRepository.save(pago);
  }

  public void eliminarPago(Integer pagoId){
    pagoRepository.deleteById(pagoId);
  }
}


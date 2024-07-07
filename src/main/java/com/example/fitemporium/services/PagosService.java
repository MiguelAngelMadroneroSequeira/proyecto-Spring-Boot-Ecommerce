package com.example.fitemporium.services;


import com.example.fitemporium.models.Pagos;
import com.example.fitemporium.repositories.PagosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PagosService {
  @Autowired
  private PagosRepository pagosRepository;
  private List<Pagos> listaOrdenes;

  public List<Pagos> getListaPagos(){
    return pagosRepository.findAll();
  }

  public Pagos agregarPago(Pagos pago){
    return pagosRepository.save(pago);
  }

  public void eliminarPago(Long ID_Pago){
    pagosRepository.deleteById(ID_Pago);
  }
}


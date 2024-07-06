package com.example.fitemporium.Service;

import com.example.fitemporium.Model.Ordenes;
import com.example.fitemporium.Repository.OrdenesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrdenesService {
  @Autowired
  private OrdenesRepository ordenesRepository;
  private List<Ordenes> listaOrdenes;

  public List<Ordenes> getListaOrdenes(){
    return ordenesRepository.findAll();
  }

  public Ordenes agregarOrden(Ordenes orden){
    return ordenesRepository.save(orden);
  }

  public void eliminarOrden(Long ID_Orden){
    ordenesRepository.deleteById(ID_Orden);
  }
}

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

  public Orden actualizarOrden(Long ordenId, Orden ordenDetalles) {
    Orden orden = ordenRepository.findById(ordenId)
            .orElseThrow(() -> new RuntimeException("Orden no encontrada con id: " + ordenId));

    orden.setProductoId(ordenDetalles.getProductoId());
    orden.setFechaOrden(ordenDetalles.getFechaOrden());
    orden.setCantidadOrden(ordenDetalles.getCantidadOrden());
    orden.setEstadoOrden(ordenDetalles.getEstadoOrden());
    orden.setListaPagos(ordenDetalles.getListaPagos());
    orden.setId_orden(ordenDetalles.getId_orden());
    orden.setProducto_orden_id(ordenDetalles.getProducto_orden_id());


    return ordenRepository.save(orden);
  }
}

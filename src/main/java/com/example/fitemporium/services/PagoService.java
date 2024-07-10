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

  public List<Pago> getListaPagos() {
    return pagoRepository.findAll();
  }

  public Pago agregarPago(Pago pago) {
    return pagoRepository.save(pago);
  }

  public void eliminarPago(Integer pagoId) {
    pagoRepository.deleteById(pagoId);
  }

  public Pago actualizarPago(Integer pagoId, Pago pagoDetalles) {
    Pago pago = pagoRepository.findById(pagoId)
            .orElseThrow(() -> new RuntimeException("Pago no encontrado con id: " + pagoId));

    pago.setOrdenId(pagoDetalles.getOrdenId());
    pago.setMonto(pagoDetalles.getMonto());
    pago.setFechaPago(pagoDetalles.getFechaPago());
    pago.setMetodoPago(pagoDetalles.getMetodoPago());
    pago.setOrden_id(pagoDetalles.getOrden_id());
    pago.setCliente_pago_id(pagoDetalles.getCliente_pago_id());


    return pagoRepository.save(pago);
  }
}

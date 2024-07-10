package com.example.fitemporium.controllers;

import com.example.fitemporium.models.Pago;
import com.example.fitemporium.services.PagoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pagos")
public class PagoController {

  @Autowired
  private PagoService pagoService;

  @GetMapping("/obtener")
  public List<Pago> getAllPagos() {
    return pagoService.getListaPagos();
  }

  @PostMapping("/agregar")
  public Pago agregarPago(@RequestBody Pago pago) {
    return pagoService.agregarPago(pago);
  }

  @DeleteMapping("/{pagoId}")
  public void eliminarPago(@PathVariable int pagoId) {
    pagoService.eliminarPago(pagoId);
  }

  @PutMapping("/{pagoId}")
  public ResponseEntity<Pago> actualizarPago(@PathVariable int pagoId, @RequestBody Pago pagoDetalles) {
    Pago updatedPago = pagoService.actualizarPago(pagoId, pagoDetalles);
    return ResponseEntity.ok(updatedPago);
  }
}

package com.example.fitemporium.controllers;


import com.example.fitemporium.models.Orden;
import com.example.fitemporium.services.OrdenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ordenes")
public class OrdenController {

  private OrdenService ordenService;

  @Autowired

  public OrdenController(OrdenService ordenService) {
    this.ordenService = ordenService;

  }


  @GetMapping("/obtener")
  public List<Orden> getAllOrdenes() {
    return ordenService.getListaOrdenes();
  }

  @PostMapping
  public ResponseEntity<Orden> agregarOrden(@RequestBody Orden orden) {
    Orden agregarOrden = ordenService.agregarOrden(orden);
    return ResponseEntity.status(HttpStatus.CREATED).body(agregarOrden);
  }

  @DeleteMapping("/{id}")
  public void eliminarOrden(@PathVariable Long ordenId) {
    ordenService.eliminarOrden(ordenId);
  }
}

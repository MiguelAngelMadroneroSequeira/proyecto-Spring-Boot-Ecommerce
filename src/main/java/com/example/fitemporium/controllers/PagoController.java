package com.example.fitemporium.controllers;


import com.example.fitemporium.models.Pago;
import com.example.fitemporium.services.OrdenService;
import com.example.fitemporium.services.PagoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pagos")
public class PagoController {

  @Autowired
  private PagoService pagoService;


  @GetMapping("/obtener")
  public List<Pago> getAllPagos(){
    return pagoService.getListaPagos();

  }

  @PostMapping("/agregar")
  public Pago AddPago(@RequestBody Pago pago){
    return pagoService.agregarPago(pago);
  }

  @DeleteMapping("/{id}")
  public void deletePago(int pagoId){
    pagoService.eliminarPago(pagoId);
  }
}

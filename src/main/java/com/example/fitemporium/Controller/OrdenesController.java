package com.example.fitemporium.Controller;


import com.example.fitemporium.Model.Ordenes;
import com.example.fitemporium.Service.OrdenesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ordenes")
public class OrdenesController {

  @Autowired
  private OrdenesService ordenesService;

  @GetMapping("/obtener")
  public List<Ordenes> getAllOrdenes(){
    return ordenesService.getListaOrdenes();
  }

  @PostMapping("/agregar")
  public Ordenes agregarOrden(@RequestBody Ordenes orden){
    return ordenesService.agregarOrden(orden);
  }

  @DeleteMapping("/{id}")
  public void eliminarOrden(@PathVariable Long ID_Orden){
    ordenesService.eliminarOrden(ID_Orden);
  }
}

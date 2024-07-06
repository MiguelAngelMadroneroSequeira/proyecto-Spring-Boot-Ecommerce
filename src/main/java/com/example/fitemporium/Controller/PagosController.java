package com.example.fitemporium.Controller;


import com.example.fitemporium.Model.Pagos;
import com.example.fitemporium.Service.PagosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pagos")
public class PagosController {
  @Autowired
  private PagosService pagosService;

  @GetMapping("/obtener")
  public List<Pagos> getAllPagos(){
    return pagosService.getListaPagos();
  }

  @PostMapping("/agregar")
  public Pagos AddPago(@RequestBody Pagos pago){
    return pagosService.agregarPago(pago);
  }

  @DeleteMapping("/{id}")
  public void deletePago(Long ID_Pago){
    pagosService.eliminarPago(ID_Pago);
  }
}

package com.example.fitemporium.Controller;


import com.example.fitemporium.Model.Productos;
import com.example.fitemporium.Service.ProductosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/productos")
public class ProductosController {
  @Autowired
  private ProductosService productosService;

  @GetMapping("/obtener")
  public List<Productos> getAllProductos(){
    return productosService.getListaProductos();
  }

  @PostMapping("/agregar")
  public Productos addProducto(@RequestBody Productos producto){
    return productosService.addProducto(producto);

  }

  @DeleteMapping("/{id}")
  public void deleteProducto(@PathVariable Long ID_Producto){
    productosService.deleteProducto(ID_Producto);

  }

}

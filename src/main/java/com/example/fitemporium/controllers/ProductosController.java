package com.example.fitemporium.controllers;

import com.example.fitemporium.models.Productos;
import com.example.fitemporium.services.ProductosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/productos")
public class ProductosController {

  @Autowired
  private ProductosService productosService;

  @GetMapping("/obtener")
  public List<Productos> getAllProductos() {
    return productosService.getListaProductos();
  }

  @PostMapping("/agregar")
  public Productos addProducto(@RequestBody Productos producto) {
    return productosService.addProducto(producto);
  }

  @DeleteMapping("/{idProducto}")
  public void deleteProducto(@PathVariable Long idProducto) {
    productosService.deleteProducto(idProducto);
  }

  @PutMapping("/{idProducto}")
  public ResponseEntity<Productos> actualizarProducto(@PathVariable Long idProducto, @RequestBody Productos productoDetalles) {
    Productos updatedProducto = productosService.actualizarProducto(idProducto, productoDetalles);
    return ResponseEntity.ok(updatedProducto);
  }
}

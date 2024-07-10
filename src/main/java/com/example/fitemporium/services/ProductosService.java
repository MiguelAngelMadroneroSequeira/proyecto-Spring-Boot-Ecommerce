package com.example.fitemporium.services;

import com.example.fitemporium.models.Productos;
import com.example.fitemporium.repositories.ProductosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductosService {

  @Autowired
  private ProductosRepository productosRepository;

  public List<Productos> getListaProductos() {
    return productosRepository.findAll();
  }

  public Productos addProducto(Productos producto) {
    return productosRepository.save(producto);
  }

  public void deleteProducto(Long ID_Producto) {
    productosRepository.deleteById(ID_Producto);
  }

  public Productos actualizarProducto(Long idProducto, Productos productoDetalles) {
    Productos producto = productosRepository.findById(idProducto)
            .orElseThrow(() -> new RuntimeException("Producto no encontrado con id: " + idProducto));

    producto.setNombre(productoDetalles.getNombre());
    producto.setValorUnitario(productoDetalles.getValorUnitario());
    producto.setImagen(productoDetalles.getImagen());
    producto.setStock(productoDetalles.getStock());


    return productosRepository.save(producto);
  }
}

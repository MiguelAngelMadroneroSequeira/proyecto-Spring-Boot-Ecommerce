package com.example.fitemporium.Service;


import com.example.fitemporium.Model.Productos;
import com.example.fitemporium.Repository.ProductosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductosService {
  @Autowired
  private ProductosRepository productosRepository;
  private List<Productos> listaProductos;

  public List<Productos> getListaProductos(){
    return productosRepository.findAll();
  }

  public Productos addProducto(Productos producto){
    return productosRepository.save(producto);
  }

  public void deleteProducto(Long ID_Producto){
    productosRepository.deleteById(ID_Producto);
  }
}

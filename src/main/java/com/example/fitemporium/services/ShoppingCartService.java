package com.example.fitemporium.services;

import com.example.fitemporium.models.ShoppingCart;
import com.example.fitemporium.repositories.ShoppingCartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShoppingCartService {

  @Autowired
  private ShoppingCartRepository shoppingCartRepository;

  public List<ShoppingCart> getListaCarrito() {
    return shoppingCartRepository.findAll();
  }

  public ShoppingCart agregarListaCarrito(ShoppingCart lista) {
    return shoppingCartRepository.save(lista);
  }

  public void eliminarListaCarrito(Long id_carrito) {
    shoppingCartRepository.deleteById(id_carrito);
  }

  public ShoppingCart actualizarListaCarrito(Long idCarrito, ShoppingCart listaDetalles) {
    ShoppingCart lista = shoppingCartRepository.findById(idCarrito)
            .orElseThrow(() -> new RuntimeException("Carrito de compras no encontrado con id: " + idCarrito));

    lista.setValor_total(listaDetalles.getValor_total());
    lista.setCantidad(listaDetalles.getCantidad());
    lista.setId_producto(listaDetalles.getId_producto());
    lista.setCliente_carrito_id(listaDetalles.getCliente_carrito_id());
    lista.setProducto_carrito_id(listaDetalles.getProducto_carrito_id());


    return shoppingCartRepository.save(lista);
  }
}

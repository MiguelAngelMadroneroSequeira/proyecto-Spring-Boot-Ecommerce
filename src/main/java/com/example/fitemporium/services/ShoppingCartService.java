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
  private List<ShoppingCart> listaCarrito;

  public List<ShoppingCart> getListaCarrito(){
    return shoppingCartRepository.findAll();
  }

  public ShoppingCart agregarListaCarrito(ShoppingCart lista){
    return  shoppingCartRepository.save(lista);
  }

  public void eliminarListaCarrito(Long id_carrito){
    shoppingCartRepository.deleteById(id_carrito);
  }
}

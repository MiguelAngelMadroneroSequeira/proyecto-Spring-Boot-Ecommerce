package com.example.fitemporium.Service;


import com.example.fitemporium.Model.ShoppingCart;
import com.example.fitemporium.Repository.ShoppingCartRepository;
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

  public void eliminarListaCarrito(Long ID_Carrito){
    shoppingCartRepository.deleteById(ID_Carrito);
  }
}

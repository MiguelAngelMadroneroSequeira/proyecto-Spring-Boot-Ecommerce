package com.example.fitemporium.controllers;


import com.example.fitemporium.models.ShoppingCart;
import com.example.fitemporium.services.ShoppingCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Carrito")
public class ShoppingCartController {
  @Autowired
  private ShoppingCartService shoppingCartService;

  @GetMapping("/obtener")
  public List<ShoppingCart> getAllShoppingCart(){
    return shoppingCartService.getListaCarrito();
  }

  @PostMapping("/agregar")
  public ShoppingCart AddShoppingCart(@RequestBody ShoppingCart lista){
    return shoppingCartService.agregarListaCarrito(lista);
  }

  @DeleteMapping("/{id_carrito}")
  public void deleteShoppingCart(@PathVariable Long id_carrito){
    shoppingCartService.eliminarListaCarrito(id_carrito);
  }

}

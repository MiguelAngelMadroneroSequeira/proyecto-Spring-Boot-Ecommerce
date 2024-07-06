package com.example.fitemporium.Controller;


import com.example.fitemporium.Model.ShoppingCart;
import com.example.fitemporium.Service.ShoppingCartService;
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

  @DeleteMapping("/{id}")
  public void deleteShoppingCart(@PathVariable Long ID_Carrito){
    shoppingCartService.eliminarListaCarrito(ID_Carrito);
  }

}

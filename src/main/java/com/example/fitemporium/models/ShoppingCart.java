package com.example.fitemporium.models;

import jakarta.persistence.*;

@Entity
@Table(name = "shopping_cart")
public class ShoppingCart {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long ID_Carrito;

  @Column (name = "Valor_Total", nullable = false)
  private Float valor_total;

  @Column (name = "Cantidad", nullable = false )
  private Integer cantidad;

  @Column (name = "ID_Producto", nullable = false)
  private Long ID_Producto;

  public ShoppingCart() {
  }

  public ShoppingCart(Long ID_Carrito, Float valor_total, Integer cantidad, Long ID_Producto) {
    this.ID_Carrito = ID_Carrito;
    this.valor_total = valor_total;
    this.cantidad = cantidad;
    this.ID_Producto = ID_Producto;
  }

  public Long getID_Carrito() {
    return ID_Carrito;
  }

  public void setID_Carrito(Long ID_Carrito) {
    this.ID_Carrito = ID_Carrito;
  }

  public Float getValor_total() {
    return valor_total;
  }

  public void setValor_total(Float valor_total) {
    this.valor_total = valor_total;
  }

  public Integer getCantidad() {
    return cantidad;
  }

  public void setCantidad(Integer cantidad) {
    this.cantidad = cantidad;
  }

  public Long getID_Producto() {
    return ID_Producto;
  }

  public void setID_Producto(Long ID_Producto) {
    this.ID_Producto = ID_Producto;
  }
}

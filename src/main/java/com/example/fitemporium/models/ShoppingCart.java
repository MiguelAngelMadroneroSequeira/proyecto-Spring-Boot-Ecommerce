package com.example.fitemporium.models;

import jakarta.persistence.*;

@Entity
@Table(name = "shopping_cart")
public class ShoppingCart {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id_carrito;

  @Column (name = "Valor_Total", nullable = false)
  private Float valor_total;

  @Column (name = "Cantidad", nullable = false )
  private Integer cantidad;

  @Column (name = "ID_Producto", nullable = false)
  private Long id_producto;

  public ShoppingCart() {
  }

  public ShoppingCart(Long id_carrito, Float valor_total, Integer cantidad, Long id_producto) {
    this.id_carrito = id_carrito;
    this.valor_total = valor_total;
    this.cantidad = cantidad;
    this.id_producto = id_producto;
  }

  public Long getID_Carrito() {
    return id_carrito;
  }

  public void setID_Carrito(Long id_carrito) {
    this.id_carrito = id_carrito;
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
    return id_producto;
  }

  public void setID_Producto(Long id_producto) {
    this.id_producto = id_producto;
  }
}

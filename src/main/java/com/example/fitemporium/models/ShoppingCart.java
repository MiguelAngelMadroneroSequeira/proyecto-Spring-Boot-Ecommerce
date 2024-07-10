package com.example.fitemporium.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "shopping_cart")
public class ShoppingCart {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id_carrito;

  @Column(name = "Valor_Total", nullable = false)
  private Float valor_total;

  @Column(name = "Cantidad", nullable = false)
  private Integer cantidad;

  @Column(name = "ID_Producto", nullable = false)
  private Long id_producto;

  @ManyToOne
  @JoinColumn(name = "cliente_carrito_id")
  private Clientes cliente_carrito_id;

  @ManyToOne
  @JoinColumn(name = "producto_carrito_id")
  private Productos producto_carrito_id;


  public ShoppingCart(Float valor_total, Integer cantidad, Long id_producto, Clientes cliente_carrito_id, Productos producto_carrito_id) {
    this.valor_total = valor_total;
    this.cantidad = cantidad;
    this.id_producto = id_producto;
    this.cliente_carrito_id = cliente_carrito_id;
    this.producto_carrito_id = producto_carrito_id;
  }


  public Long getId_carrito() {
    return id_carrito;
  }

  public void setId_carrito(Long id_carrito) {
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

  public Long getId_producto() {
    return id_producto;
  }

  public void setId_producto(Long id_producto) {
    this.id_producto = id_producto;
  }

  public Clientes getCliente_carrito_id() {
    return cliente_carrito_id;
  }

  public void setCliente_carrito_id(Clientes cliente_carrito_id) {
    this.cliente_carrito_id = cliente_carrito_id;
  }

  public Productos getProducto_carrito_id() {
    return producto_carrito_id;
  }

  public void setProducto_carrito_id(Productos producto_carrito_id) {
    this.producto_carrito_id = producto_carrito_id;
  }
}

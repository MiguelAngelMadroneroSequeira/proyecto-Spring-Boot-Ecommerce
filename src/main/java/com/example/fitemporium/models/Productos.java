package com.example.fitemporium.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Productos")
public class Productos {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id_producto;
  private String nombre;
  private Float valorUnitario;
  private String imagen;
  private int stock;

  @OneToMany(mappedBy = "producto_carrito_id")
  private List<ShoppingCart> listaCarritos;

  @OneToMany(mappedBy = "producto_orden_id")
  private List<Orden> listaOrdenes;


  public Productos(String nombre, Float valorUnitario, String imagen, int stock, List<ShoppingCart> listaCarritos, List<Orden> listaOrdenes) {
    this.nombre = nombre;
    this.valorUnitario = valorUnitario;
    this.imagen = imagen;
    this.stock = stock;
    this.listaCarritos = listaCarritos;
    this.listaOrdenes = listaOrdenes;
  }


  public Long getId_producto() {
    return id_producto;
  }

  public void setId_producto(Long id_producto) {
    this.id_producto = id_producto;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public Float getValorUnitario() {
    return valorUnitario;
  }

  public void setValorUnitario(Float valorUnitario) {
    this.valorUnitario = valorUnitario;
  }

  public String getImagen() {
    return imagen;
  }

  public void setImagen(String imagen) {
    this.imagen = imagen;
  }

  public int getStock() {
    return stock;
  }

  public void setStock(int stock) {
    this.stock = stock;
  }

  public List<ShoppingCart> getListaCarritos() {
    return listaCarritos;
  }

  public void setListaCarritos(List<ShoppingCart> listaCarritos) {
    this.listaCarritos = listaCarritos;
  }

  public List<Orden> getListaOrdenes() {
    return listaOrdenes;
  }

  public void setListaOrdenes(List<Orden> listaOrdenes) {
    this.listaOrdenes = listaOrdenes;
  }
}

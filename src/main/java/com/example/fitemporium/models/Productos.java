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
  private String descripcion;
  private String imagen;
  private int stock;
  private String categoria;
  private String modalimagen1;
  private String modalimagen2;
  private String modalimagen3;


  @OneToMany(mappedBy = "producto_carrito_id")
  private List<ShoppingCart> listaCarritos;

  @OneToMany(mappedBy = "producto_orden_id")
  private List<Orden> listaOrdenes;


  public Productos(String nombre, Float valorUnitario, String descripcion, String imagen, int stock, List<ShoppingCart> listaCarritos, List<Orden> listaOrdenes, String categoria, String modalimagen1, String modalimagen2, String modalimagen3) {
    this.nombre = nombre;
    this.valorUnitario = valorUnitario;
    this.imagen = imagen;
    this.stock = stock;
    this.listaCarritos = listaCarritos;
    this.listaOrdenes = listaOrdenes;
    this.descripcion = descripcion;
    this.categoria= categoria;
    this.modalimagen1=modalimagen1;
    this.modalimagen2=modalimagen2;
    this.modalimagen3=modalimagen3;

  }

  public String getCategoria() {
    return categoria;
  }

  public void setCategoria(String categoria) {
    this.categoria = categoria;
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

  public String getDescripcion() {
    return descripcion;
  }

  public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
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

  public String getModalimagen1() {
    return modalimagen1;
  }

  public void setModalimagen1(String modalimagen1) {
    this.modalimagen1 = modalimagen1;
  }

  public String getModalimagen2() {
    return modalimagen2;
  }

  public void setModalimagen2(String modalimagen2) {
    this.modalimagen2 = modalimagen2;
  }

  public String getModalimagen3() {
    return modalimagen3;
  }

  public void setModalimagen3(String modalimagen3) {
    this.modalimagen3 = modalimagen3;
  }
}

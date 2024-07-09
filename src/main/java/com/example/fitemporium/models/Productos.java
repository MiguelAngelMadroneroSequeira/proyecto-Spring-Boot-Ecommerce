package com.example.fitemporium.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "Productos")
public class Productos {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id_producto;
  private String nombre;
  private Float valorUnitario;
  private String imagen;
  private int stock;

  public Productos() {
  }

  public Productos(Long id_producto, String nombre, Float valorUnitario, String imagen, int stock) {
    this.id_producto = id_producto;
    this.nombre = nombre;
    this.valorUnitario = valorUnitario;
    this.imagen = imagen;
    this.stock = stock;
  }


}

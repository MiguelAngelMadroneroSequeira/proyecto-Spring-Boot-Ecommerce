package com.example.fitemporium.Model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table (name = "ordenes")
public class Ordenes {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long ID_Orden;

  @Column (name = "ID_Producto", nullable = false)
  private Long ID_Producto;

  @Column (name = "Fecha_orden", nullable = false)
  private LocalDate Fecha_orden;

  @Column (name = "Cantidad_orden", nullable = false)
  private Long Cantidad_orden;

  @Column (name = "Estado_orden", nullable = false)
  private String Estado_orden;

  public Ordenes() {
  }

  public Ordenes(Long ID_Orden, Long ID_Producto, LocalDate fecha_orden, Long cantidad_orden, String estado_orden) {
    this.ID_Orden = ID_Orden;
    this.ID_Producto = ID_Producto;
    Fecha_orden = fecha_orden;
    Cantidad_orden = cantidad_orden;
    Estado_orden = estado_orden;
  }

  public Long getID_Orden() {
    return ID_Orden;
  }

  public void setID_Orden(Long ID_Orden) {
    this.ID_Orden = ID_Orden;
  }

  public Long getID_Producto() {
    return ID_Producto;
  }

  public void setID_Producto(Long ID_Producto) {
    this.ID_Producto = ID_Producto;
  }

  public LocalDate getFecha_orden() {
    return Fecha_orden;
  }

  public void setFecha_orden(LocalDate fecha_orden) {
    Fecha_orden = fecha_orden;
  }

  public Long getCantidad_orden() {
    return Cantidad_orden;
  }

  public void setCantidad_orden(Long cantidad_orden) {
    Cantidad_orden = cantidad_orden;
  }

  public String getEstado_orden() {
    return Estado_orden;
  }

  public void setEstado_orden(String estado_orden) {
    Estado_orden = estado_orden;
  }
}

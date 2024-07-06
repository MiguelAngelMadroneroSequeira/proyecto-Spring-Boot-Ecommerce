package com.example.fitemporium.Model;

import jakarta.persistence.*;
import org.apache.catalina.util.Introspection;

@Entity
@Table(name = "Productos")
public class Productos {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long ID_Producto;

  @Column (name = "NombreP", nullable = false)
  private String NombreP;

  @Column (name = "Valor_Unitario", nullable = false)
  private Float Valor_Unitario;

  @Column (name = "Imagen", nullable = false)
  private String Imagen;

  @Column (name = "Descripcion", nullable = false)
  private String Descripcion;

  @Column (name = "Stock", nullable = false)
  private int Stock;

  public Productos() {
  }

  public Productos(Long ID_Producto, String nombreP, Float valor_Unitario, String imagen, String descripcion, int stock) {
    this.ID_Producto = ID_Producto;
    NombreP = nombreP;
    Valor_Unitario = valor_Unitario;
    Imagen = imagen;
    Descripcion = descripcion;
    Stock = stock;
  }

  public Long getID_Producto() {
    return ID_Producto;
  }

  public void setID_Producto(Long ID_Producto) {
    this.ID_Producto = ID_Producto;
  }

  public String getNombreP() {
    return NombreP;
  }

  public void setNombreP(String nombreP) {
    NombreP = nombreP;
  }

  public Float getValor_Unitario() {
    return Valor_Unitario;
  }

  public void setValor_Unitario(Float valor_Unitario) {
    Valor_Unitario = valor_Unitario;
  }

  public String getImagen() {
    return Imagen;
  }

  public void setImagen(String imagen) {
    Imagen = imagen;
  }

  public String getDescripcion() {
    return Descripcion;
  }

  public void setDescripcion(String descripcion) {
    Descripcion = descripcion;
  }

  public int getStock() {
    return Stock;
  }

  public void setStock(int stock) {
    Stock = stock;
  }


}

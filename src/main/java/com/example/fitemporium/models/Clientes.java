package com.example.fitemporium.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "clientes")
public class Clientes {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long idCliente;

  @Column(name = "Nombre", nullable = false)
  private String nombre;

  @Column(name = "Apellido", nullable = false)
  private String apellido;

  @Column(name = "Telefono", nullable = false)
  private String telefono;

  @Column(name = "Correo_electronico", nullable = false)
  private String correoElectronico;

  @OneToMany(mappedBy = "id_orden")
  private List<Orden> listaOrdenes;

  @OneToMany(mappedBy = "cliente_pago_id")
  private List<Pago> listaPagos;

  @OneToMany(mappedBy = "cliente_carrito_id")
  private List<ShoppingCart> listaCarritos;


  public Clientes(String nombre, String apellido, String telefono, String correoElectronico,
                  List<Orden> listaOrdenes, List<Pago> listaPagos, List<ShoppingCart> listaCarritos) {
    this.nombre = nombre;
    this.apellido = apellido;
    this.telefono = telefono;
    this.correoElectronico = correoElectronico;
    this.listaOrdenes = listaOrdenes;
    this.listaPagos = listaPagos;
    this.listaCarritos = listaCarritos;
  }

  // Getters y Setters para todos los campos
  public Long getIdCliente() {
    return idCliente;
  }

  public void setIdCliente(Long idCliente) {
    this.idCliente = idCliente;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getApellido() {
    return apellido;
  }

  public void setApellido(String apellido) {
    this.apellido = apellido;
  }

  public String getTelefono() {
    return telefono;
  }

  public void setTelefono(String telefono) {
    this.telefono = telefono;
  }

  public String getCorreoElectronico() {
    return correoElectronico;
  }

  public void setCorreoElectronico(String correoElectronico) {
    this.correoElectronico = correoElectronico;
  }

  public List<Orden> getListaOrdenes() {
    return listaOrdenes;
  }

  public void setListaOrdenes(List<Orden> listaOrdenes) {
    this.listaOrdenes = listaOrdenes;
  }

  public List<Pago> getListaPagos() {
    return listaPagos;
  }

  public void setListaPagos(List<Pago> listaPagos) {
    this.listaPagos = listaPagos;
  }

  public List<ShoppingCart> getListaCarritos() {
    return listaCarritos;
  }

  public void setListaCarritos(List<ShoppingCart> listaCarritos) {
    this.listaCarritos = listaCarritos;
  }
}

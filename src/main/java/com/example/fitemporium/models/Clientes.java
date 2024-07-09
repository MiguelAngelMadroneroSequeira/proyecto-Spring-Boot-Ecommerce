package com.example.fitemporium.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Entity
@Table(name = "clientes")
public class Clientes {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long idCliente;

  @Column (name = "Nombre", nullable = false)
  private String nombre;

  @Column (name = "Apellido", nullable = false)
  private String apellido;

  @Column (name = "Telefono", nullable = false)
  private String telefono;

  @Column (name = "Correo_electronico", nullable = false)
  private String correoElectronico;




  public Clientes() {
  }

  public Clientes(Long idCliente, String nombre, String apellido, String telefono, String correoElectronico) {
    this.idCliente = idCliente;
    this.nombre = nombre;
    this.apellido = apellido;
    this.telefono = telefono;
    this.correoElectronico = correoElectronico;
  }

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
}

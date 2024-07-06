package com.example.fitemporium.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "clientes")
public class Clientes {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long ID_Cliente;

  @Column (name = "Nombre", nullable = false)
  private String Nombre;

  @Column (name = "Apellido", nullable = false)
  private String Apellido;

  @Column (name = "Telefono", nullable = false)
  private String Telefono;

  @Column (name = "Correo_electronico", nullable = false)
  private String Correo_electronico;

  public Clientes() {
  }

  public Clientes(Long ID_Cliente, String nombre, String apellido, String telefono, String correo_electronico) {
    this.ID_Cliente = ID_Cliente;
    Nombre = nombre;
    Apellido = apellido;
    Telefono = telefono;
    Correo_electronico = correo_electronico;
  }

  public String getCorreo_electronico() {
    return Correo_electronico;
  }

  public void setCorreo_electronico(String correo_electronico) {
    Correo_electronico = correo_electronico;
  }

  public String getTelefono() {
    return Telefono;
  }

  public void setTelefono(String telefono) {
    Telefono = telefono;
  }

  public String getApellido() {
    return Apellido;
  }

  public void setApellido(String apellido) {
    Apellido = apellido;
  }

  public String getNombre() {
    return Nombre;
  }

  public void setNombre(String nombre) {
    Nombre = nombre;
  }

  public Long getID_Cliente() {
    return ID_Cliente;
  }

  public void setID_Cliente(Long ID_Cliente) {
    this.ID_Cliente = ID_Cliente;
  }
}

package com.example.fitemporium.models;


import jakarta.persistence.*;

@Entity
@Table(name = "pagos")
public class Pagos {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long ID_Pago;

  @Column (name = "ID_Orden", nullable = false)
  private Long ID_Orden;

  @Column (name = "Monto", nullable = false)
  private Long Monto;

  @Column (name = "Fecha_pago", nullable = false)
  private String Fecha_pago;

  @Column (name = "Metodo_pago", nullable = false)
  private String Metodo_pago;


  public Pagos() {
  }

  public Pagos(Long ID_Pago, Long ID_Orden, Long monto, String fecha_pago, String metodo_pago) {
    this.ID_Pago = ID_Pago;
    this.ID_Orden = ID_Orden;
    Monto = monto;
    Fecha_pago = fecha_pago;
    Metodo_pago = metodo_pago;
  }

  public Long getID_Pago() {
    return ID_Pago;
  }

  public void setID_Pago(Long ID_Pago) {
    this.ID_Pago = ID_Pago;
  }

  public Long getID_Orden() {
    return ID_Orden;
  }

  public void setID_Orden(Long ID_Orden) {
    this.ID_Orden = ID_Orden;
  }

  public Long getMonto() {
    return Monto;
  }

  public void setMonto(Long monto) {
    Monto = monto;
  }

  public String getFecha_pago() {
    return Fecha_pago;
  }

  public void setFecha_pago(String fecha_pago) {
    Fecha_pago = fecha_pago;
  }

  public String getMetodo_pago() {
    return Metodo_pago;
  }

  public void setMetodo_pago(String metodo_pago) {
    Metodo_pago = metodo_pago;
  }
}


package com.example.fitemporium.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "pagos")
public class Pago {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id_pago;

  @Column(name = "ID_Orden", nullable = false)
  private Long ordenId;

  @Column(name = "Monto", nullable = false)
  private Long monto;

  @Column(name = "Fecha_pago", nullable = false)
  private String fechaPago;

  @Column(name = "Metodo_pago", nullable = false)
  private String metodoPago;

  @ManyToOne
  @JoinColumn(name = "orden_id")
  private Orden orden_id;

  @ManyToOne
  @JoinColumn(name = "cliente_pago_id")
  private Clientes cliente_pago_id;


  public Pago(Long ordenId, Long monto, String fechaPago, String metodoPago, Orden orden_id, Clientes cliente_pago_id) {
    this.ordenId = ordenId;
    this.monto = monto;
    this.fechaPago = fechaPago;
    this.metodoPago = metodoPago;
    this.orden_id = orden_id;
    this.cliente_pago_id = cliente_pago_id;
  }


  public int getId_pago() {
    return id_pago;
  }

  public void setId_pago(int id_pago) {
    this.id_pago = id_pago;
  }

  public Long getOrdenId() {
    return ordenId;
  }

  public void setOrdenId(Long ordenId) {
    this.ordenId = ordenId;
  }

  public Long getMonto() {
    return monto;
  }

  public void setMonto(Long monto) {
    this.monto = monto;
  }

  public String getFechaPago() {
    return fechaPago;
  }

  public void setFechaPago(String fechaPago) {
    this.fechaPago = fechaPago;
  }

  public String getMetodoPago() {
    return metodoPago;
  }

  public void setMetodoPago(String metodoPago) {
    this.metodoPago = metodoPago;
  }

  public Orden getOrden_id() {
    return orden_id;
  }

  public void setOrden_id(Orden orden_id) {
    this.orden_id = orden_id;
  }

  public Clientes getCliente_pago_id() {
    return cliente_pago_id;
  }

  public void setCliente_pago_id(Clientes cliente_pago_id) {
    this.cliente_pago_id = cliente_pago_id;
  }
}

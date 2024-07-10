package com.example.fitemporium.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "ordenes")
public class Orden {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long ordenId;

  @Column(name = "producto_id", nullable = false)
  private Long productoId;

  @Column(name = "fecha_orden", nullable = false)
  private String fechaOrden;

  @Column(name = "cantidad_orden", nullable = false)
  private Long cantidadOrden;

  @Column(name = "estado_orden", nullable = false)
  private String estadoOrden;

  @OneToMany(mappedBy = "orden_id")
  private List<Pago> listaPagos;

  @ManyToOne
  @JoinColumn(name = "id_orden")
  private Clientes id_orden;

  @ManyToOne
  @JoinColumn(name = "producto_orden_id")
  private Productos producto_orden_id;


  public Orden(Long productoId, String fechaOrden, Long cantidadOrden, String estadoOrden,
               List<Pago> listaPagos, Clientes id_orden, Productos producto_orden_id) {
    this.productoId = productoId;
    this.fechaOrden = fechaOrden;
    this.cantidadOrden = cantidadOrden;
    this.estadoOrden = estadoOrden;
    this.listaPagos = listaPagos;
    this.id_orden = id_orden;
    this.producto_orden_id = producto_orden_id;
  }


  public Long getOrdenId() {
    return ordenId;
  }

  public void setOrdenId(Long ordenId) {
    this.ordenId = ordenId;
  }

  public Long getProductoId() {
    return productoId;
  }

  public void setProductoId(Long productoId) {
    this.productoId = productoId;
  }

  public String getFechaOrden() {
    return fechaOrden;
  }

  public void setFechaOrden(String fechaOrden) {
    this.fechaOrden = fechaOrden;
  }

  public Long getCantidadOrden() {
    return cantidadOrden;
  }

  public void setCantidadOrden(Long cantidadOrden) {
    this.cantidadOrden = cantidadOrden;
  }

  public String getEstadoOrden() {
    return estadoOrden;
  }

  public void setEstadoOrden(String estadoOrden) {
    this.estadoOrden = estadoOrden;
  }

  public List<Pago> getListaPagos() {
    return listaPagos;
  }

  public void setListaPagos(List<Pago> listaPagos) {
    this.listaPagos = listaPagos;
  }

  public Clientes getId_orden() {
    return id_orden;
  }

  public void setId_orden(Clientes id_orden) {
    this.id_orden = id_orden;
  }

  public Productos getProducto_orden_id() {
    return producto_orden_id;
  }

  public void setProducto_orden_id(Productos producto_orden_id) {
    this.producto_orden_id = producto_orden_id;
  }
}

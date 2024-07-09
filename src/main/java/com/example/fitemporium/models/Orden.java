package com.example.fitemporium.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table (name = "ordenes")
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
}

package com.example.fitemporium.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table (name = "ordenes")
public class Orden {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long ordenId;

  @Column (name = "producto_id", nullable = false)
  private Long productoId;

  @Column (name = "fecha_orden", nullable = false)
  private String fechaOrden;

  @Column (name = "cantidad_orden", nullable = false)
  private Long cantidadOrden;

  @Column (name = "estado_orden", nullable = false)
  private String estadoOrden;


}

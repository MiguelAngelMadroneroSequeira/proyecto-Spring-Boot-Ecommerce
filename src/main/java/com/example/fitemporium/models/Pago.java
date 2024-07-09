package com.example.fitemporium.models;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "pagos")
public class Pago {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id_pago;

  @Column (name = "ID_Orden", nullable = false)
  private Long ordenId;

  @Column (name = "Monto", nullable = false)
  private Long monto;

  @Column (name = "Fecha_pago", nullable = false)
  private String fechaPago;

  @Column (name = "Metodo_pago", nullable = false)
  private String metodoPago;

  @ManyToOne
  @JoinColumn(name = "orden_id")
  private Orden orden_id;

  @ManyToOne
  @JoinColumn(name = "cliente_pago_id")
  private Clientes cliente_pago_id;

}


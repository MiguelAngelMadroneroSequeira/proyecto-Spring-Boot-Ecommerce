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


}


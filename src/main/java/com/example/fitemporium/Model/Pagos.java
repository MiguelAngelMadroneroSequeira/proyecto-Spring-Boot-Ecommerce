package com.example.fitemporium.Model;


import jakarta.persistence.*;

import java.time.LocalDate;

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
  private LocalDate Fecha_pago;

  @Column (name = "Metodo_pago", nullable = false)
  private String Metodo_pago;





}


package com.example.fitemporium.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Productos")
public class Productos {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id_producto;
  private String nombre;
  private Float valorUnitario;
  private String imagen;
  private int stock;

  @OneToMany(mappedBy = "producto_carrito_id")
  private List<ShoppingCart> listaCarritos;

  @OneToMany(mappedBy = "producto_orden_id")
  private List<Orden> listaOrdenes;
}

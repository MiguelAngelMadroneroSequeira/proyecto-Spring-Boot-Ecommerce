package com.example.fitemporium.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "shopping_cart")
public class ShoppingCart {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id_carrito;

  @Column (name = "Valor_Total", nullable = false)
  private Float valor_total;

  @Column (name = "Cantidad", nullable = false )
  private Integer cantidad;

  @Column (name = "ID_Producto", nullable = false)
  private Long id_producto;

  @ManyToOne
  @JoinColumn(name = "cliente_carrito_id")
  private Clientes cliente_carrito_id;

  @ManyToOne
  @JoinColumn(name = "producto_carrito_id")
  private Productos producto_carrito_id;
}

package com.example.fitemporium.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "clientes")
public class Clientes {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long idCliente;

  @Column (name = "Nombre", nullable = false)
  private String nombre;

  @Column (name = "Apellido", nullable = false)
  private String apellido;

  @Column (name = "Telefono", nullable = false)
  private String telefono;

  @Column (name = "Correo_electronico", nullable = false)
  private String correoElectronico;

  @OneToMany(mappedBy = "id_orden")
  private List<Orden> listaOrdenes;

  @OneToMany(mappedBy = "cliente_pago_id")
  private List<Pago> listaPagos;

  @OneToMany(mappedBy = "cliente_carrito_id")
  private List<ShoppingCart> listaCarritos;

}

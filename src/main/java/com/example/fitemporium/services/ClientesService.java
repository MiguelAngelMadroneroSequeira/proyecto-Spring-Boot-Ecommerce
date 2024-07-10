package com.example.fitemporium.services;

import com.example.fitemporium.models.Clientes;
import com.example.fitemporium.repositories.ClientesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientesService {

  @Autowired
  private ClientesRepository clientesRepository;

  public List<Clientes> getListaClientes() {
    return clientesRepository.findAll();
  }

  public Clientes addCliente(Clientes cliente) {
    return clientesRepository.save(cliente);
  }

  public void deleteCliente(Long ID_Cliente) {
    clientesRepository.deleteById(ID_Cliente);
  }

  public Clientes updateCliente(Long ID_Cliente, Clientes clienteDetails) {
    Clientes cliente = clientesRepository.findById(ID_Cliente)
            .orElseThrow(() -> new RuntimeException("Cliente no encontrado con id: " + ID_Cliente));

    cliente.setNombre(clienteDetails.getNombre());
    cliente.setApellido(clienteDetails.getApellido());
    cliente.setTelefono(clienteDetails.getTelefono());
    cliente.setCorreoElectronico(clienteDetails.getCorreoElectronico());


    return clientesRepository.save(cliente);
  }
}

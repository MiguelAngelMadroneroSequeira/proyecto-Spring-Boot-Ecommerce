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
  private List <Clientes> listaClientes;

  public List<Clientes> getListaClientes(){
    return clientesRepository.findAll();
  }

  public Clientes addCliente(Clientes cliente){
    return clientesRepository.save(cliente);
  }

  public void deleteCliente(Long ID_Cliente){
    clientesRepository.deleteById(ID_Cliente);
  }

}

package com.example.fitemporium.Service;


import com.example.fitemporium.Model.Clientes;
import com.example.fitemporium.Repository.ClientesRepository;
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

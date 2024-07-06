package com.example.fitemporium.Controller;


import com.example.fitemporium.Model.Clientes;
import com.example.fitemporium.Service.ClientesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Clientes")
public class ClientesController {
  @Autowired
  private ClientesService clientesService;

  @GetMapping("/obtener")
  public List<Clientes> getAllClientes(){
    return clientesService.getListaClientes();
  }

  @PostMapping("/agregar")
  public Clientes addCliente(@RequestBody Clientes cliente){
    return clientesService.addCliente(cliente);

  }

  @DeleteMapping("/{ID_Cliente}")
  public void deleteCliente(@PathVariable Long ID_Cliente){
    clientesService.deleteCliente(ID_Cliente);
  }


}

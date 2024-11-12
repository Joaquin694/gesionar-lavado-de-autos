// src/main/java/com/tu_proyecto/controller/ClientesController.java
package com.proyectopoo.grupo.controller;

import com.proyectopoo.grupo.model.Cliente;
import com.proyectopoo.grupo.repository.ClienteRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClientesController {

    @Autowired
    private ClienteRepository clienteRepository;

    @GetMapping
    public List<Cliente> obtenerClientes() {
        return clienteRepository.findAll();
    }

    @PostMapping
    public Cliente crearCliente(@RequestBody Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    @PutMapping("/{id}")
    public Cliente actualizarCliente(@PathVariable Long id, @RequestBody Cliente clienteActualizado) {
        clienteActualizado.setId(id);
        return clienteRepository.save(clienteActualizado);
    }

    @DeleteMapping("/{id}")
    public void eliminarCliente(@PathVariable Long id) {
        clienteRepository.deleteById(id);
    }
}
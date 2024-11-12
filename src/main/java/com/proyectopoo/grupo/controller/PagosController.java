// src/main/java/com/tu_proyecto/controller/PagosController.java
package com.proyectopoo.grupo.controller;


import com.proyectopoo.grupo.model.Pago;
import com.proyectopoo.grupo.repository.PagoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pagos")
public class PagosController {

    @Autowired
    private PagoRepository pagoRepository;

    @GetMapping
    public List<Pago> obtenerPagos() {
        return pagoRepository.findAll();
    }

    @PostMapping
    public Pago crearPago(@RequestBody Pago pago) {
        return pagoRepository.save(pago);
    }

    @PutMapping("/{id}")
    public Pago actualizarPago(@PathVariable Long id, @RequestBody Pago pagoActualizado) {
        pagoActualizado.setId(id);
        return pagoRepository.save(pagoActualizado);
    }

    @DeleteMapping("/{id}")
    public void eliminarPago(@PathVariable Long id) {
        pagoRepository.deleteById(id);
    }
}
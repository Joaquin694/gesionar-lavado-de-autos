package com.proyectopoo.grupo.repository;


import com.proyectopoo.grupo.model.Factura;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FacturaRepository extends JpaRepository<Factura, Long> {
}
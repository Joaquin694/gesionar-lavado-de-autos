package com.proyectopoo.grupo.repository;


import com.proyectopoo.grupo.model.Pago;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PagoRepository extends JpaRepository<Pago, Long> {
}
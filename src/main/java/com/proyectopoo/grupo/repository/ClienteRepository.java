package com.proyectopoo.grupo.repository;


import com.proyectopoo.grupo.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
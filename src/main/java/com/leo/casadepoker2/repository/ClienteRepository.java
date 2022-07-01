package com.leo.casadepoker2.repository;

import com.leo.casadepoker2.model.Cliente;
import com.leo.casadepoker2.model.TableItem;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    ArrayList<TableItem> findAllClientes(Cliente cliente);
}

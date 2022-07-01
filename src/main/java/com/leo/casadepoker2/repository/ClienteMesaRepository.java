package com.leo.casadepoker2.repository;

import com.leo.casadepoker2.model.Tables;
import com.leo.casadepoker2.model.ClienteMesa;
import com.leo.casadepoker2.model.TableItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface ClienteMesaRepository extends JpaRepository<ClienteMesa, Long>  {
    ArrayList<TableItem> findAllClientesByMesa(Tables tables);

}

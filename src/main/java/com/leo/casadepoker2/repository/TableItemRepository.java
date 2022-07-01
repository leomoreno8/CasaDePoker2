package com.leo.casadepoker2.repository;
import com.leo.casadepoker2.model.TableItem;
import com.leo.casadepoker2.model.Tables;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface TableItemRepository extends JpaRepository<TableItem, Long> {
    ArrayList<TableItem> findAllItensByTables(Tables tables);
}

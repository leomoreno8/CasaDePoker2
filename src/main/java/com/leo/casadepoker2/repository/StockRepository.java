package com.leo.casadepoker2.repository;

import com.leo.casadepoker2.model.Item;
import com.leo.casadepoker2.model.Stock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StockRepository extends JpaRepository<Stock, Long> {
    Stock findFirstByItem(Item item);
}

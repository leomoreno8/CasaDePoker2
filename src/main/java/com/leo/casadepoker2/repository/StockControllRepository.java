package com.leo.casadepoker2.repository;

import com.leo.casadepoker2.model.StockControll;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface StockControllRepository extends JpaRepository<StockControll, UUID> {
}

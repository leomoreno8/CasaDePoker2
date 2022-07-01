package com.leo.casadepoker2.model;

import br.edu.utfpr.hamburgueria_oo24s.model.dto.ItemQuantityTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import java.time.LocalDateTime;

@Entity @AllArgsConstructor @RequiredArgsConstructor @Builder
public class Stock extends Model{

    @Id @GeneratedValue
    private Long id;
    @OneToOne @Getter
    private Item item;
    private Double quantity;

    @LastModifiedDate
    private LocalDateTime lastModified;

    public Stock updateBy(ItemQuantityTO to){
        this.quantity += to.getQuantity();
        return this;
    }

}

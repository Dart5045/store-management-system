package com.mylearning.stock.service.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(value = "stock")
@Getter
@Setter
@NoArgsConstructor
public class StockEntity {

    @Id
    private String id;
    private String code;
    private Integer quantity;
}

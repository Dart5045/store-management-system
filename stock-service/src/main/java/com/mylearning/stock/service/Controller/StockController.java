package com.mylearning.stock.service.Controller;


import com.mylearning.stock.service.repository.StockRepository;
import com.mylearning.stock.service.entity.StockEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("api/v1/stock")
public class StockController {
    private final StockRepository stockRepository;

    public StockController(StockRepository stockRepository) {
        this.stockRepository = stockRepository;
    }

    public boolean stockAvailable(
            @PathVariable String code){
        Optional<StockEntity>  stockEntity = StockRepository.findByCode(code);
        stockEntity.orElseThrow(() -> new RuntimeException("Product not found"));
        return stockEntity.get().getQuantity()>0;

    }

}

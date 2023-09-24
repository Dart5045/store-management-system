package com.mylearning.stock.service.repository;

import com.mylearning.stock.service.entity.StockEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;


public interface StockRepository extends MongoRepository<StockEntity,String> {
     Optional<StockEntity> findByCode(String code);
}



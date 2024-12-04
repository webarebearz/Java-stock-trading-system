package com.example.demo.service;

import com.example.demo.entity.Stock;

import java.util.List;

public interface StockService {
    List<Stock> getStock(String tableName, Long from, Long to);
}

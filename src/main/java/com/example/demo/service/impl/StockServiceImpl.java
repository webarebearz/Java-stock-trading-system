package com.example.demo.service.impl;

import com.example.demo.entity.Stock;
import com.example.demo.mapper.StockMapper;
import com.example.demo.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class StockServiceImpl implements StockService {

    @Autowired
    private StockMapper stockMapper;

    @Override
    public List<Stock> getStock(String tableName, Long from, Long to) {
        List<Stock> stockData = stockMapper.getStock(tableName, from, to);
        return stockData;
    }
}

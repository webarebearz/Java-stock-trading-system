package com.example.demo.controller;

import com.example.demo.common.Result;
import com.example.demo.entity.Stock;
import com.example.demo.service.StockService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/stock")
public class StockController {
    private StockService stockService;

    @GetMapping("/get_stock")
    public Result getStock(String tableName,Long from, Long to) {

        List<Stock> stockData = stockService.getStock(tableName, from, to);
        return Result.success(stockData);
    }
}

package com.example.demo.mapper;

import com.example.demo.entity.Stock;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StockMapper {

    public List<Stock> getStock(String tableName, Long from, Long to);
}

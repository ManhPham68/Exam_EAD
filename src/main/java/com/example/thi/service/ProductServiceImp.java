package com.example.thi.service;

import com.example.thi.dto.ProductDto;
import com.example.thi.entity.ProductEntity;
import com.example.thi.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductServiceImp implements ProductService{
     @Autowired
    ProductRepo productRepo;
    @Override
    public List<ProductDto> getAllProduct() {
        List<ProductEntity> list = productRepo.findAll();
        List<ProductDto> dtoList = new ArrayList<>();
        for(ProductEntity p : list){
            ProductDto dto  = new ProductDto(p.getProdid(), p.getProdname(), p.getDescription(), p.getDateofmanf(), p.getPrice());
            dtoList.add(dto);
        }
        return dtoList;
    }
}

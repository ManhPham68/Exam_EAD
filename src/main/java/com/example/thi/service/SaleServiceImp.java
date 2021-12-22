package com.example.thi.service;

import com.example.thi.dto.ProductDto;
import com.example.thi.dto.SaleDto;
import com.example.thi.entity.ProductEntity;
import com.example.thi.entity.SaleEntity;
import com.example.thi.repository.SaleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class SaleServiceImp implements SaleService{
      @Autowired
    SaleRepo saleRepo;

    @Override
    public List<SaleDto> getAllSale() {
        List<SaleEntity> list = saleRepo.findAll();
        List<SaleDto> dtoList = new ArrayList<>();
        for(SaleEntity p : list){
            SaleDto dto  = new SaleDto(p.getSino(), p.getSalesmanid(), p.getProdid(), p.getSalesmanname(), p.getDos());
            dtoList.add(dto);
        }
        return dtoList;
    }
}

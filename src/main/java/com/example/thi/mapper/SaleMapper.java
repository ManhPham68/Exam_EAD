package com.example.thi.mapper;

import com.example.thi.dto.ProductDto;
import com.example.thi.dto.SaleDto;
import com.example.thi.entity.ProductEntity;
import com.example.thi.entity.SaleEntity;
import org.mapstruct.Mapper;
import org.mapstruct.NullValueCheckStrategy;

@Mapper(componentModel = "spring", nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS)
public interface SaleMapper {
    SaleDto convertToDto(SaleEntity userEntity);
    SaleEntity convertToEntity(SaleDto userDto);
}

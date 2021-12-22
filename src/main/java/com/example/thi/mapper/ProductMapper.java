package com.example.thi.mapper;

import com.example.thi.dto.ProductDto;
import com.example.thi.entity.ProductEntity;
import org.mapstruct.Mapper;
import org.mapstruct.NullValueCheckStrategy;

@Mapper(componentModel = "spring", nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS)
public interface ProductMapper {
    ProductDto convertToDto(ProductEntity userEntity);
    ProductEntity convertToEntity(ProductDto userDto);
}

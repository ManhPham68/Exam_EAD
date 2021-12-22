package com.example.thi.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductDto {
    private int prodid;

    private String prodname;

    private String description;

    private String dateofmanf;

    private String price;
}

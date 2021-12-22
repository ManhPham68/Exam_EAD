package com.example.thi.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SaleDto {
    private int sino;
    private int salesmanid;
    private int prodid;
    private String salesmanname;
    private String dos;
}

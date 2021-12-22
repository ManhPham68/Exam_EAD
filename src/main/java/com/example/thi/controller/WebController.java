package com.example.thi.controller;

import com.example.thi.service.ProductService;
import com.example.thi.service.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

    @Autowired
    ProductService productService;
    @Autowired
    SaleService saleService;

    @GetMapping("/")
    public String index(Model model) {

        model.addAttribute("products",productService.getAllProduct());
        model.addAttribute("sales",saleService.getAllSale());
        return "index";
    }
    @GetMapping("/listsale")
    public String listsale(Model model) {

        model.addAttribute("sales",saleService.getAllSale());
        return "listsale";
    }
}

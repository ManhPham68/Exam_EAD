package com.example.thi.repository;

import com.example.thi.entity.SaleEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SaleRepo extends JpaRepository<SaleEntity,Integer> {
}

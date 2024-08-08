package com.panha.java.phoneShop.controller;

import com.panha.java.phoneShop.dto.BrandDTO;
import com.panha.java.phoneShop.entity.Brand;
import com.panha.java.phoneShop.service.BrandService;
import com.panha.java.phoneShop.service.util.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("brands")
public class BrandController {
    @Autowired
    private BrandService brandService;
    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<?> create (@RequestBody BrandDTO brandDTO)  {
        Brand brand = Mapper.toBrand(brandDTO);
        brand = brandService.create(brand);
        return ResponseEntity.ok(brand);
    }
}

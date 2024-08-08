package com.panha.java.phoneShop.service.util;

import com.panha.java.phoneShop.dto.BrandDTO;
import com.panha.java.phoneShop.entity.Brand;

public class Mapper {
    public static Brand toBrand (BrandDTO dto){
        Brand brand = new Brand();
        brand.setId(dto.getId());
        brand.setName(dto.getName());
        return brand;
    }
}

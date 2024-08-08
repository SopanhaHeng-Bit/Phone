package com.panha.java.phoneShop.service.Impl;

import com.panha.java.phoneShop.Repository.BrandRepository;
import com.panha.java.phoneShop.entity.Brand;
import com.panha.java.phoneShop.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BrandServiceImpl implements BrandService {
    @Autowired
    private BrandRepository brandRepository;
    @Override
    public Brand create(Brand brand) {
        return brandRepository.save(brand);
    }
}

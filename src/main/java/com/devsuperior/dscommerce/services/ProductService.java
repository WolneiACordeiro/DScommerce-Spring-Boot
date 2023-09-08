package com.devsuperior.dscommerce.services;

import com.devsuperior.dscommerce.dto.ProductDTO;
import com.devsuperior.dscommerce.dto.ProductMinDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ProductService {
    ProductDTO findById(Long id);
    Page<ProductMinDTO> findAll(String name, Pageable pageable);
    ProductDTO insert(ProductDTO dto);
    ProductDTO update(Long id, ProductDTO dto);
    void delete(Long id);
}

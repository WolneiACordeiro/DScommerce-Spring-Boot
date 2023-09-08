package com.devsuperior.dscommerce.services.impl;

import com.devsuperior.dscommerce.dto.ProductDTO;
import com.devsuperior.dscommerce.dto.ProductMinDTO;
import com.devsuperior.dscommerce.entities.Product;
import com.devsuperior.dscommerce.repository.ProductRepository;
import com.devsuperior.dscommerce.services.ProductService;
import com.devsuperior.dscommerce.services.exceptions.DatabaseException;
import com.devsuperior.dscommerce.services.exceptions.ResourceNotFoundException;
import jakarta.persistence.EntityNotFoundException;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    ModelMapper mapper;
    @Autowired
    private ProductRepository repository;
    @Transactional(readOnly = true)
    @Override
    public ProductDTO findById(Long id) {
            Product product = repository.findById(id)
                    .orElseThrow(() -> new ResourceNotFoundException("Resource not found with id: " + id));
            return mapToDTO(product);
    }
    @Transactional(readOnly = true)
    @Override
    public Page<ProductMinDTO> findAll(String name, Pageable pageable) {
        Page<Product> result = repository.searchByName(name, pageable);
        return result.map(x -> mapToMinDTO(x));
    }
    @Transactional
    @Override
    public ProductDTO insert(ProductDTO dto) {
        Product entity = mapToEntity(dto);
        entity = repository.save(entity);
        return mapToDTO(entity);
    }
    @Transactional
    @Override
    public ProductDTO update(Long id, ProductDTO dto) {
        try {
            Product entity = repository.getReferenceById(id);
            entity.setName(dto.getName());
            entity.setDescription(dto.getDescription());
            entity.setPrice(dto.getPrice());
            entity.setImgUrl(dto.getImgUrl());
            entity = repository.save(entity);
            return mapToDTO(entity);
        } catch (EntityNotFoundException e){
            throw new ResourceNotFoundException("Resource not found with id: " + id);
        }
    }
    @Transactional(propagation = Propagation.SUPPORTS)
    @Override
    public void delete(Long id) {
        if (!repository.existsById(id)) {
            throw new ResourceNotFoundException("Resource not found with id: " + id);
        }
        try {
            repository.deleteById(id);
        }
        catch (DataIntegrityViolationException e) {
            throw new DatabaseException("Referential Integrity Failure");
        }
    }
    //DTO//
    private ProductDTO mapToDTO(Product product){
        ProductDTO productDTO = mapper.map(product, ProductDTO.class);
        return productDTO;
    }
    private ProductMinDTO mapToMinDTO(Product product){
        ProductMinDTO productDTO = mapper.map(product, ProductMinDTO.class);
        return productDTO;
    }
    private  Product mapToEntity(ProductDTO productDTO){
        Product product = mapper.map(productDTO, Product.class);
        return product;
    }
}

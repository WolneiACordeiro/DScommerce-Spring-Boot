package com.devsuperior.dscommerce.services.impl;

import com.devsuperior.dscommerce.dto.OrderDTO;
import com.devsuperior.dscommerce.entities.Order;
import com.devsuperior.dscommerce.repository.OrderRepository;
import com.devsuperior.dscommerce.services.OrderService;
import com.devsuperior.dscommerce.services.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderRepository repository;
    //@Autowired
    //private ModelMapper modelMapper;
    @Transactional(readOnly = true)
    @Override
    public OrderDTO findById(Long id) {
        Order order = repository.findById(id).orElseThrow(
                () -> new ResourceNotFoundException("Resource not found with id: " + id));
        return new OrderDTO(order);
    }
}

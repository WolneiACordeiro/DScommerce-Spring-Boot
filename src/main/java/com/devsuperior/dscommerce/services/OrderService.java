package com.devsuperior.dscommerce.services;

import com.devsuperior.dscommerce.dto.OrderDTO;
import com.devsuperior.dscommerce.dto.ProductDTO;

public interface OrderService {
    OrderDTO findById(Long id);
    OrderDTO insert(OrderDTO dto);
}

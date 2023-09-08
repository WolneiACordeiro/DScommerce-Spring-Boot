package com.devsuperior.dscommerce.dto;

import com.devsuperior.dscommerce.entities.Product;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductMinDTO {
    private Long id;
    private String name;
    private  Double price;
    private String imgUrl;
}

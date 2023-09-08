package com.devsuperior.dscommerce.dto;

import lombok.Data;

@Data
public class ProductMinDTO {
    private Long id;
    private String name;
    private  Double price;
    private String imgUrl;
}

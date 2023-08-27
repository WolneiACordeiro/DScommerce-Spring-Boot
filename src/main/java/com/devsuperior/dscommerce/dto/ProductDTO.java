package com.devsuperior.dscommerce.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class ProductDTO {
    private Long id;
    @NotBlank(message = "Field required")
    @Size(min = 3, max = 80, message = "Name must be 3 to 80 characters long")
    private String name;
    @NotBlank(message = "Field required")
    @Size(min = 10, message = "Description must be at least 10 characters")
    private String description;
    @Positive(message = "Price needs to be positive")
    private  Double price;
    private String imgUrl;
}

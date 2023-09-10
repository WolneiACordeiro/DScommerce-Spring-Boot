package com.devsuperior.dscommerce.dto;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductDTO {
    private Long id;
    @NotBlank(message = "Field required")
    @Size(min = 3, max = 80, message = "Name must be 3 to 80 characters long")
    private String name;
    @NotBlank(message = "Field required")
    @Size(min = 10, message = "Description must be at least 10 characters")
    private String description;
    @NotNull(message = "Field required")
    @Positive(message = "Price needs to be positive")
    private Double price;
    private String imgUrl;
    @NotEmpty(message = "Must have at least one category")
    private List<CategoryDTO> categories = new ArrayList<>();
}

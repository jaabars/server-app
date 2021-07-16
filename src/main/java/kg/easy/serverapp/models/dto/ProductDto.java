package kg.easy.serverapp.models.dto;

import lombok.Data;

@Data
public class ProductDto {
    private Long id;
    private String name;
    private Double price;

    private CategoryDto category;
}

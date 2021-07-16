package kg.easy.serverapp.models.dto;


import lombok.Data;

@Data
public class CategoryDto {

    private Long id;
    private String name;
    private boolean active;
}

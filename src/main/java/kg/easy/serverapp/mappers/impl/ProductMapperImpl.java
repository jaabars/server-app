package kg.easy.serverapp.mappers.impl;

import kg.easy.serverapp.mappers.CategoryMapper;
import kg.easy.serverapp.mappers.ProductMapper;
import kg.easy.serverapp.models.Category;
import kg.easy.serverapp.models.Product;
import kg.easy.serverapp.models.dto.CategoryDto;
import kg.easy.serverapp.models.dto.ProductDto;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
public class ProductMapperImpl implements ProductMapper {

    private CategoryMapper categoryMapper;


    public ProductMapperImpl(CategoryMapper categoryMapper){
        this.categoryMapper = categoryMapper;
    }
    @Override
    public ProductDto toDto(Product product) {
        ProductDto productDto = new ProductDto();
        productDto.setId(product.getId());
        productDto.setName(product.getName());
        productDto.setPrice(product.getPrice());
      /*  CategoryDto categoryDto = new CategoryDto();
        categoryDto.setId(product.getId());
        categoryDto.setActive(product.getCategory().isActive());
        categoryDto.setName(product.getCategory().getName());
        productDto.setCategory(categoryDto);*/
        productDto.setCategory(categoryMapper.toDto(product.getCategory()));
        return productDto;
    }

    @Override
    public Product toEntity(ProductDto productDto) {
        Product product = new Product();
        product.setId(productDto.getId());
        product.setName(productDto.getName());
        product.setPrice(productDto.getPrice());
        product.setCategory(categoryMapper.toEntity(productDto.getCategory()));
        return product;
    }

    @Override
    public List<ProductDto> toDtoList(List<Product> t) {


        return t.stream().map(p->toDto(p)).collect(Collectors.toList());
    }

    @Override
    public List<Product> toEntityList(List<ProductDto> productDtos) {
        return productDtos.stream().map(p->toEntity(p)).collect(Collectors.toList());
    }
}

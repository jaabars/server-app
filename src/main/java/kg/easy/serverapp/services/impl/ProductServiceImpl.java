package kg.easy.serverapp.services.impl;

import kg.easy.serverapp.dao.ProductRepo;
import kg.easy.serverapp.mappers.ProductMapper;
import kg.easy.serverapp.models.Product;
import kg.easy.serverapp.models.dto.ProductDto;
import kg.easy.serverapp.services.ProductService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    private ProductRepo productRepo;

    private ProductMapper productMapper;


    public ProductServiceImpl(ProductRepo productRepo,ProductMapper productMapper){
        this.productRepo = productRepo;
        this.productMapper=productMapper;
    }
    @Override
    public ProductDto save(ProductDto productDto) {
        Product product = productMapper.toEntity(productDto);
        product = productRepo.save(product);
        return productMapper.toDto(product);
    }

    @Override
    public ProductDto update(ProductDto productDto) {
        return null;
    }

    @Override
    public ProductDto findById(Long id) {
        return productMapper.toDto(productRepo.findById(id).get());
    }

    @Override
    public List<ProductDto> findAll() {
        return productMapper.toDtoList(productRepo.findAll());
    }
}

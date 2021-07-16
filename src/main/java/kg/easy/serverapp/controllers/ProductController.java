package kg.easy.serverapp.controllers;


import kg.easy.serverapp.models.dto.ProductDto;
import kg.easy.serverapp.services.ProductService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/product")
public class ProductController  implements BaseCrudController<ProductDto,Long>{

    private ProductService productService;

    public ProductController(ProductService productService){
        this.productService = productService;
    }

    @Override
    public ProductDto save(ProductDto productDto) {
        return productService.save(productDto);
    }

    @Override
    public ProductDto update(ProductDto productDto) {
        return productService.save(productDto);
    }

    @Override
    public ProductDto findById(Long id) {
        return productService.findById(id);
    }

    @Override
    public List<ProductDto> findAll() {
        return productService.findAll();
    }
}

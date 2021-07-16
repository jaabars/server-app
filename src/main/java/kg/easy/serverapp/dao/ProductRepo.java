package kg.easy.serverapp.dao;

import kg.easy.serverapp.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProductRepo  extends JpaRepository<Product,Long> {
}

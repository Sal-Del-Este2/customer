package cl.duoc.ms_product_db.service;

import java.util.List;
import org.springframework.stereotype.Service;
import cl.duoc.ms_product_db.model.entities.Product;
import cl.duoc.ms_product_db.model.repository.ProductRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;
    
    public List<Product> findAll() {
        return productRepository.findAll();
    }
    
    public Product save(Product product) {
        return productRepository.save(product);
    }

}

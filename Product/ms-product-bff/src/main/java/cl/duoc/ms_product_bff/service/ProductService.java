package cl.duoc.ms_product_bff.service;

import java.util.List;

import org.springframework.stereotype.Service;

import cl.duoc.ms_product_bff.model.dto.ProductDTO;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductDsFeignClient dbFeignClient;
    
    public List<ProductDTO> getAll() {
        return dbFeignClient.getAll();
    }

}

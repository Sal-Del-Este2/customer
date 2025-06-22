package cl.duoc.ms_product_bs.service;

import java.util.List;

import org.springframework.stereotype.Service;

import cl.duoc.ms_product_bs.model.dto.ProductDTO;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductDbFeignClient dbFeignClient;
    
    public List<ProductDTO> getAll() {
        return dbFeignClient.getAll();
    }

}

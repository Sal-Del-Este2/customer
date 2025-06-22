package cl.duoc.ms_product_bs.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import cl.duoc.ms_product_bs.model.dto.ProductDTO;

@FeignClient(name = "ms-product-db", url = "http://localhost:8083")
public interface ProductDbFeignClient {
    @GetMapping("/products")
    List<ProductDTO> getAll();
    
    @PostMapping("/products")
    ProductDTO create(@RequestBody ProductDTO product);

}

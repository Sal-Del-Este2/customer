package cl.duoc.ms_product_bff.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import cl.duoc.ms_product_bff.model.dto.ProductDTO;

@FeignClient(name = "ms-product-bs", url = "http://localhost:8182")
public interface ProductBsFeignClient {


    @GetMapping("/api/products")
    List<ProductDTO> getAll();
}

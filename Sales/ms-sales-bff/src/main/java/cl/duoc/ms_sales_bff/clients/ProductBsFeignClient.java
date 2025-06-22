package cl.duoc.ms_sales_bff.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import cl.duoc.ms_sales_bff.model.dto.ProductDTO;

@FeignClient(name = "ms-product-bs", url = "${ms.product.bs.url}")
public interface ProductBsFeignClient {

    @GetMapping("/api/product/{id}")
    ResponseEntity<ProductDTO> findProductById(@PathVariable("id") Long id);

}

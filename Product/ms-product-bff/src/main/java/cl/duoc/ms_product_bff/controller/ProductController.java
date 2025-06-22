package cl.duoc.ms_product_bff.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.duoc.ms_product_bff.client.ProductBsFeignClient;
import cl.duoc.ms_product_bff.model.dto.ProductDTO;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/bff/products")
@CrossOrigin(origins = "*")
@RequiredArgsConstructor // Inyección automática
public class ProductController {

    private final ProductBsFeignClient bsFeignClient;

    @GetMapping
    public List<ProductDTO> getAll() {
        return bsFeignClient.getAll();
    }

}

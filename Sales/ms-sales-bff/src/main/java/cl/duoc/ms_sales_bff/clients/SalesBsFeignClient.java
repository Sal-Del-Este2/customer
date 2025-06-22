package cl.duoc.ms_sales_bff.clients;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.cloud.openfeign.FeignClient;
import cl.duoc.ms_sales_bff.model.dto.SalesDTO;

@FeignClient(name = "ms-sales-bs", url = "${ms.sales.bs.url}")
public interface SalesBsFeignClient {

    @GetMapping("/api/sales/{id}")
    ResponseEntity<SalesDTO> findSalesById(@PathVariable("id") Long id);

    @PostMapping("/api/sales")
    ResponseEntity<SalesDTO> insertSale(@RequestBody SalesDTO salesDTO);

}

package cl.duoc.ms_sales_bff.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import cl.duoc.ms_sales_bff.service.SaleService;
import cl.duoc.ms_sales_bff.model.dto.SalesDTO;

@RestController
@RequestMapping("/api/bff/sales")

public class SaleController {

    @Autowired
    SaleService saleService;

    @GetMapping("/{id}")
    public ResponseEntity<SalesDTO> findSalesById(@PathVariable("id") Long id) {
        SalesDTO salesDTO = saleService.findSalesById(id);
        return (salesDTO != null) ? ResponseEntity.ok(salesDTO) : ResponseEntity.notFound().build();
    }

    @PostMapping("")
    public ResponseEntity<SalesDTO> insertSale(@RequestBody SalesDTO salesDTO) {
        SalesDTO newSalesDTO = saleService.insertSale(salesDTO);
        return (newSalesDTO != null) ? ResponseEntity.ok(newSalesDTO) : ResponseEntity.badRequest().build();
    }
}

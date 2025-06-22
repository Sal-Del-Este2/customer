package cl.duoc.ms_sales_bff.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cl.duoc.ms_sales_bff.clients.SalesBsFeignClient;
import cl.duoc.ms_sales_bff.model.dto.SalesDTO;

@Service
public class SaleService {

    @Autowired
    SalesBsFeignClient salesBsFeignClient;
    public SalesDTO findSalesById(Long id) {
        SalesDTO salesDTO = salesBsFeignClient.findSalesById(id).getBody();
        // Aquí puedes enriquecer la respuesta si lo necesitas
        return salesDTO;
    }

    public SalesDTO insertSale(SalesDTO salesDTO) {
        SalesDTO newSalesDTO = salesBsFeignClient.insertSale(salesDTO).getBody();
        return newSalesDTO;
    }

}

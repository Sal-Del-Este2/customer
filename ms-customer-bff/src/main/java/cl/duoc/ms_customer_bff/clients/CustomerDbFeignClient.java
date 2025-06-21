package cl.duoc.ms_customer_bff.clients;

import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import cl.duoc.ms_customer_bff.model.dto.CustomerDTO;

// agregar metodo
import org.springframework.web.bind.annotation.*;

// @RequestMapping("/customers")
@FeignClient(
    name = "ms-customer-bs",
    url = "http://localhost:8181/")
    public interface CustomerDbFeignClient {

    @GetMapping("/customer")
    public List<CustomerDTO> selectAllCustomer();

    @PostMapping("/customer")
    CustomerDTO createCustomer(@RequestBody CustomerDTO customer);

    @PutMapping("/customer/{id}")
    CustomerDTO updateCustomer(@PathVariable Long id, @RequestBody CustomerDTO customer);

    @DeleteMapping("/customer/{id}")
    void deleteCustomer(@PathVariable Long id);
    
}
package cl.duoc.ms_customer_bs.clients;

import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import cl.duoc.ms_customer_bs.model.dto.CustomerDTO;

// agregar metodo
import org.springframework.web.bind.annotation.*;

// @RequestMapping("/customers")
@FeignClient(name = "ms-customer-db", url = "http://localhost:8080")
public interface CustomerDbFeignClient {

    @GetMapping("/customers")
    public List<CustomerDTO> selectAllCustomer();

    @PostMapping("/customers")
    CustomerDTO createCustomer(@RequestBody CustomerDTO customer);

    @PutMapping("/customers/{id}")
    CustomerDTO updateCustomer(@PathVariable Long id, @RequestBody CustomerDTO customer);

    @DeleteMapping("/customers/{id}")
    void deleteCustomer(@PathVariable Long id);

}

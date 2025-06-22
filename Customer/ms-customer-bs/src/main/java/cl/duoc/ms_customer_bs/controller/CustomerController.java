package cl.duoc.ms_customer_bs.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import cl.duoc.ms_customer_bs.model.dto.CustomerDTO;
import cl.duoc.ms_customer_bs.service.CustomerService;

// Agrega los endpoints
import org.springframework.web.bind.annotation.*;
// @CrossOrigin(origins = "*")
// @RequestMapping("/customers")
@RestController
public class CustomerController {

    @Autowired
    CustomerService customerService;
    
    @GetMapping("/customer")
    public List<CustomerDTO> selectAllCustomer(){
        return customerService.selectAllCustomer();
    }

    @PostMapping("/customer")
    public CustomerDTO createCustomer(@RequestBody CustomerDTO customer) {
        return customerService.createCustomer(customer);
    }

    @PutMapping("/customer/{id}")
    public CustomerDTO updateCustomer(@PathVariable Long id, @RequestBody CustomerDTO customer) {
        return customerService.updateCustomer(id, customer);
    }

    @DeleteMapping("/customer/{id}")
    public void deleteCustomer(@PathVariable Long id) {
        customerService.deleteCustomer(id);
    }
}

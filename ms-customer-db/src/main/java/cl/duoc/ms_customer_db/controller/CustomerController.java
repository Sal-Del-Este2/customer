package cl.duoc.ms_customer_db.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import cl.duoc.ms_customer_db.model.entities.Customer;
import cl.duoc.ms_customer_db.service.CustomerService;
import org.springframework.web.bind.annotation.GetMapping;

//agregar cliente
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;

//actualizar datos
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;

//eliminar cliente
import org.springframework.web.bind.annotation.DeleteMapping;


// import org.springframework.web.bind.annotation.RequestMapping;
// @RequestMapping("/customers")
@RestController
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @GetMapping("/customers")
    public List<Customer> selectAllCustomer() {
        return customerService.selectAllCustomer();
    }

    // crear un cliente
    @PostMapping("/customers")
    public ResponseEntity<Customer> createCustomer(@RequestBody Customer customer) {
        Customer savedCustomer = customerService.saveCustomer(customer);
        return new ResponseEntity<>(savedCustomer, HttpStatus.CREATED);
    }

    //modificar un usuario
    @PutMapping("/customers/{id}")
    public ResponseEntity<Customer> updateCustomer(@PathVariable("id") Long id, @RequestBody Customer customer) {
        Customer updatedCustomer = customerService.updateCustomer(id, customer);
        if(updatedCustomer == null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return ResponseEntity.ok(updatedCustomer);
    }

    // eliminar cliente
    @DeleteMapping("/customers/{id}")
    public ResponseEntity<Void> deleteCustomer(@PathVariable("id") Long id) {
        boolean deleted = customerService.deleteCustomer(id);
        if (deleted) {
            return ResponseEntity.ok().build(); // 200 OK
        } else {
            return ResponseEntity.notFound().build();  // 404 Not Found
        }
    }

}
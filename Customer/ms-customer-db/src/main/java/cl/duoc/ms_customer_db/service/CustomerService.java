package cl.duoc.ms_customer_db.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cl.duoc.ms_customer_db.model.entities.Customer;
import cl.duoc.ms_customer_db.model.repository.CustomerRepository;

@Service
public class CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    public List<Customer> selectAllCustomer(){
        List<Customer> listaCustomers = customerRepository.findAll();
        return listaCustomers;
        // return customerRepository.findAll();
    }

    // metodo para agregar cliente
    public Customer saveCustomer(Customer customer){
        return customerRepository.save(customer);
    }

    //metodo para modificar cliente
    public Customer updateCustomer(Long id, Customer customer){
        return customerRepository.findById(id).map(existingCustomer -> {
            existingCustomer.setUsername(customer.getUsername());
            existingCustomer.setPassword(customer.getPassword());
            existingCustomer.setName(customer.getName());
            existingCustomer.setLastname(customer.getLastname());
            existingCustomer.setEmail(customer.getEmail());
            return customerRepository.save(existingCustomer);
        }).orElse(null);
    }

    // metodo para eliminar cliente
    public boolean deleteCustomer(Long id){
        return customerRepository.findById(id).map(customer -> {
            customerRepository.delete(customer);
            return true;
        }).orElse(false);
    }
    
}

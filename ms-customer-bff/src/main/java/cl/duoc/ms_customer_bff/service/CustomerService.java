package cl.duoc.ms_customer_bff.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cl.duoc.ms_customer_bff.clients.CustomerDbFeignClient;
import cl.duoc.ms_customer_bff.model.dto.CustomerDTO;

@Service
public class CustomerService {

    @Autowired
    CustomerDbFeignClient customerDbFeignClient;

    public List<CustomerDTO> selectAllCustomer(){
        List<CustomerDTO> listaClientes = customerDbFeignClient.selectAllCustomer();
        return listaClientes;
    }

    public CustomerDTO createCustomer(CustomerDTO customer) {
        return customerDbFeignClient.createCustomer(customer);
    }

    public CustomerDTO updateCustomer(Long id, CustomerDTO customer) {
        return customerDbFeignClient.updateCustomer(id, customer);
    }

    public void deleteCustomer(Long id) {
        customerDbFeignClient.deleteCustomer(id);
    }

}

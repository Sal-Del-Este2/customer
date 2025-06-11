package cl.duoc.ms_customer_bs.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cl.duoc.ms_customer_bs.clients.CustomerDbFeignClient;
import cl.duoc.ms_customer_bs.model.dto.CustomerDTO;

@Service
public class CustomerService {

    @Autowired
    CustomerDbFeignClient CustomerDbFeignClient;

    public List<CustomerDTO> selectAllCustomer(){
        List<CustomerDTO> listaClientes = CustomerDbFeignClient.selectAllCustomer();
        return listaClientes;
    }

    public CustomerDTO createCustomer(CustomerDTO customer) {
        return CustomerDbFeignClient.createCustomer(customer);
    }

    public CustomerDTO updateCustomer(Long id, CustomerDTO customer) {
        return CustomerDbFeignClient.updateCustomer(id, customer);
    }

    public void deleteCustomer(Long id) {
        CustomerDbFeignClient.deleteCustomer(id);
    }
    
}

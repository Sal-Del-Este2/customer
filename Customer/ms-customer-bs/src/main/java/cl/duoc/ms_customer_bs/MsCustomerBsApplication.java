package cl.duoc.ms_customer_bs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class MsCustomerBsApplication {
	public static void main(String[] args) {
		SpringApplication.run(MsCustomerBsApplication.class, args);
	}
}

// http://localhost:8181/customers
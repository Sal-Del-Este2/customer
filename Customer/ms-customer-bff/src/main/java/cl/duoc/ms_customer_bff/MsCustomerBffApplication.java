package cl.duoc.ms_customer_bff;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class MsCustomerBffApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsCustomerBffApplication.class, args);
	}

}

// http://localhost:8282/customer

//./gradlew clean build
// ./gradlew bootRun
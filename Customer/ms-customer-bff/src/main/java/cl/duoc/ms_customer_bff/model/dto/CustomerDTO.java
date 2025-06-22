package cl.duoc.ms_customer_bff.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString

public class CustomerDTO {
    
    private Long id;
    private String username;
    private String password;
    private String name;
    private String lastname;
    private String email;
    
}

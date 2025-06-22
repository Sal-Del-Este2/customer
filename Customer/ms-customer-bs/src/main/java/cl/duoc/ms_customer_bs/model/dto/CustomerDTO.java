package cl.duoc.ms_customer_bs.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor //Crea un constructor con todos los parámetros
@NoArgsConstructor //Crea un constructor sin parámetros
@Getter //Crea los getter de todos los atributos de la clase
@Setter //Crea los setter de todos los atributos de la clase
@ToString //Crea el método toString, el cual retorna un texto con todos los atributos de la clase y sus respectivos valores

public class CustomerDTO {

    private Long id;
    private String username;
    private String password;
    private String name;
    private String lastname;
    private String email;

}

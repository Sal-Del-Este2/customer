package cl.duoc.ms_sales_bff.model.dto;

import java.util.List;
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
public class SalesDTO {

    private Long id;
    private Long amount;
    private Long customerId;
    private List<SalesDetailDTO> salesDetailDtoList;

}

package resolucao.desafio.btgpactual.ordersms.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.FieldType;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderItem {

    private String product;

    private Integer decimal;

    @Field(targetType = FieldType.DECIMAL128)
    private BigDecimal price;

}

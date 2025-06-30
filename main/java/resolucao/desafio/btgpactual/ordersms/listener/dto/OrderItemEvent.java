package resolucao.desafio.btgpactual.ordersms.listener.dto;

import java.math.BigDecimal;

public record OrderItemEvent (String produto,
                             Integer quantidade,
                             BigDecimal preco) {

}

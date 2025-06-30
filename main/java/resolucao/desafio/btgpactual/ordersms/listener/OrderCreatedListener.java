package resolucao.desafio.btgpactual.ordersms.listener;


import lombok.extern.flogger.Flogger;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;
import resolucao.desafio.btgpactual.ordersms.listener.dto.OrderCreatedEvent;
import resolucao.desafio.btgpactual.ordersms.repository.service.OrderService;

import static resolucao.desafio.btgpactual.ordersms.config.RabbitMqConfig.ORDER_CREATED_QUEUE;

@Component
public class OrderCreatedListener {

    private final Logger logger = LoggerFactory.getLogger(OrderCreatedListener.class);

    private final OrderService orderService;

    public OrderCreatedListener(OrderService orderService) {
        this.orderService = orderService;
    }

    @RabbitListener(queues = ORDER_CREATED_QUEUE)
    public void listen(Message<OrderCreatedEvent> message){
        logger.info("Message cosumed {}", message);

        orderService.save(message.getPayload());
    }
}

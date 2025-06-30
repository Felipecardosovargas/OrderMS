package resolucao.desafio.btgpactual.ordersms.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.mongodb.repository.MongoRepository;
import resolucao.desafio.btgpactual.ordersms.entity.OrderEntity;

public interface OrderRepository extends MongoRepository<OrderEntity, Long> {
    Page<OrderEntity> findAllByCustumerId(Long custumerId, PageRequest pageRequest);
}

package ford.rahmir.produceManagerApp.repository;

import ford.rahmir.produceManagerApp.model.OrderItem;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by rahmirford on 6/29/17.
 */
public interface ProductOrderRepository extends CrudRepository<OrderItem, Long> {
}

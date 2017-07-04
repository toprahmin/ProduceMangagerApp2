package ford.rahmir.produceManagerApp.repository;

import ford.rahmir.produceManagerApp.model.Product;
import org.springframework.data.repository.CrudRepository;


/**
 * Created by rahmirford on 6/28/17.
 */
public interface ProductRepository extends CrudRepository<Product, Long> {

}

package tabling.infra;

import tabling.domain.*;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface OrderListRepository extends CrudRepository<OrderList, Long> {


}
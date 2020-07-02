package com.dbs.repository;

import com.dbs.entity.OrderItemEntity;
import org.springframework.data.repository.CrudRepository;

public interface OrderItemRepository extends CrudRepository<OrderItemEntity, Integer> {

}

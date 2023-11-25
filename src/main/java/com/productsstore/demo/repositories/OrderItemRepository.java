package com.productsstore.demo.repositories;

import com.productsstore.demo.entities.OrderItem;
import com.productsstore.demo.entities.OrderItemPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {
}

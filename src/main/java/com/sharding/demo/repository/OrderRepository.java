package com.sharding.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.sharding.demo.entity.Order;

public interface OrderRepository extends CrudRepository<Order, Long> {
}

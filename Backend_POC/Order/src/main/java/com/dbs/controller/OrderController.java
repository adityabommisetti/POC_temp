package com.dbs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dbs.entity.OrderItemVO;
import com.dbs.entity.OrderVO;
import com.dbs.service.OrderItemClient;
import com.dbs.service.OrderService;

@RestController
public class OrderController {

	@Autowired
	private OrderService orderService;

	@Autowired
	OrderItemClient client;

	@GetMapping("/orders")
	private List<OrderVO> getOrders() {
		return orderService.getOrders();
	}

	@GetMapping("/orderItems")
	private List<OrderItemVO> getOrdersItems() {
		return client.getOrderItems();
	}

}

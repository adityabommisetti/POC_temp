package com.dbs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dbs.service.OrderItemService;
import com.dbs.vo.OrderItemVO;

@RestController
public class OrderItemController {

	@Autowired
	private OrderItemService orderItemService;

	@GetMapping("/orderItem")
	private List<OrderItemVO> getOrderItems() {
		return orderItemService.getOrderItems();
	}

}

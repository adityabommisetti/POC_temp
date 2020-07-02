package com.dbs.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dbs.entity.OrderVO;
import com.dbs.repository.OrderRepository;

@Service
public class OrderService {

	@Autowired
	OrderRepository orderRepository;

	public List<OrderVO> getOrders() {
		List<OrderVO> orders = new ArrayList<OrderVO>();
		orderRepository.findAll().forEach(order -> {
			OrderVO orderVO = new OrderVO();
			BeanUtils.copyProperties(order, orderVO);
			orders.add(orderVO);
		});

		return orders;
	}
}
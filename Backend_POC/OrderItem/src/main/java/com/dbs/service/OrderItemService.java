package com.dbs.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dbs.repository.OrderItemRepository;
import com.dbs.vo.OrderItemVO;

@Service
public class OrderItemService {

	@Autowired
	OrderItemRepository orderItemRepository;

	public List<OrderItemVO> getOrderItems() {
		List<OrderItemVO> orders = new ArrayList<OrderItemVO>();
		orderItemRepository.findAll().forEach(order -> {
			OrderItemVO orderVO = new OrderItemVO();
			BeanUtils.copyProperties(order, orderVO);
			orders.add(orderVO);
		});

		return orders;
	}

}
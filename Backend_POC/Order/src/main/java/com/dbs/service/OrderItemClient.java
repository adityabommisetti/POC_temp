package com.dbs.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

import com.dbs.entity.OrderItemVO;
@FeignClient(name="ORDERITEMS", fallback=OrderItemFallback.class)
public interface OrderItemClient {
	@GetMapping("/orderItem")
	public List<OrderItemVO> getOrderItems();
}

@Component
 class OrderItemFallback  implements OrderItemClient {
	
	public List<OrderItemVO> getOrderItems(){
		return new ArrayList<OrderItemVO>();
	}
}

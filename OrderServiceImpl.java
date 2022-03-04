package com.examples.orderservice.service;


import java.util.List;

import javax.persistence.criteria.Order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examples.orderservice.repo.OrderRepo;

@Service
public abstract class OrderServiceImpl implements OrderService{
	
	@Autowired
	OrderRepo repo;

	@Override
	public String insertOrder(Order order) {
		// TODO Auto-generated method stub
		repo.save(order);
		return "Order Added";
	}

	@Override
	public List<Order> displayAllOrder() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}


	public List<Order> searchOrderByproductname(String productname) {
		// TODO Auto-generated method stub
		return repo.searchOrderByproductname(productname);
	}

	@Override
	public List<Order> searchOrderByCustomerId(int cid) {
		// TODO Auto-generated method stub
		return repo.searchOrderByCustomerId(cid);
	}

	@Override
	public List<Order> searchOrderByPrice(int price) {
		// TODO Auto-generated method stub
		return repo.searchOrderByprice(price);
	}

	
	
	@Override
	public int deleteOrder(int oid) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Order> displayAllOder() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Order> searchOrderByOrderId(Object oid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Order> searchOrderByPostId(String productname) {
		// TODO Auto-generated method stub
		return null;
	}

}

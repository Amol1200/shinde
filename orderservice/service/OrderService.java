package com.examples.orderservice.service;

import java.util.List;

import javax.persistence.criteria.Order;



public interface OrderService {
	
	
	String insert = null;
	public String insertOrder(Order order);
    public List<Order> displayAllOrder();
    public int deleteOrder(int oid);
   
	
List<Order> searchOrderByproductname(String productname);
	public List<Order> displayAllOder();
	public List<Order> searchOrderByOrderId(Object oid);
	
	public List<Order> searchOrderByPostId(String productname);
	public List<Order> searchOrderByPrice(int price);
	
	public List<Order> searchOrderByCustomerId(int cid);
	List<Order> searchOrderOrderByOderId(int oid);
	List<Order> searchOrderByOderId(int oid);

}

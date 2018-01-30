package com.rg.Service;

import java.util.ArrayList;
import java.util.List;

import com.rg.Domain.Border;
import com.rg.Domain.Client;
import com.rg.Domain.Customer;

/*
 * 客户抽像类Service
 * 客户信息管理
 * 查询可购买商品
 * 查询已购订单
 * 查询当前订单的物流情况
 */
public abstract class ClientService {

	 

	/**
	 * 根据用户Id查找用户
	 * @param cid
	 * @return 
	 */
	public Object searchById(String cid) {
		System.out.println(44444);
		return  new Object();
		// TODO Auto-generated method stub
	}
	
	/**
	 * 查找全部客户 
	 * @return
	 */
	public List<Customer> selectAll() {
		// TODO Auto-generated method stub
		 
		return new ArrayList<Customer>();
	}

	/**
	 * 添加客户
	 * @param client
	 */
	public  void clientAdd(Object client) {
		// TODO Auto-generated method stub
		
	}

	/**
	 * 根据Id对客户信息的模糊查询
	 * @param cid
	 * @return
	 */
	public List<Customer> likeSelectById(String cid) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * 根据客户名对客户信息的模糊查询
	 * @param cname
	 * @return
	 */
	public List<Customer> likeSelectByname(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * 将客户信息设为隐藏
	 * @param cid
	 */
	public void deleteClient(String cid) {
		// TODO Auto-generated method stub
		
	}

	/**
	 * 更新客户信息
	 * @param client
	 */
	public void updateClient(Object client) {
		// TODO Auto-generated method stub
		
	}

	public List<Border> selcetBorder(String id, int i) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Border> slectAlBorder() {
		// TODO Auto-generated method stub
		return null;
	}

	 

}

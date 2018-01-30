package com.rg.IDao;

import java.util.List;

import com.rg.Domain.Customer;
import com.rg.Domain.Vender;

public interface VenderMapper {
    int deleteByPrimaryKey(String vid);

    int insert(Vender record);

    int insertSelective(Vender record);

    Vender selectByPrimaryKey(String vid);

    int updateByPrimaryKeySelective(Vender record);

    int updateByPrimaryKey(Vender record);

	Vender selectById(String cid);

	void insert(Object vender);

	List<Customer> selectAll();

	List<Customer> likeSelectById(String cid);

	List<Customer> likeSelectByName(String name);

	void deleteClient(String cid, int i);
}
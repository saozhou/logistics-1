package com.rg.IDao;

import java.util.List;

import com.rg.Domain.Client;
import com.rg.Domain.Customer;

public interface ClientMapper {
    int deleteByPrimaryKey(String cid);

    int insert(Client record);

    int insertSelective(Object client);

    Client selectByPrimaryKey(String cid);

    int updateByPrimaryKeySelective(Client record);

    int updateByPrimaryKey(Client record);

	Client selectById(Client client);

	List<Customer> selectAll();

	List<Customer> likeSelectById(Client client);

	List<Customer> likeSelectByName(Client client);

	void deleteClient(String cid, int i);
}
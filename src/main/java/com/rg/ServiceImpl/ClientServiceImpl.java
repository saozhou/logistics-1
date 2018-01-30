package com.rg.ServiceImpl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.rg.Domain.Border;
import com.rg.Domain.Client;
import com.rg.Domain.Customer;
import com.rg.IDao.BorderMapper;
import com.rg.IDao.ClientMapper;
import com.rg.Service.ClientService;

/**
 * 
 * @author Zhou
 *客户ServiceImpl
 */
@Service("clientService")
public class ClientServiceImpl extends ClientService {
	
	@Resource
	private ClientMapper clientDao;
 
	@Override
	public Client searchById(String cid) {
		Client client = new Client();
		client.setId(cid);
        client = clientDao.selectById(client);
	    return client;
		// TODO Auto-generated method stub
		
	}

 
	@Override
	public List<Customer> selectAll(){
		
		List<Customer>client = clientDao.selectAll();
        System.out.println(client.size());
	 
		return client;
		
	}
	
 
	
	@Override
	public List<Customer> likeSelectById(String Cid){
		Client client = new Client();
		client.setId(Cid);
		List<Customer>clients = clientDao.likeSelectById(client);
		return clients;
	}
 
	@Override
	public List<Customer> likeSelectByname(String cname) {
		// TODO Auto-generated method stub
		Client client = new Client();
		client.setName(cname);
		List<Customer>clients = clientDao.likeSelectByName(client);
		return clients;
	}
	
	@Override
	public void deleteClient(String cid) {
		// TODO Auto-generated method stub
		clientDao.deleteClient(cid,0);
	}
	
 
	@Override
	public void clientAdd(Object obj) {
		// TODO Auto-generated method stub
		Client client = (Client)obj;
		clientDao.insertSelective(client);
	}
	
	@Override
	public void updateClient(Object obj) {
		// TODO Auto-generated method stub
		Client client = (Client)obj;
		clientDao.updateByPrimaryKey(client);
	}

    @Resource
	private BorderMapper borderDao;
	@Override
	public List<Border> selcetBorder(String id, int i) {
		// TODO Auto-generated method stub
		List<Border>list = borderDao.selectBorder(id,i);
		return list;
	}


	@Override
	public List<Border> slectAlBorder() {
		// TODO Auto-generated method stub
		List<Border>list = borderDao.selectAll();
		return list;
	} 
	
	
}

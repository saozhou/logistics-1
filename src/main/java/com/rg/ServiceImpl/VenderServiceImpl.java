package com.rg.ServiceImpl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.rg.Domain.Client;
import com.rg.Domain.Customer;
import com.rg.Domain.Vender;
import com.rg.IDao.VenderMapper;
import com.rg.Service.ClientService;

/**
 * 
 * @author Zhou
 *厂家serviceImpl;
 */
@Service("venderService")
public class VenderServiceImpl extends ClientService {

	@Resource
	private VenderMapper venderDao;

	@Override
	public Vender searchById(String cid) {
		// TODO Auto-generated method stub
		Vender vender = venderDao.selectById(cid);
		return vender;
	}

	
	
	@Override
	public List<Customer> selectAll() {
		// TODO Auto-generated method stub
        List<Customer>list = venderDao.selectAll();
		 
		return  list;
	}



	@Override
	public List<Customer> likeSelectById(String cid) {
		// TODO Auto-generated method stub
		List<Customer>list = venderDao.likeSelectById(cid);
		System.out.println(cid);
		return list;
	}



	@Override
	public List<Customer> likeSelectByname(String name) {
		// TODO Auto-generated method stub
		 List<Customer>list = venderDao.likeSelectByName(name);
		 return list;
	}



	@Override
	public void deleteClient(String id) {
		// TODO Auto-generated method stub
		 
		venderDao.deleteClient(id,0);
	 
	}



	@Override
	public void updateClient(Object obj) {
		// TODO Auto-generated method stub
		Vender vender = (Vender)obj;
		venderDao.updateByPrimaryKey(vender);
		
		 
	}



	@Override
	public void clientAdd(Object obj) {
		// TODO Auto-generated metho d stub
		Vender vender =(Vender)obj;
		 
		venderDao.insert(vender);  
	}

	
}

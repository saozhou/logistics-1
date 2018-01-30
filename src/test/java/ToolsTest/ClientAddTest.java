package ToolsTest;

import static org.junit.Assert.*;

import javax.annotation.Resource;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.rg.Domain.Client;
import com.rg.ServiceImpl.ClientServiceImpl;

/**
 * clientAdd测试类
 */
public class ClientAddTest {

	@Resource
	private ClientServiceImpl clientService = new ClientServiceImpl();
	
	@Before
	public void setUp() throws Exception {
	  System.out.println("测试开始");
	}
	

	@Test
	public void test() {
		 Client client =new  Client();
		 
		 client.setTnumber("300195846");
		 clientService.clientAdd(client);
	}
	
	@After
	public void say(){
		System.out.println("测试结束");
	}

}

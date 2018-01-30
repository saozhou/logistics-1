package com.rg.ServiceImpl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.rg.Domain.Fassets;
import com.rg.Domain.Fchange;
import com.rg.IDao.FassetsMapper;
import com.rg.IDao.FchangeMapper;
import com.rg.Service.FixedService;

/**
 * 固定资产ServiceImpl
 * @author Zhou
 *
 */
@Service("fixedService")
public class FixedServiceImpl implements FixedService {

	@Resource
	private FassetsMapper fassetsDao;
	@Resource
	private FchangeMapper fchangeDao;
	/**
	 * 根据资产Id查询资产
	 */
	@Override
	public Fassets searchById(String fcode) {
		// TODO Auto-generated method stub
		Fassets fasset = fassetsDao.selectByPrimaryKey(fcode);
		return fasset;
	}

	/**
	 * 向数据库添加资产
	 */
	@Override
	public void fixedAdd(Fassets fassets) {
		// TODO Auto-generated method stub
		fassetsDao.insert(fassets);
	}

	/**
	 * 删除资产，即将资产的状态改为不可见，同时要将记录添加到Fchange固定资产变动
	 */
	@Override
	public void deleteFixed(Fassets fassets) {
		// TODO Auto-generated method stub
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");//设置日期格式
		String time = df.format(new Date()); 
		fassetsDao.setFixedUs(fassets.getFcode(),"0");
		Fchange fchange = new Fchange();
        fchange.setCompany(fassets.getCampany());
        fchange.setCway("损坏");
        fchange.setFcode(fassets.getFcode());
        fchange.setIsapprove("0");
        fchange.setPrice(fassets.getPrice());
        fchange.setTime(time);
        fchangeDao.insert(fchange);
	 }

	@Override
	public List<Fassets> selectAll() {
		// TODO Auto-generated method stub
		List<Fassets> fassets = fassetsDao.selectAll();
		return fassets;
	}

	@Override
	public List<Fassets> likeSelectById(String id) {
		// TODO Auto-generated method stub
		List<Fassets> fassets = fassetsDao.likeSelectById(id);
		return fassets;
	}

	@Override
	public List<Fassets> likeSelectByname(String name) {
		// TODO Auto-generated method stub
		List<Fassets> fassets = fassetsDao.likeSelectByname(name);
		return fassets;
	}

	@Override
	public void fixedChange(Fassets fassets) {
		// TODO Auto-generated method stub
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");//设置日期格式
		String time = df.format(new Date()); 
		fassetsDao.updateByPrimaryKeySelective(fassets);
		Fchange fchange = new Fchange();
        fchange.setCompany(fassets.getCampany());
        fchange.setCway("信息修改");
        fchange.setFcode(fassets.getFcode());
        fchange.setIsapprove("0");
        fchange.setPrice(fassets.getPrice());
        fchange.setTime(time);
        fchangeDao.insert(fchange);
	}

	 
	 
}

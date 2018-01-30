package com.rg.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.rg.Domain.Fassets;

/**
 * 
 * @author Zhou
 *固定资产Service
 */
@Service("fixedService")
public interface FixedService {

	Fassets searchById(String fcode);

	void fixedAdd(Fassets fassets);

	void deleteFixed(Fassets fassets);

	List<Fassets> selectAll();

	List<Fassets> likeSelectById(String id);

	List<Fassets> likeSelectByname(String name);

	void fixedChange(Fassets fassets);

}

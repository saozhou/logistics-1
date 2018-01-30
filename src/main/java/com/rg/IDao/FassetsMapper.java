package com.rg.IDao;

import java.util.List;

import com.rg.Domain.Fassets;

public interface FassetsMapper {
    int deleteByPrimaryKey(String fcode);

    int insert(Fassets record);

    int insertSelective(Fassets record);

    Fassets selectByPrimaryKey(String fcode);

    int updateByPrimaryKeySelective(Fassets record);

    int updateByPrimaryKey(Fassets record);

	void setFixedUs(String string2, String string);

	List<Fassets> selectAll();

	List<Fassets> likeSelectById(String id);

	List<Fassets> likeSelectByname(String name);
}
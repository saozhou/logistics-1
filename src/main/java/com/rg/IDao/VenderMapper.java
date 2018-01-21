package com.rg.IDao;

import com.rg.Domain.Vender;

public interface VenderMapper {
    int insert(Vender record);

    int insertSelective(Vender record);
}
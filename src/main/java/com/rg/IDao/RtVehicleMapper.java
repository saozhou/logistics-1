package com.rg.IDao;

import com.rg.Domain.RtVehicle;

public interface RtVehicleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RtVehicle record);

    int insertSelective(RtVehicle record);

    RtVehicle selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RtVehicle record);

    int updateByPrimaryKey(RtVehicle record);
}
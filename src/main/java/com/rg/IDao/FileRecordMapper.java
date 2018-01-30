package com.rg.IDao;

import java.util.List;

import com.rg.Domain.FileRecord;

public interface FileRecordMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(FileRecord record);

    int insertSelective(FileRecord record);

    int updateByPrimaryKeySelective(FileRecord record);

    int updateByPrimaryKey(FileRecord record);

	FileRecord selectByPrimaryKey(String fcode);

	void setFileRecordUs(String string, String string2);

	List<FileRecord> likeSelectById(String fcode);

	List<FileRecord> likeSelectByName(String fname);

	List<FileRecord> selectAll();

	List<FileRecord> selectByDay(String startDay, String endDay);
}
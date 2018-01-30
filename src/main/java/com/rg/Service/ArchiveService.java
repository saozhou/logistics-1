package com.rg.Service;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.rg.Domain.FileRecord;

/**
 * 
 * @author Zhou
 *电子存档Service
 *查询存档
 *添加存档
 *删除存档
 *修改存档
 */
public interface ArchiveService {

	FileRecord getFileRecordById(String fcode);

	void addFileRecord(HttpServletRequest request, HttpServletResponse response, String allPath, String fileName);

	void deleteFileRecord(Map<String, String> map);

	void changeFileRecord(HttpServletRequest request, HttpServletResponse response, String allPath, String fileName);

	List<FileRecord> likeSelectById(String string);

	List<FileRecord> likeSelectByName(String string);

	List<FileRecord> selectAll();

	List<FileRecord> selectByDay(String string, String string2);

	void downLoadFile(String fcode, HttpServletResponse response) throws FileNotFoundException, IOException;

}

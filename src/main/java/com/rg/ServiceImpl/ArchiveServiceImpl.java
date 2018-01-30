package com.rg.ServiceImpl;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Service;

import com.rg.Domain.FileRecord;
import com.rg.IDao.FileRecordMapper;
import com.rg.Service.ArchiveService;

@Service("archiveService")
public class ArchiveServiceImpl implements ArchiveService {

	@Resource
	private FileRecordMapper fileRecordDao;
	@Override
	public FileRecord getFileRecordById(String fcode) {
		// TODO Auto-generated method stub
		FileRecord record = fileRecordDao.selectByPrimaryKey(fcode);
		return record;
	}
	@Override
	public void addFileRecord(HttpServletRequest request, HttpServletResponse response, String allPath,
			String fileName) {
		// TODO Auto-generated method stub
		 SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");//设置日期格式
		 String time = df.format(new Date());  
		 FileRecord fileRecord = new FileRecord();
		 fileRecord.setFcode(request.getParameter("fcode"));
		 fileRecord.setFname(fileName);
		 fileRecord.setFtype(request.getParameter("ftype"));
		 fileRecord.setIseffective("1");
		 fileRecord.setFurl(allPath);
		 fileRecord.setUday(time);
		 fileRecordDao.insertSelective(fileRecord);
		
	}
	@Override
	public void deleteFileRecord(Map<String, String> map) {
		// TODO Auto-generated method stub
		fileRecordDao.setFileRecordUs(map.get("fcode"),"0");
	}
	@Override
	public void changeFileRecord(HttpServletRequest request, HttpServletResponse response, String allPath,
			String fileName) {
		// TODO Auto-generated method stub
		 SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");//设置日期格式
		 String time = df.format(new Date());  
		 FileRecord fileRecord = new FileRecord();
		 fileRecord.setFcode(request.getParameter("fcode"));
		 fileRecord.setFname(fileName);
		 fileRecord.setFtype(request.getParameter("ftype"));
		 fileRecord.setIseffective("1");
		 fileRecord.setFurl(allPath);
		 fileRecord.setUday(time);
		 fileRecordDao.updateByPrimaryKeySelective(fileRecord);
	}
	@Override
	public List<FileRecord> likeSelectById(String fcode) {
		// TODO Auto-generated method stub
		List<FileRecord> list = fileRecordDao.likeSelectById(fcode);
		return list;
	}
	@Override
	public List<FileRecord> likeSelectByName(String fname) {
		// TODO Auto-generated method stub
		List<FileRecord>list = fileRecordDao.likeSelectByName(fname);
		return list;
	}
	@Override
	public List<FileRecord> selectAll() {
		// TODO Auto-generated method stub
		List<FileRecord>list = fileRecordDao.selectAll();
		return list;
	}
	@Override
	public List<FileRecord> selectByDay(String startDay, String endDay) {
		// TODO Auto-generated method stub
		List<FileRecord>list = fileRecordDao.selectByDay(startDay,endDay);
		return list;
	}
	@Override
	public void downLoadFile(String fcode, HttpServletResponse response) throws IOException {
		// TODO Auto-generated method stub
		   
				  FileRecord fileRecord =fileRecordDao.selectByPrimaryKey(fcode);
				  String guidFilename = fileRecord.getFurl();
				  
					
					
	        File storeDirectory = new File(guidFilename);
	       
	        //构建输入流
	        InputStream in = new FileInputStream(storeDirectory);

	        //用响应对象的输出流输出：下载的方式
	        String oldFileName = guidFilename.substring(guidFilename.lastIndexOf("\\")+1,guidFilename.length());
	        response.setHeader("Content-Disposition", "attachment;filename="+URLEncoder.encode(oldFileName,"UTF-8"));//不适用火狐
	        response.setContentType("application/octet-stream");
	        OutputStream out = response.getOutputStream();

	        int len = -1;
	        byte buf[] = new byte[1024];
	        while((len=in.read(buf))!=-1){
	            out.write(buf, 0, len);
	        }
	        in.close();
	}

	
}

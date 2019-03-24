package nuc.action;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.List;

import nuc.bean.FileDao;
import nuc.bean.FileItem;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class DownloadAction extends ActionSupport {
	private FileDao fileDao=new FileDao();
	public String getDownloadList(){
		List<FileItem> fileList=fileDao.getDownloadList();
		ActionContext.getContext().put("fileList", fileList);
		
		return "listOK";
	}
	public String downloadMethod() throws FileNotFoundException, UnsupportedEncodingException{
		FileItem fileItem=fileDao.getFileById(fileId);
		contentType=fileItem.getContentType();
		contentLength=fileItem.getContentLength();
		fileName=URLEncoder.encode(fileItem.getFileName(),"utf-8");
		targetFile=new FileInputStream(fileItem.getLocationPath());
		return "downloadOK";
	}
	private String fileId;
	public FileDao getFileDao() {
		return fileDao;
	}
	public void setFileDao(FileDao fileDao) {
		this.fileDao = fileDao;
	}
	public String getFileId() {
		return fileId;
	}
	public void setFileId(String fileId) {
		this.fileId = fileId;
	}
	public String getContentType() {
		return contentType;
	}
	public void setContentType(String contentType) {
		this.contentType = contentType;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getContentLength() {
		return contentLength;
	}
	public void setContentLength(String contentLength) {
		this.contentLength = contentLength;
	}
	public InputStream getTargetFile() {
		return targetFile;
	}
	public void setTargetFile(InputStream targetFile) {
		this.targetFile = targetFile;
	}
	private String contentType;
	private String fileName;
	private String contentLength;
	private InputStream targetFile;
}

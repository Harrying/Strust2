package com.lxb.eneity;
/**
 * 文件下载的实体类
 * @author bing
 *
 */
public class FileItem {
	private String fileName;// 文件名
	private String filePath;//  文件保存路径
	private String contentType;// 文档类型
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getFilePath() {
		return filePath;
	}
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
	public String getContentType() {
		return contentType;
	}
	public void setContentType(String contentType) {
		this.contentType = contentType;
	}
	
}

package com.lxb.eneity;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

/**
 * 未下载提供实体类
 * @author bing
 *
 */
public class DownLoad {
	// 下载文件的资源路径
	private String inputPath;
	// 下载文件的文件资源
	private String contentType;
	// 下载文件的文件名
	private String downFileName;
	public String getInputPath() {
		return inputPath;
	}
	public void setInputPath(String inputPath) throws UnsupportedEncodingException {
		this.inputPath = new String(inputPath.getBytes("iso-8859-1"),"utf-8");
	}
	public String getContentType() {
		return contentType;
	}
	public void setContentType(String contentType) {
		this.contentType = contentType;
	}
	@SuppressWarnings("deprecation")
	public String getDownFileName() {
		return URLEncoder.encode(downFileName);
	}
	public void setDownFileName(String downFileName) throws UnsupportedEncodingException {
		this.downFileName = new String(downFileName.getBytes("iso-8859-1"),"utf-8");
	}
	
}

package com.lxb.eneity;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

/**
 * δ�����ṩʵ����
 * @author bing
 *
 */
public class DownLoad {
	// �����ļ�����Դ·��
	private String inputPath;
	// �����ļ����ļ���Դ
	private String contentType;
	// �����ļ����ļ���
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

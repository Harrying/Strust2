package com.action;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import com.opensymphony.xwork2.ActionSupport;


@SuppressWarnings("serial")
public class FileDownAction extends ActionSupport {
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

		public String getDownFileName() throws UnsupportedEncodingException {
			return new String(downFileName.getBytes("iso-8859-1"),"utf-8");
		}
		public void setDownFileName(String downFileName) throws UnsupportedEncodingException {
			this.downFileName =URLEncoder.encode(downFileName, "utf-8");
		}
	
	public InputStream getTargetFile() throws Exception{
		//System.out.println(inputPath);
		InputStream is = new FileInputStream(inputPath);
		System.out.println(inputPath+"shfjdsk");
		return is;
	}
}

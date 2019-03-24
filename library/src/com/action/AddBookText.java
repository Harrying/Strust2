package com.action;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.lxb.eneity.FileItem;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class AddBookText extends ActionSupport {


	// ��װ�ļ��ı����������������
	private String title;
	// ��װ�ϴ��ļ��������
	private List<File> upload;
	// ��װ�ϴ��ļ���������
	private List<String> uploadContentType;
	// ��װ�ϴ��ļ�������
	private List<String> uploadFileName;
	// ��������ע������
	private String savePath;
	

	private List<FileItem> fileItems = new ArrayList<FileItem>();

	public List<FileItem> getFileItems() {
		return fileItems;
	}
	public void setFileItems(List<FileItem> fileItems) {
		this.fileItems = fileItems;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public List<File> getUpload() {
		return upload;
	}
	public void setUpload(List<File> upload) {
		this.upload = upload;
	}
	public List<String> getUploadContentType() {
		return uploadContentType;
	}
	public void setUploadContentType(List<String> uploadContentType) {
		this.uploadContentType = uploadContentType;
	}
	public List<String> getUploadFileName() {
		return uploadFileName;
	}
	public void setUploadFileName(List<String> uploadFileName) {
		this.uploadFileName = uploadFileName;
	}
	public String getSavePath() {
		return savePath;
	}
	public void setSavePath(String savePath) {
		this.savePath = savePath;
	}

	/**
	 * ����ı��ļ��ķ���
	 */
	@SuppressWarnings("resource")
	public String addBookText() throws Exception {
		System.out.println(upload);
		System.out.println(uploadFileName);
		System.out.println(uploadContentType);
		FileItem fileItem;
		for(int i = 0; i<upload.size(); i++){
			// ����һ���ϴ��ļ����ϴ���
			FileInputStream fis = new FileInputStream(upload.get(i));
			String realpath = new String(savePath+"/"+UUID.randomUUID()+"_"+uploadFileName.get(i));
			System.out.println(uploadFileName.get(i));
			// ����һ���ϴ��ļ����ļ������
			FileOutputStream fos = new FileOutputStream(realpath);
			byte[] buffer = new byte[1024];
			int len = 0;
			while((len = fis.read(buffer)) > 0){
				fos.write(buffer, 0 , len);
			}
			/*uploadFileName.set(i, realpath);*/
			fileItem = new FileItem();
			fileItem.setFileName(uploadFileName.get(i));
			System.out.println(fileItem.getFileName());
			fileItem.setFilePath(realpath);
			System.out.println(realpath);
			fileItem.setContentType(uploadContentType.get(i));
			fileItems.add(fileItem);
		}
		ActionContext.getContext().getSession().put("fileItems", fileItems);
		return SUCCESS;
	}

}

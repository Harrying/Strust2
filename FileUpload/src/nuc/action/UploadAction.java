package nuc.action;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.UUID;

import com.opensymphony.xwork2.ActionSupport;

public class UploadAction extends ActionSupport {
	private String title;
	private File[] upload;
	public File[] getUpload() {
		return upload;
	}
	public void setUpload(File[] upload) {
		this.upload = upload;
	}
	public String[] getUploadContentType() {
		return uploadContentType;
	}
	public void setUploadContentType(String[] uploadContentType) {
		this.uploadContentType = uploadContentType;
	}
	public String[] getUploadFileName() {
		return uploadFileName;
	}
	public void setUploadFileName(String[] uploadFileName) {
		this.uploadFileName = uploadFileName;
	}
	private String[] uploadContentType;
	private String[] uploadFileName;
	private String savePath;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getSavePath() {
		return savePath;
	}
	public void setSavePath(String savePath) {
		this.savePath = savePath;
	}
	public String uploadMethod() throws IOException{
		File[] files=getUpload();
		for(int i=0;i<files.length;i++){
		FileInputStream fis=null;
		FileOutputStream fos=null;
		try {
			 fis=new FileInputStream(upload[i]);
			 String newFileName=UUID.randomUUID()+"_"+uploadFileName[i];
			 File distFile=new File(savePath+"/"+newFileName);
			 fos=new FileOutputStream(distFile);
		     
			 byte[] buffer=new byte[1024];
		     int len=0;
		     while((len=fis.read(buffer))>0){
		    	 fos.write(buffer, 0, len);
		     }
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			if(fos!=null){
				try {
					fos.close();
					fis.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		}
		
		
		
	}return "uploadOK";
	
	}
	
}

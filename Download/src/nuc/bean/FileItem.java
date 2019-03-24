package nuc.bean;

public class FileItem {
	private  String fileId;
	private String fileName;
	private String contentType;
	private String contentLength;
	private String locationPath;
	public String getFileId() {
		return fileId;
	}
	public void setFileId(String fileId) {
		this.fileId = fileId;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getContentType() {
		return contentType;
	}
	public void setContentType(String contentType) {
		this.contentType = contentType;
	}
	public String getContentLength() {
		return contentLength;
	}
	public void setContentLength(String contentLength) {
		this.contentLength = contentLength;
	}
	public String getLocationPath() {
		return locationPath;
	}
	public void setLocationPath(String locationPath) {
		this.locationPath = locationPath;
	}
	public FileItem(String fileId, String fileName, String contentType,
			String contentLength, String locationPath) {
		super();
		this.fileId = fileId;
		this.fileName = fileName;
		this.contentType = contentType;
		this.contentLength = contentLength;
		this.locationPath = locationPath;
	}
	public FileItem(){}
	
	
	

}

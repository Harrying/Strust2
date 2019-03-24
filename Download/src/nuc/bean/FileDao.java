package nuc.bean;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FileDao {
	private Map<String,FileItem> files=new HashMap();

	public FileDao(){
		String fileId="00001";
		files.put(fileId, new FileItem(fileId,"≤‚ ‘.doc","application/msword","24064","f:/≤‚ ‘.doc"));
		fileId="00002";
		files.put(fileId, new FileItem(fileId,"da.jpg","img/pjpeg","36877","f:/da.jpg"));
	}
	public List<FileItem> getDownloadList(){
		return new ArrayList(files.values());
	}
	public FileItem getFileById(String fileId){
		return files.get(fileId);
	}
}

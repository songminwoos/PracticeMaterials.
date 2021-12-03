package p06.FileManage;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileManagementEx {

	public static void main(String[] args) throws URISyntaxException, IOException {
		File dir = new File("C:/tmp/dir");
		File file1 = new File("c:/tmp/file1.txt");
		File file2 = new File("C:/tmp/file2.txt");
		File file3 = new File(new URI("file:///C:/tmp/file3.txt"));

		if (dir.exists() == false) {
			dir.mkdir();
		}

		if (file1.exists() == false) {
			file1.createNewFile();
		}
		
		if (file2.exists() == false) {
			file2.createNewFile();
		}
		
		if (file3.exists() == false) {
			file3.createNewFile();
		}
		
		File tmp = new File("C:/tmp");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd    a    HH:mm");
		File[] contents = tmp.listFiles();
		
		System.out.println("날짜			시간			형태			크기			이름");
		System.out.println("---------------------------------------------------------");
		for (File file : contents) {
			System.out.println(sdf.format(new Date(file.lastModified())));
			if (file.isDirectory()) {
				System.out.println("\t<DIR>\t\t " + file.getName());
			} else {
				System.out.println("\t\t\t " + file.length() + "\t" + file.getName());
			}
		}
		
	}

}

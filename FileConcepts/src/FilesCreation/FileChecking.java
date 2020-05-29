package FilesCreation;

import java.io.File;

public class FileChecking {

	public static void main(String[] args) {
		
		

		
		File file=new File("D:\\Study\\Materials_Exception_Java");
		File[] filesnames=file.listFiles();
		
		System.out.println(filesnames.length);
	for (int i = 0; i < filesnames.length; i++) {
		
		String filename=filesnames[i].getName();
		System.out.println(filename);
		
	}
	}

}

package mypack;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class JavaIoPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileOutputStream fo = new FileOutputStream("C:\\TextFile\\file2.txt");
			byte[] arr = { 65, 66, 67, 68, 69 };
			fo.write(arr);
			System.out.println("success...");    
			FileInputStream fs=new FileInputStream("C:\\TextFile\\file1.txt");
			int i=0;
			while((i=fs.read())!=-1) {
				System.out.print((char)i);
			}
			
			fo.close();
			fs.close();
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}

package mypack;

import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * <h2> JavaIoPractice Class</h2>
 * <p>
 * Process for Displaying JavaIoPractice
 * </p>
 * 
 * @author User
 *
 */
public class JavaIoPractice {

	/**
	 * <h2> main</h2>
	 * <p>
	 * 
	 * </p>
	 *
	 * @param args
	 * @return void
	 */
	public static void main(String[] args) {
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

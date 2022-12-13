package mypack;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * <h2> JavaException Class</h2>
 * <p>
 * Process for Displaying JavaException
 * </p>
 * 
 * @author User
 *
 */
public class JavaException {

	/**
	 * <h2> main</h2>
	 * <p>
	 * 
	 * </p>
	 *
	 * @param args
	 * @throws IOException
	 * @return void
	 */
	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		
		try {
			int arr[] = new int[5];
			arr[10] = 30;
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			int result=5/0;
			System.out.println(result);
		}catch(ArithmeticException e) {
			System.out.println(e);
		}
		try {
			FileInputStream fs=new FileInputStream("C:\\TextFile\\file3.txt");
			int i=fs.read();
			System.out.println(i);
			
		}catch(FileNotFoundException e) {
			System.out.println(e);
		}
		System.out.println("Hello");
	}

}

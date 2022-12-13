package mypack;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class JavaException {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
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

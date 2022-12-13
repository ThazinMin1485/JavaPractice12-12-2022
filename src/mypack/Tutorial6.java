package mypack;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Date;

/**
 * <h2> Tutorial6 Class</h2>
 * <p>
 * Process for Displaying Tutorial6
 * </p>
 * 
 * @author User
 *
 */
public class Tutorial6 {

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
			File file = new File("C:\\TextFile\\file2.txt");
			Date d = new Date(file.lastModified());
			System.out.println("last modified time of a file" + d);
			FileWriter fw = new FileWriter("C:\\TextFile\\file1.txt");
			fw.write(" Welcome");
			fw.write("\n Hello");
			fw.write("\n Thi is new content");
			fw.write("\n Nice to meet you");
			System.out.println("Success");
			fw.close();
			
		} catch (Exception e) {
			System.out.println(e);
		}
		try {
			FileReader fr=new FileReader("C:\\\\TextFile\\\\file1.txt");
			BufferedReader reader=new BufferedReader(fr);
			String line=null;
			int i=0;
			while((line=reader.readLine())!=null && i<3) {
				System.out.println(line);
				i++;
			}
			reader.close();
		}catch(Exception e) {
				System.out.println(e);
			}
		}

	}



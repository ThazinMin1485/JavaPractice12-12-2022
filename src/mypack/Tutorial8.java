package mypack;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Iterator;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 * <h2> Tutorial8 Class</h2>
 * <p>
 * Process for Displaying Tutorial8
 * </p>
 * 
 * @author User
 *
 */
public class Tutorial8 {
	/**
	 * <h2> main</h2>
	 * <p>
	 * 
	 * </p>
	 *
	 * @param args
	 * @return void
	 */
	@SuppressWarnings("deprecation")
	public static void main(String args[]) {
		try {
			File file = new File("C:\\Users\\User\\Documents\\test1.xlsx");
			FileInputStream fis = new FileInputStream(file);
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			XSSFSheet sheet = wb.getSheetAt(0);
			Iterator<Row> itr = sheet.iterator();
			while (itr.hasNext()) {
				Row row = itr.next();
				Iterator<Cell> cellitr = row.cellIterator();
				while (cellitr.hasNext()) {
					Cell cell = cellitr.next();
					switch (cell.getCellType()) {
					case Cell.CELL_TYPE_STRING:
						System.out.print(cell.getStringCellValue() + "\t\t");
						break;
					case Cell.CELL_TYPE_BOOLEAN:
						System.out.print(cell.getBooleanCellValue() + "\t\t");
						break;
					case Cell.CELL_TYPE_NUMERIC:
						System.out.print(cell.getNumericCellValue() + "\t\t");
						break;
					default:
					}
				}
				System.out.println();
			}
			wb.close();
			fis.close();

		} catch (Exception e) {
			System.out.println(e);
		}
		try {
			File xsfile = new File("C:\\Users\\User\\Documents\\test3.xlsx");
			XSSFWorkbook xf = new XSSFWorkbook();
			XSSFSheet sh = xf.createSheet("Person Record");
			XSSFRow header = sh.createRow(0);
			header.createCell(0).setCellValue("Name");
			header.createCell(1).setCellValue("Age");
			header.createCell(2).setCellValue("Township");
			XSSFRow row1 = sh.createRow(1);
			row1.createCell(0).setCellValue("Sam");
			row1.createCell(1).setCellValue(35);
			row1.createCell(2).setCellValue("California");
			XSSFRow row2 = sh.createRow(2);
			row2.createCell(0).setCellValue("Dean");
			row2.createCell(1).setCellValue(38);
			row2.createCell(2).setCellValue("California");
			FileOutputStream fos = new FileOutputStream(xsfile);
			xf.write(fos);
			fos.close();
			xf.close();
			System.out.println("Excel file has been created successfully");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}

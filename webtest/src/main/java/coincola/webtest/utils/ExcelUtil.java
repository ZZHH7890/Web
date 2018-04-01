package coincola.webtest.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 * @author 张大爷
 * @time 2018年4月1日 下午8:11:03
 * @mail 767580776@qq.com
 * @description Just a joke
 */

public class ExcelUtil {
	// 向表格单元格中写入inviteUser
	public static void setInviteUserToCell(String excelPath, String excelName, String excelSheet, String data) {
		File file = new File(excelPath + "\\" + excelName);
		try {
			FileInputStream inputStream = new FileInputStream(file);
			Workbook workbook = new XSSFWorkbook(inputStream);
			Sheet sheet = workbook.getSheet(excelSheet);
			// 获取表格表头信息
			Row headerrow = sheet.getRow(0);
			String headerrowfields[] = new String[headerrow.getLastCellNum()];
			for (int k = 0; k < headerrow.getLastCellNum(); k++) {
				headerrowfields[k] = headerrow.getCell(k).getStringCellValue();
			}
			// 插入数据
			int rowcount = sheet.getLastRowNum() + 1;
			Row row = sheet.getRow(rowcount);
			if (row == null) {
				row = sheet.createRow(rowcount);
			}
			Cell cell = row.createCell(0);
			cell.setCellValue(data);
			FileOutputStream outputStream = new FileOutputStream(file);
			workbook.write(outputStream);
			outputStream.close();
			inputStream.close();
			workbook.close();
		} catch (Exception e) {
			String failString = "数据写入表格失败！！";
			System.out.println(failString);
			e.printStackTrace();
		}
	}

}

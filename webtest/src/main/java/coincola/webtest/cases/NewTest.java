package coincola.webtest.cases;

import org.testng.annotations.Test;

import coincola.webtest.utils.ExcelUtil;
import coincola.webtest.utils.RandomUtils;

import org.testng.annotations.BeforeClass;

import java.util.Random;

import org.testng.annotations.AfterClass;

public class NewTest {
	@Test
	public void test() {
		String excelPath = "C:\\Users\\Administrator\\eclipse-workspace\\Web\\webtest\\TestData";
		String excelName = "TestData.xlsx";
		String excelSheet = "phone";
		String data = RandomUtils.getPhone();
		System.out.println(data);
		ExcelUtil.setInviteUserToCell(excelPath, excelName, excelSheet, data);
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("start");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("end");
	}

}

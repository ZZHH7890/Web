package coincola.webtest.utils;

import java.util.Random;

/**
 * @author 张大爷
 * @time 2018年4月1日 下午4:36:14
 * @mail 767580776@qq.com
 * @description Just a joke
 */

public class RandomUtils {
	/**
	 * 返回手机号码
	 */
	private static String[] telFirst = "134,135,136,137,138,139,150,151,152,157,158,159,182,183,184,187,188,147,178,130,131,132,155,156,185,186,145,175,176,133,153,181,180,189,177,173,170,171,198,199,166,146,148"
			.split(",");

	// 在0到m-1之间生成一个随机数
	public static int getRandomNum(int m) {
		Random random = new Random();
		int n = random.nextInt(m);
		return n;
	}

	// 在start到end之间生成一个随机数
	public static int getNum(int start, int end) {
		int n = (int) (Math.random() * (end - start + 1) + start);
		return n;
	}

	// 生成号码方法一
	public static String getTel() {
		int index = getNum(0, telFirst.length - 1);
		String first = telFirst[index];
		String second = String.valueOf(getNum(1, 888) + 10000).substring(1);
		String third = String.valueOf(getNum(1, 9100) + 10000).substring(1);
		return first + second + third;
	}

	// 生成号码方法二
	public static String getPhone() {
		Random random = new Random();
		int index = random.nextInt(telFirst.length);
		String first = telFirst[index];
		String second ="";
		for(int i=0;i<8;i++) {
			second += random.nextInt(10); 
		}
		return first + second;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i <10; i++) {
			System.out.println(getPhone());
		}
	}

}

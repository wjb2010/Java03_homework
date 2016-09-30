import java.awt.List;
import java.util.Random;

public class homework {

	public static void main(String[] args) {

		// 第一题
		double a = 1000000000;

		for (int i = 0; i < 500; i++) {
			a = a / 2;
			if (a <= 1) {
				System.out.println(i);
				System.out.println(a);
				break;
			}
		}

		// 第二题
		Random ran1 = new Random();
		int max = 0;
		for (int i = 1; i < 21; i++) {

			int num1 = ran1.nextInt(100 - 10 + 1) + 10;
			if (num1 > max) {
				max = num1;
			}

			System.out.println("第" + i + "个随机数:" + num1);

		}
		System.out.println("最大的数是:" + max);

		// 第三题
		for (int i = 100; i < 1000; i++) {
			int a3 = i / 100;
			int b3 = (i - a3 * 100) / 10;
			int c3 = i % 10;
			if (a3 * a3 * a3 + b3 * b3 * b3 + c3 * c3 * c3 == i) {
				System.out.println("水仙花数是:" + i);
			}
		}

		// 第四题
		Random ran2 = new Random();
		int max2 = 50;
		for (int i = 1; i < 11; i++) {

			int num2 = ran2.nextInt(50 - 2 + 1) + 2;
			if (num2 < max2) {
				max2 = num2;
			}

			System.out.println("第" + i + "个随机数:" + num2);

		}
		System.out.println("最小的数是:" + max2);

		// 第五题
		int count = 0;
		for (int i = 100; i < 1000; i++) {
			int a5 = i / 100;
			int b5 = (i - a5 * 100) / 10;
			int c5 = i % 10;

			if ((i + c5 * 100 + b5 * 10 + a5) == 1333) {
				System.out.println("abc是:" + a5 + b5 + c5);
				count++;
			}

		}
		System.out.println("总数是:" + count);

		//
		for (int i = 0; i < 5; i++) {

		}

	}

}

package part1.test;

import java.util.Scanner;

public class GugudanScanner {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("����� ���� �Է��ϼ���.");
		int dan = scanner.nextInt(); // 0��� ��ĳ�� �Է°� �Ҵ�
		
		if (dan>1) {
			for (int i = 0; i < 10; i++) {
				System.out.println(dan+"*"+i+"*"+dan*i);//""�� �ѷ��θ� ������� ���ͷ� �� �ȴ�.
				
			}
			
		} else {
         System.out.println("1�̻��� �������� �Է��ϼ���");
		}
			
		
		
	}
}

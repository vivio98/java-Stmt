package part1.array;

import java.util.Scanner;

public class ArrayLengthDemo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("3���� ���ڸ� �Է��ϼ���");
		int[] intArr = new int[3]; //���� 3���� �Է¹޵��� ���������Ƿ�...
		int sum = 0;
		for(int i=0; i<intArr.length ;i++){ //��� ����Ʈ �κ� ä���ּ���
			intArr[i] = scanner.nextInt(); // 0��ſ� �Է°� �Ҵ� �κ� �ϼ����ּ���
			
		}
		for(int i=0;i<intArr.length ;i++){
			sum += intArr[i];
		}
		System.out.println("�Է¹��� �迭���� �հ��"+ sum +"�Դϴ�");
	}
	

}

package part1.test;

import java.util.Scanner;

public class BigNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a=0,b=0,c=0;
		System.out.println("A�� ���� �Է��ϼ���" );
		// a ���� �Է¹޴� ����
	a=	scanner.nextInt();
		System.out.println("B�� ���� �Է��ϼ���" );
		// b ���� �Է¹޴� ����
	b = scanner.nextInt();
	System.out.println("C�� ���� �Է��ϼ���" );
		// c ���� �Է¹޴� ����
	c = scanner.nextInt();	
	if(a>b && a>c){ //a �� b ���� ũ�鼭 c���ٵ� ũ�� (������)
			System.out.println("���� ū ���� A ����"+a+"�Դϴ�.");
		}else if(b>a && b>c){
			System.out.println("���� ū ���� B ����"+b+"�Դϴ�.");
		}else{
			System.out.println("���� ū ���� C ����"+c+"�Դϴ�.");
			
		}
	}

}

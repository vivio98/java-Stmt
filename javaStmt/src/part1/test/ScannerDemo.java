package part1.test;

import java.util.Scanner;

public class ScannerDemo {
	public static void main(String[] args) {
		/*
		 ��ĳ�� Ŭ������ ��ü�� scanner �� �����Ͽ���.
		 */
	//	Scanner scanner = new Scanner(System.in);
	//Scanner scanner = new Scanner(System.in);	
    //  Scanner scanner = new Scanner(System.in);
		Scanner scanner = new Scanner(System.in);
	//	Scanner scanner = new Scanner(System.in);
   System.out.println("���ڸ� �Է��� �ּ���");
	int a = scanner.nextInt();
      //  System.out.println(a);	
 	/*
 	 * for ������ �Էµ� ����ŭ�� ���� ���ϴ� ������� �����ϼ���
 	 */
	int sum = 0;// for ���� ������� ����ϴ� ������ �ٱ��ʿ� ���� �� �ʱ�ȭ
	for(int i=1;i<=a;i++){
		System.out.println(i+"\t");
		sum =+ i;
	}
	System.out.println(sum);// ��°��� for���� �� �� ������ ���;� �ϹǷ� �ٱ���
			
	}

	}   
	
	




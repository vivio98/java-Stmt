package part1.test;

import java.util.Scanner;

public class ArrayMax {
	public static void main(String[] args) {
		System.out.println("3���� ���ڸ� �Է��ϼ���");
		System.out.println("�Էµ� ���ڵ� �� ���� ū ���� ��ȯ�մϴ�.");
		Scanner scanner = new  Scanner(System.in);
		int[] intArr = new int[3];
		int max = 0;
		
		for(int i=0;i<intArr.length;i++){
			intArr[i] = scanner.nextInt();
			if(intArr[i]>max){
				max = intArr[i];
			}
		System.out.println("�Էµ� ���ڵ� �� ���� ū ����"+max+"�Դϴ�.");
		}
	
		
	}

		
		
		

			}



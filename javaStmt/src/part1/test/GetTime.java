package part1.test;

import java.util.Scanner;

public class GetTime {
	public static void main(String[] args) {
	   Scanner scanner = new Scanner(System.in);
		System.out.println("�ʸ� �Է��ϼ���");
	   
	   int time =scanner.nextInt(); // ��
		int second, minute=0,hour=0;
		
		second = time % 60; // 500�ʸ� 60���� ���� ������ �� 
		minute = (time/60)%60; // %�� ������ ���̰� / �� ���� �����Ѵ�.
		hour = (time/60)/60;
		/*
		 * 500�ʸ� 60���� ���� ���� �ٽ� 60���� ���� �������� ��
		 * �϶� �ð��� ���ϰ� ��µǰԲ��ϼ���
		 */
	System.out.println(hour + "��");
	System.out.println(minute + "��");
	System.out.println(second + "��");
	
		
		
		
	}

}

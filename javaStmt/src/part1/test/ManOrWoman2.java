package part1.test;

import java.util.Scanner;

public class ManOrWoman2 {
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("�ֹι�ȣ�� �Է��ϼ��� (��)123456-4123456");
			String ssn = "",msg="";  // int �� �ʱ�ȭ�� 0, String �ʱ�ȭ�� ""
			ssn = scanner.next();
			/*
			 * int Ÿ���� ���� ���� nextInt()
			 * String Ÿ���� ���� ���� next() �� �����ϼ���.
			 */
			
			char ch = ssn.charAt(7); // ������ �ε��� ���� 0��� ��ġ�ϼ���.
			/*
			 * �������� ���������� �Ǻ��ϴ� �κ��� �������� -���� ������ 4�� �ش��մϴ�.
			 * ��Ʈ�� ���ڿ��� �������� �ε������ �ϴµ�..
			 * 0���� �����մϴ�.
			 * ���� �������� �ε��� 0���� 1�̰�
			 * �ε���1 ���� 2�Դϴ�.
			
			 */
			
		// �����.. ������ ���ϴ� ���� ������ ���� ��� �׽�Ʈ���� ����غ��� ���	
		 System.out.println("ch :"+ch);
			switch (ch) {
		 case '1': case'2': msg = "����"; break;
		 case '3': case'4': msg = "����"; break;
		 case '5': case'6': msg = "�ܱ���"; break;
		 default: msg = "�߸��� ��"; break;
		 }
		/*
		 * ������ºκ��� ���� �߱��� 2�� 4�� ����.. 5�� 6�� �ܱ���.. ������ ���� 
		 * �߸��� �Է°��Դϴ�. ��� ������ּ���.
		 */
	if(ch=='2'||ch=='4'){
		System.out.println("����");
		if(ch=='5'||ch=='6'){
			System.out.println("�ܱ���");
		}
			
	}
		}
		
		
		

}

package part1.test;

import java.util.Scanner;

public class Kaup {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ű�� �Է��ϼ���");
		double height = scanner.nextDouble();
		System.out.println("�����Ը� �Է��ϼ���");
		double weight = scanner.nextDouble();
		/*
		 * �Ʒ����� double Ÿ���� �������
		 * int Ÿ���� ������ �Ҵ��ؾ� �ϹǷ�
		 * ĳ������ �Ͼ����, ���� ��Ŭ������
		 * �����ϴ� �ڵ��ϼ� ������� �ذ��Ѵ�.
		 */
		int idx = (int) ((weight/(height*height))*10000);
		String msg = "";
		if(idx>30){
			msg = "��";
		}else if(idx>24){
			msg = "��ü��";
		}else if(idx>20){
			msg = "����";
		}else if(idx>15){
			msg = "��ü��";
		}else if(idx>13){
			msg = "����";
		}else if(idx>10){
			msg = "�������";
		
			
		}
		System.out.println(msg);
	/*
	 *  idx>24 ... msg = "��ü��"
	 *  idx>20 ... msg = "����"
	 *  idx>15 ... msg = "��ü��"
	 *  idx>13 ... msg = "����"
	 *  idx>10 ... msg = "�������"
	 *  �̵����� �ƴϸ� msg = "�Ҹ���"
	 */
	System.out.println("ī��������[Ű=180.5cm, ������=75.3kg, ī��������=����]");
	}
	

}

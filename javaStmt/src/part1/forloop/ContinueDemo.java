package part1.forloop;

import java.util.Scanner;

/*
 * @0615
 * @author
 * @Stroy : 1 ���� �Է°� ������ ¦���� ���� ���ϴ� ���α׷�
 *          continue ��� ���� ����
 */
public class ContinueDemo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("1���� �ջ��ϰ��� �ϴ� ������ ���� �Է��ϼ���");
		System.out.println("�������� ¦���� �ջ�˴ϴ�.");
		int num=scanner.nextInt(),sum=0;
		for (int i = 0; i <= num; i++) {
			if (i%2==1) { // Ȧ���ΰ��
				continue; // ������ �ʰ� �������� �̵�
			} else { // ¦���� ���
              sum += i;
			}
			
		}
		System.out.println("¦���� �� :"+sum);
	}

}

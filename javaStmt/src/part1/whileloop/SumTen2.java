package part1.whileloop;
public class SumTen2 {
	public static void main(String[] args) {
		/*while �� 1	���� 10���� ��*/
		int num = 0, sum =0; //�ʱ�ȭ => for ���� �ʱⰪ ������ ��ġ
		while (num<11) { // �Ѱ谪 ���� => for���� limit �� ���� ����ġ
			// sum = sum + num; �̰��� ����ϸ� �Ʒ�ó��
			sum += num;
			//num = num +1; �̰��� ����ϸ�
			num ++;// ������ => for���� �����İ� ��ġ
		}
		System.out.println(sum);
		/*do-while ��1���� 10���� �� */
		 int num2 =0, sum2 =0;
		 do{
			 sum += num2;
			 num2++;
		 }while(num2<11);
		 System.out.println(sum2);
		 int sum3 = 0;
		 /*for�� 1���� 10���� ��*/
		 for(int num3 = 0;num3<11;num3++){
			 sum3 += num3;
			 
		 }
			System.out.println(sum3);
		}
	}



package part1.whileloop;
/*
 do ~while ���� while ���� ���� ��ġ�ϳ�
 �ٸ� ���� ó�� �ѹ��� ������ �����ϰ� ���� 
 ������ ���Ѵ�.
 - ����
 do{
 ����;
 }while(����);
 */
public class DoWhileLoop {
	public static void main(String[] args) {
		int count = 1;
		/*do{}while();*/
		do{
			System.out.print(count+"\t");// \t�� ��Ű
			// ln�� line �� ���ڷ� ���ΰ��� ��ɾ�
			// \t �� �̽������� ���ڷ� tap Ű�� �ǹ���
			count++;
			
		}while(count<11);
	}

}

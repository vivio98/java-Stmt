package part1.whileloop;

public class OddEvenSum {
	public static void main(String[] args) {
		int num=1, sum = 0, oddSum=0, evenSum=0; // ���������� �ʱ�ȭ �ʼ� 
		while(num<=10){
			sum += num;
			num++;
		}
		System.out.println(sum);
		
		/*
		 * for ������ ����
		 * sum �� num �� �״�� ������ �ּ���
		 */
		sum = 0; // �ٽ� �ʱ�ȭ ���ִ� �۾��� �ʿ�
		for(num=0;num<=10;num++){
			sum += num;
			
		}
		System.out.println("[2]"+sum);
		/*
		 * Ȧ��,¦�� �� ��
		 */
	 /*Ȧ���� ��*/
		num = 1;
	 while(num<=10){
		 oddSum += num;
		 num += 2;
	 }
	 System.out.println("Ȧ���� ��:"+oddSum);
	 
	
	num =2;
	while(num<=10){
		evenSum += num;
		num += 2;
	
	}
	System.out.println("¦���� �� :"+evenSum);
	/*
	 * for + if ���� ������ �� ��������� Ȧ¦�� ���
	 */
	oddSum = 0;
	evenSum = 0;
	for(num=1;num<=10;num++){
		if(num%2==0){
			evenSum += num;
		}
		if(num%2==1){
			oddSum += num;
		}
	}
	System.out.println("[2] Ȧ���� �� :" + oddSum);
	System.out.println("[2]¦���� ��: " +evenSum  );
	}
}


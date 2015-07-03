package part1.whileloop;
public class SumTen2 {
	public static void main(String[] args) {
		/*while 은 1	부터 10까지 합*/
		int num = 0, sum =0; //초기화 => for 문의 초기값 설정과 일치
		while (num<11) { // 한계값 설정 => for문의 limit 값 설정 과일치
			// sum = sum + num; 이것을 축약하면 아래처럼
			sum += num;
			//num = num +1; 이것을 축약하면
			num ++;// 증감식 => for문은 증감식과 일치
		}
		System.out.println(sum);
		/*do-while 문1부터 10까지 합 */
		 int num2 =0, sum2 =0;
		 do{
			 sum += num2;
			 num2++;
		 }while(num2<11);
		 System.out.println(sum2);
		 int sum3 = 0;
		 /*for문 1부터 10까지 합*/
		 for(int num3 = 0;num3<11;num3++){
			 sum3 += num3;
			 
		 }
			System.out.println(sum3);
		}
	}



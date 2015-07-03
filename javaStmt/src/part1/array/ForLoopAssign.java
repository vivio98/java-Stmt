package part1.array;
/*
 * 1부터 10까지의 합.
 */

public class ForLoopAssign {
	public static void main(String[] args) {
		int[]intArr = new int[10];
		int sum =0;
		for (int i = 0; i < intArr.length; i++) {
			intArr[i] = i+1;// 변수선언을 최소화 하려는 노력의 일환
			sum += intArr[i];	
		
		}
			
	System.out.println(sum);
		}
		
		}
/*
 *  intArr[0] = 1;
 *  intArr[0] = 2;
 *  ...
 *  intArr[9] = 10;
 */


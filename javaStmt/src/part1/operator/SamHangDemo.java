package part1.operator;

public class SamHangDemo {
	public static void main(String[] args) {
		int x=1, y=0, z = 0;
		boolean bool = false; // boolean 은 논리연산자 
		z = bool ? x : y ;
		System.out.println("삼항연산자 결과 출력 : " + z);
		// bool 이 true 인 경우  : x 값인 1 출력
		//bool 이  false 인 경우  : y 값인 0 출력
		/*
		 Q.
		 정수형 타입  flag 은  10입니다
		 정수형 타입 flag2 은 20입니다
		 주어진 식이
		 () ? "flag 은 flag2 보다 큽니다" : "flag 은 flag2 보다 작습니다"
     일때.. 콘솔창에 참인 값이 출력되도록
         을 구현		 
    	 */
		int flag = 10, flag2 = 20;
		boolean result = flag > flag2;
		String result2 = (result) ? "flag 은 flag2 보다 큽니다" : "flag 은 flag2 보다 작습니다";
		/*
		 출력값(리턴값)이 정수형이면 결과값에 해당하는 변수 타입을 int 로 주고 
	       출력값(리턴값)이 리터럴이면 결과값에 해당하는 변수 타입을 String 이라고 준다.
		 */
			
	}
	
	

}

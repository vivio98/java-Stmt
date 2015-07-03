  /*데이터  타입 이란?
 ->메모리를 생성하기 위한 도구
 =>메모리외 크기(size) 와 메모리 형태(type) 을 지정하기 위한 도구 
 메모리를 열고 사용 하는 방법
 메모리의 크기를 설정
 메모리에 식별자(고유 이름)
 메모리 에 데이터를 입력*/


package part01.aboutJava;

public class AboutDataType {
	public static void main(String[] args) {
//		main 메소드 : 소스를 콘솔창에 띄우는 역할을 하는 함수(=메소드,자바에서는 메소드 라고 함)
		//main 메소드 단축기 : main +ctrl +space +enter
		// 1변수의 선언 (4바이트의 메모리 생성)
		
		int a; 
	   // 4바이트의 메모리에 타입에 맞는 값을 세팅(할당)
		a = 5;
		 
	  // 데이터 타입을 선언하고 값을 할당하는 액션 : 1줄로 합치기
	   int b = 5;
	   // 현재 3번까지의 액션이 HDD 에 저장된 형태이다.
	  // 이것을 메모리에 로딩해서 단계까지 하는 것은...단축기)SYSO + CTRL SPACES
	System.out.println(b);
	//5.연산을 통해 결과 값을 보여주기 : 
	}

}

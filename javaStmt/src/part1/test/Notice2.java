package part1.test;

import java.util.Scanner;

public class Notice2 {
	public static void main(String[] args) {
		int kor =0,eng=0,math=0,sum=0; // 지역변수는 초기화 필수 
		double avg = 0.0d; //실수(소수점)타입은 더블타입으로 초기화
	    String msg =""; //스트링 타입은 리터럴 중에서 nu11로 초기화
		sum = 0; 
		avg = 0;
	    /*
		 * 스캐너로 성적을 입력하면
		 * 합계에 따라 합격여부를 통지하는 프로그램
		 */
		Scanner scanner = new Scanner(System.in);
		System.out.println("국어");
		kor =scanner.nextInt();
		System.out.println("영어");
		eng =scanner.nextInt();
		System.out.println("수학");
		math =scanner.nextInt();
		sum = kor + eng +  math;
		avg =sum/3d;
		
	    /*
	     * 조건에 따라 결과값의 통지 내용이 달라짐
	     * 평균 100점이면 보너스 지급 
	     * 평균 70이상 이면 합격
	     * 평균 70미만이면 불합격
	     
	     */
		int key = (int) (avg/10);
		switch (key) {
		case 10: msg="보너스";break;
		case 9:case 8: case 7: msg="합격";break;

		default: msg="불합격"; break;

		}
		System.out.println(msg);
				
	
		}
	}



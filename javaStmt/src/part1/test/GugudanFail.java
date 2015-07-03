package part1.test;
/*
 * @ 0615
 * 
 * @Story : 2중 for 연습문제.
 * 구구단의 원시타입. 하지만 완성형은 아닌상태
 */
public class GugudanFail {
	public static void main(String[] args) {
		for (int i = 2; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.print(i+"*"+j+"="+i*j+"\t");
			}
			System.out.println();
		}
      		
	}

}

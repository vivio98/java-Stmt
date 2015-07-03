package part1.array;
/*Date : someday:
 * Author :
 * story
 *
 * 
 */

public class MultiDimArray {
	public static void main(String[] args) {
		int[][]fiveMatrix = new int[5][5];
		int k = 0;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <5; i++) {
				k += 5; // k값은 5씩 증가하는 값
				fiveMatrix[i][j] = k;
				System.out.print(fiveMatrix[i][j]+"\t");
			}
			System.out.println("\n"); // 라인개행을 한번더 하겠다는 뜻
		}
		
	}

}

package part1.array;

public class StringArrayDemo {
	public static void main(String[] args) {
		String[] arr; // StringŸ���� �迭 ���� 
		arr = new String[3]; // 3ó�� �׻�  �ε��� ����� �Է��ؾ� ��.
		
		double[] douArr;
		douArr = new double[3];
		
		arr[0] = "1";
		arr[1] = "2";
		arr[2] = "3";
		arr[3] = "300";
		for(int i=0;i<3;i++){
			System.out.println(arr[i]);
		}
		/*java.lang.ArrayIndexOutOfBoundsException: 3
		 * �� �����޼����� �迭�� ũ�⸦ ���
		 * �������� �Էµ� ������ ��Ÿ��
		 * 
		 */
		
				
	}
	
}

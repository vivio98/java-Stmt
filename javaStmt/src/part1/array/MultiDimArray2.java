package part1.array;

public class MultiDimArray2 {
	public static void main(String[] args) {
		String[][] names = {{"Mr.","Ms.","Mrs."},{"smith","Jones","Alex"}};
		
		
		
		System.out.println(names[0][0] + names[1][1]);
		// Ms.Alex ���
		
		System.out.println(names[0][1] + names[1][2]);
		//Mrs.Smith
		System.out.println(names[0][2]+names[1][0]);
	}

}

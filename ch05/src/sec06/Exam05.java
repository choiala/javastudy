package sec06;

import java.util.Scanner;

public class Exam05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("학생수 : ");
		String strStudentNum = scanner.nextLine();
		int studentNum = Integer.parseInt(strStudentNum);
		
		int[] arr = new int[studentNum];
		
		for(int i=0; i<arr.length; i++) {
			System.out.print("점수 입력 : ");
			String data = scanner.nextLine();
			int score = Integer.parseInt(data); 
			arr[i] = score; // arr[i] = Integer.parseInt(data); 
		}
		//arr[5] = 90; //ArrayIndexOutOfBoundsException
		
		int sum = 0;
		for(int i = 0; i<arr.length; i++) {
			sum += arr[i];
		}
		double avg = (double)sum / arr.length; // 1.0 * sum
		System.out.println("평균 : " + avg);

	}

}

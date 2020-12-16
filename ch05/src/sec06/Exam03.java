package sec06;

public class Exam03 {

	public static void main(String[] args) {
		int[] arr = new int[5];
		arr[0] = 90;
		arr[1] = 91;
		arr[2] = 92;
		arr[3] = 93;
		arr[4] = 95;
		//arr[5] = 90; //ArrayIndexOutOfBoundsException
		
		int sum = 0;
		for(int i = 0; i<arr.length; i++) {
			sum += arr[i];
		}
		double avg = (double)sum / arr.length; // 1.0 * sum
		System.out.println(avg);

	}

}

package sec02;

public class Exam02 {

	public static void main(String[] args) {
		int value = 1;
		
		switch(value) {
			case 1: //value의 값이 1인 경우
				System.out.println("1");
			case 2:
				System.out.println("2");
				break;
			case 3:
				System.out.println("3");
				break;
			default:
				System.out.println("4");
		}

	}

}

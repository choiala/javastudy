package sec03;

public class Exam01 {

	public static void main(String[] args) {
		// �ݺ��� for
		
		int sum = 0;
		
		for(int i=1; i<=100; i++) {
			sum += i; // 1+2+...+100
		}
		System.out.println("sum:" + sum);
		
		for(int i=10; i>=1; i--) {
			System.out.println(i);
		}
		
		//������
		for(int i=2; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				System.out.println(i + "*" + j + "=" + (i*j));
			}
			System.out.println(); //�� �� ���� ���
		}
		
		// ���� ������
		for(int m=1; m<=9; m++) {
			for(int n=2; n<=9; n++) {
				System.out.print(n + "*" + m + "=" + (n*m) + "\t");
			}
			System.out.println();
		}
		


	}

}

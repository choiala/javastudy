package sec08;

public class Calculator {
	//Field
	
	//Constructor
	Calculator(){
		
	}
	
	//Method
	//�޼ҵ�� Ŭ���� �̸��� ������ �޶����
	//���ϵǴ� ���� Ÿ���� �տ� �ٿ��� �� ex)void : ���ϰ� ���� ����ǰ� ��
	void print() {
		for(int i=0; i<5; i++) {
			System.out.println("�⺻ ������ ����մϴ�.");
			if(i == 2) {
				//break;
				return; // void�� ������� ������ ����
			}
		}
		System.out.println("����Ʈ �Ϸ�");
	}
		
	
	void print(String message) {
		System.out.println(message);
	}
	
	void print(String message, int temp) {
		System.out.println(message);
		System.out.println("�µ� : " + temp);
	}
	
	int plus(int x, int y) {
		int result = x + y;
		return result; //���� ȣ���� ������ �����ְڴ�
	}
	
	String join(String s1, String s2) {
		String result = s1 + "-" + s2;
		return result;
	}
	
	//�迭�� �Ű������� �޾Ƽ� �迭�ȿ� ��� ���� ���ؼ� ����
	int sum(int[] arr){ 
		int sum = 0;
		for(int value : arr){
			sum += value;
		}
		return sum;
	}
	
	int sum2(int... arr){ //... : ����� �𸣰ڴ� 
		int sum = 0;
		if(arr == null) {
			return 0;
		}
		for(int value : arr){
			sum += value;
		}
		return sum;
	}
}

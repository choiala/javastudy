package sec06;

public class Exam01 {

	public static void main(String[] args) {
		
		int[] scores = {95, 80, 91, 78, 99};
		for(int i=0; i<scores.length; i++) {
			System.out.println(scores[i]);
		}
		
		//int[] scores2; //������ ���� �ߴٰ� ������ �������� ����.
		//System.out.println(scores2[0]); //NullPointException
		int[] scores2 = null;
		if(scores2 == null) {
			scores2 = new int[] {95, 80, 91, 78, 99}; //new : ��ü�� ���Ӱ� ������
		}
		System.out.println(scores2[0]);	
		
		//�޼ҵ� ȣ��(�޼ҵ� ����� �����ض�)
		String[] arr = {"�ڹ�", "���̽�", "�ڹٽ�ũ��Ʈ"};
		printNames(arr);
		
		printNames(new String[]{"�ڹ�2", "���̽�2", "�ڹٽ�ũ��Ʈ2"});
	}
	
	//�޼ҵ� ����(����)
	public static void printNames(String[] names) { //�޼ҵ� ȣ�� �κа� Ÿ�Ը� ������ ��, arr -> names ��������
		for(int i=0; i<names.length; i++) {
			System.out.println(names[i]);
		}
	}

}

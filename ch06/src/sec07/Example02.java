package sec07;

public class Example02 {

	public static void main(String[] args) {


		String str1 = "ABC";
		
		String str2 = new String("ABC");
		
		byte[] arr1 = {65,66,67};
		System.out.println(arr1); //65,66,67�� ��µǰ� �Ϸ���?
		String str3 = new String(arr1);
		System.out.println(str3); //�� ABC�� ������?
		
		char[] arr2 = {'A','B','C'}; //���ڴ� ���ڿ��� ���� �� �ִٴ� �Ҹ�? �ڹ� ������ String �κ� �� ��
		String str4 = new String(arr2);
		
		//int[] arr3 = {65,66,67}; //String�� int������
		//String str5 = new String(arr3); //������ڸ� �־ ��ü�� ���� �� �ִ����� document����

	}

}

package sec04;

public class Exam02 {
	public static void main(String[] args) {
		
		String var1 = "123456-1234567";
		int num1 = var1.length(); //var1�� ���� ��� �߿��� length()����� ���ڴ�. �޼ҵ� ȣ��
		                         //.length() : var1�� ������ ���� ����� ���ڿ��� ���̰�����
		System.out.println(num1);
		
		String var2 = null;		
		//if(var2!=null) {
			int num2 = var2.length(); //null�� ���¿��� length() ��� �Ұ� : NullPointException
									  //�ذ� ��� : ���� �־� �ִ���, �� �� ó�� if�� ������
			System.out.println(num2);
		//}
		
	}

}

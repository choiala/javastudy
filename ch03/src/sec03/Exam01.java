package sec03;

public class Exam01 {

	public static void main(String[] args) {
		//���� ������(++, --, +=, !)
		
		// ���� ������
		int var1 = 1;
		//1�� ����
		var1++; // ++var; �� ����, ++�� ���̽㿡�� ���� x
		++var1;
		System.out.println(var1);
		
		//1�� ����
		var1--; // ++var; �� ����, ++�� ���̽㿡�� ���� x
		--var1;
		System.out.println(var1);
		
		//�ٸ� �����ڿ� ���� ����� ��� ����
		int var2 = 1;
		int var3 = var2++ + 5; //���� �������� ++�� �տ� ������ ++���� �� ���, ++�� �ڿ� ������ ���� �� ++ ��� 
		System.out.println(var3);
		
		int var4 = (var2++) + 5; //��ȣ�� ���ҿ�, �̷��� ���� ���ƶ� / �ܵ����θ� ����϶� ex) var++;
 		System.out.println(var4);
 		
 		//���� ������ ���� �����ϴ� �����
 		int var5 = 1;
 		var5 += 3; // var5 = var5 + 3;
 		var5 -= 3; // var5 = var5 - 3;
 		var5 *= 3; // var5 = var5 * 3;
 		var5 /= 3; // var5 = var5 / 3;
 		
 		//�� ���� �����ϴ� �����
 		boolean var6 = false;
 		boolean var7 = !var6;
 		
	}

}

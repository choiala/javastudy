package sec09;

public class KoreanExample {

	public static void main(String[] args) {
		//���� �ʵ� �б�
		System.out.println(Korean.nation);
		
		//���� �ʵ� ����
		Korean.nation = "���ѹα�";
		System.out.println(Korean.nation);
		
		//�޼ҵ� ȣ��
		//Korean.getNation(); //Ŭ������ ������ �� ����
		//Korean k1 = new Korean();
		//k1.getNation(); //nation�� Static�̶� ��ü�� ȣ���ؾ���
		System.out.println(Korean.getNation()); //static�̶� Koeran. ���� ȣ��
		//System.out.println(Korean.getName()); //��ü �ȸ��� ����
		
		Korean k1 = new Korean();
		k1.name = "ȫ�浿";
		System.out.println(k1.getName());

	}

}

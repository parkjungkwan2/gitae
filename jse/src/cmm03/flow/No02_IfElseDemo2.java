package cmm03.flow;

public class No02_IfElseDemo2 {
	public static void main(String[] args) {
		int kor = 90, eng = 85, sum = 0;
		double avg = 0.0;
		String msg = "�޽���";
		sum = kor + eng;
		avg = sum/2;
		
		// ���ǿ� ���� if ó��
		/*
		 * ����� 100���̸� "���ʽ� ����"
		 * ����� 70 �̻��̸� "���� �հ�"
		 * ����� 70 �̸��̸� "������� ������."
		 * 
		 * */
		
		
		System.out.println("���� : " + kor);
		System.out.println("���� : " + eng);
		System.out.println("���� : " + sum);
		System.out.println(msg);
		
		if(avg == 100){
			System.out.println("���ʽ� ����");
		} else if(avg >= 70){
			System.out.println("���� �հ�");
		} else
			System.out.println("������� ������.");
	}
}
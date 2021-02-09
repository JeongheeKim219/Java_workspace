class ReportCard {
	public static void main(String [] args) {
		//�ʱ�ȭ
		String name = "";
		int koreanScore = 0, englishScore = 0, mathScore = 0;
		int total = 0;
		double average = 0.0;
		char grade = '\u0000';

		//�� ����
		name = "�赿��";
		koreanScore = (int)(Math.random() * 56) + 45;
		englishScore = (int)(Math.random() * 56) + 45;
		mathScore = (int)(Math.random() * 56) + 45;
		
		//������ ������ ������ ����, ��� ���ϱ�
		total = koreanScore + englishScore + mathScore;
		average = total / 3.0;
		average = (int)(average * 10) / 10.0;

		//if���� Ȱ�� grade �� 
		if(average >= 90) grade = 'A';
		else if(average >= 80 && average < 90) grade = 'B';
		else if(average >= 70 && average < 80) grade = 'C';
		else if(average >= 60 && average < 70) grade = 'D';
		else grade = 'F';

		//ȭ�� ���
		System.out.println();
		System.out.println("<if>");
		System.out.println(name + "���� ������");
		System.out.println("�������� : " + koreanScore);
		System.out.println("�������� : " + englishScore);
		System.out.println("�������� : " + mathScore);
		System.out.println("���� : " + total + ", ��� : " + average + ", ���� : " + grade + " �Դϴ�.");
		
		//switch���� Ȱ�� grade ��
		switch((int)average/10) {
			case 9: grade = 'A'; break;
			case 8: grade = 'B'; break;
			case 7: grade = 'C'; break;
			case 6: grade = 'D'; break;
			default: grade = 'F';
		}
		
		//ȭ�� ���
		System.out.println();
		System.out.println("<switch>");
		System.out.println(name + "���� ������");
		System.out.println("�������� : " + koreanScore);
		System.out.println("�������� : " + englishScore);
		System.out.println("�������� : " + mathScore);
		System.out.println("���� : " + total + ", ��� : " + average + ", ���� : " + grade + " �Դϴ�.");
	}
}
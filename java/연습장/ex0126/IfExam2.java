class IfExam2 {
	public static void main(String [] args) {
		int randNum = (int)(Math.random() * 10) + 1;
		if(randNum == 1) System.out.println("�Ͽ���");
		else if(randNum == 2) System.out.println("������");
		else if(randNum == 3) System.out.println("ȭ����");
		else if(randNum == 4) System.out.println("������");
		else if(randNum == 5) System.out.println("�����");
		else if(randNum == 6) System.out.println("�ݿ���");
		else System.out.println("�����");
	}
}
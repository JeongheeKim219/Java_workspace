class MultiplicationTable {
	public static void main(String [] args) {
		
		//1~100���� 10�� 10���� ��� (for�� �ȿ� for�� �̿�)
		System.out.println();
		System.out.println("<1~100���� 10�� 10���� ���>");
		for(int i = 0; i < 10; i++) {
			for(int j = 1; j <= 10; j++)
				System.out.print((i*10 + j) + " ");
			System.out.println();
		}


		//������
		System.out.println();
		System.out.println("<������ ���>");
		for(int i = 1; i <= 9; i++) {
			for(int j = 2; j <= 9; j++)
				System.out.print(j + " * " + i + " = " + (i*j) + "\t");
			System.out.println();
		}
	}
}
class DoWhileExam01 {
	public static void main(String [] args) {
		int i = 1;
		int j = 1;
		int sum = 0;
		char c = 'A';

		//1. 1~100���� �� �ٷ� ���
		System.out.println();
		System.out.println("1~100���� �� �ٷ� ���");

		i = 1;
		do {
			System.out.print(i + " ");
			i++;
		} while(i <= 100);

		//2. 1~100���� 10�� 10���� ��� (while�� �ȿ� if��)
		System.out.println();
		System.out.println();
		System.out.println("1~100���� 10�� 10���� ��� (while�� �ȿ� if��)");

		i = 1;
		do {
			System.out.print(i + "\t");
			if(i % 10 == 0)
				System.out.println();
			i++;
		} while(i <= 100);

		//3. A~Z ���ٷ� ���
		System.out.println();
		System.out.println("A~Z ���ٷ� ���");

		do {
			System.out.print(c + " ");
			c++;
		} while(c <= 'Z');

		//4. 1~100������ �� ���
		System.out.println();
		System.out.println();
		System.out.println("1~100������ �� ���");
		
		i = 1;
		do {
			sum += i++;
		} while(i <= 100);
		System.out.println(sum);

		//5. 1~100���� 10�� 10���� ��� (while�� �ȿ� while��)
		System.out.println();
		System.out.println("1~100���� 10�� 10���� ��� (while�� �ȿ� while��)");

		j = 1;
		i = 0;
		do {
			do {
				System.out.print(i + j + "\t");
				j++;
			} while(j <= 10);
			j = 1;
			i += 10;
			System.out.println();
		} while(i < 100);

		//6. ������ ���
		System.out.println();
		System.out.println("������ ���");
		i = 1;
		j = 2;
		do {
			do {
				System.out.print(j + " x " + i + " = " + (j*i) + "\t");
				j++;
			} while(j <= 9);
			j = 2;
			i++;
			System.out.println();
		} while(i <= 9);
	}
}
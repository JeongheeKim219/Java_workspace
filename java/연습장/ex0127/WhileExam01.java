class WhileExam01 {
	public static void main(String [] args) {

		int i = 1;
		int j = 1;
		int sum = 0;
		char c = 'A';



		//1. 1~100���� �� �ٷ� ���
		System.out.println();
		System.out.println("1~100���� �� �ٷ� ���");

		i = 1;
		while(i <= 100) {
			System.out.print(i + " ");
			i++;
		}

		//2. 1~100���� 10�� 10���� ��� (while�� �ȿ� if��)
		System.out.println();
		System.out.println();
		System.out.println("1~100���� 10�� 10���� ��� (while�� �ȿ� if��)");

		i = 1;
		while(i <= 100) {
			System.out.print(i + "\t");
			if(i % 10 == 0)
				System.out.println();
			i++;
		}

		//3. A~Z ���ٷ� ���
		System.out.println();
		System.out.println("A~Z ���ٷ� ���");

		while(c <= 'Z') {
			System.out.print(c + " ");
			c++;
		}

		//4. 1~100������ �� ���
		System.out.println();
		System.out.println();
		System.out.println("1~100������ �� ���");
				
		i = 1;
		while(i <= 100) sum += i++;
		System.out.println(sum);
		
		//5. 1~100���� 10�� 10���� ��� (while�� �ȿ� while��)
		System.out.println();
		System.out.println("1~100���� 10�� 10���� ��� (while�� �ȿ� while��)");

		j = 1;
		i = 0;
		while(i < 100) {
			while(j <= 10) {
				System.out.print(i + j + "\t");
				j++;
			}
			j = 1;
			i += 10;
			System.out.println();
		}

		//6. ������ ���
		System.out.println();
		System.out.println("������ ���");
		i = 1;
		j = 2;

		while(i <= 9) {
			while(j <= 9) {
				System.out.print(j + " x " + i + " = " + (j*i) + "\t");
				j++;
			}
			j = 2;
			i++;
			System.out.println();
		}
	}
}
class Star {
	public static void main(String [] args) {

		//star ���� ����
		int star = 5;
		int i = 0;
		int j = 0;
		
		//while�� Ȱ��
		while(i < star) {
			while(j <= i) {
				System.out.print("��");
				j++;
			}
			i++;
			j = 0;
			System.out.println();
		}

		System.out.println("*****************************");

		i = 0;
		j = star;

		while(i < star) {
			while(j > i) {
				System.out.print("��");
				j--;
			}
			i++;
			j = star;
			System.out.println();
		}


		System.out.println("*****************************");
		
		i = star;
		j = 0;
	
		while(i > 0) {

			while(j < i - 1) {
				System.out.print("  ");
				j++;
			}

			j = star;

			while(j > i - 1) {
				System.out.print("��");
				j--;
			}

			j = 0;
			i--;
			System.out.println();
		}


		System.out.println("*****************************");

		i = star;
		j = star;

		while(i > 0) {
			while(j > i) {
				System.out.print("  ");
				j--;
			}

			j = 0;

			while(j < i) {
				System.out.print("��");
				j++;
			}

			i--;
			j=star;
			System.out.println();
		}
		////////////////////////  do while Ȱ��  ////////////////////////
		do {
			do {
				System.out.print("��");
				j++;
			} while(j <= i);

			i++;
			j = 0;
			System.out.println();
		} while(i < star);

		System.out.println("*****************************");

		i = 0;
		j = star;

		do {
			do {
				System.out.print("��");
				j--;
			} while(j > i);

			i++;
			j = star;
			System.out.println();
		} while(i < star);


		System.out.println("*****************************");
		
		i = star;
		j = 0;
	
		do {
			//������ �� ���̶� �����ϱ⿡�� �δ��� Ŀ�� while���� �״�� ���
			while(j < i - 1){
				System.out.print("  ");
				j++;
			}

			j = star;

			do {
				System.out.print("��");
				j--;
			} while(j > i - 1);

			j = 0;
			i--;
			System.out.println();
		} while(i > 0);


		System.out.println("*****************************");

		i = star;
		j = star;

		do {
			//������ �� ���̶� �����ϱ⿡�� �δ��� Ŀ�� while���� �״�� ���
			while(j > i){
				System.out.print("  ");
				j--;
			} 

			j = 0;

			do {
				System.out.print("��");
				j++;
			} while(j < i);

			i--;
			j=star;
			System.out.println();
		} while(i > 0);

	}
}
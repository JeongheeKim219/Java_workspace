class ArrayExam{
	public static void main(String [] args) {

		//��int,double,char,boolean ,String type���� �� 5���� �����ϴ�  �迭�� �����ϼ���
		int iArray [] = new int [5];
		double dArray [] = new double [5];
		char cArray [] = new char [5];
		String sArray [] = new String [5];
		boolean bArray [] = new boolean [5];


		//���θ޼ҵ忡��
		//ArrayExam�� �޼ҵ���� ������� ȣ���ϼ���.
	
		ArrayExam arrayExam = new ArrayExam();

		arrayExam.printArrayValue01(iArray);
		arrayExam.printArrayValue02(iArray);
		arrayExam.printArrayValue03(iArray);

		System.out.println();

		arrayExam.printArrayValue01(dArray);
		arrayExam.printArrayValue02(dArray);
		arrayExam.printArrayValue03(dArray);

		System.out.println();

		//charŸ�� �ʱ�ȭ�ϸ� ����� �ȵǾ �������� �ʱ�ȭ
		for(int i = 0; i < cArray.length; i++)
			cArray[i] = ' ';
		arrayExam.printArrayValue01(cArray);
		arrayExam.printArrayValue02(cArray);
		arrayExam.printArrayValue03(cArray);

		System.out.println();

		arrayExam.printArrayValue01(sArray);
		arrayExam.printArrayValue02(sArray);
		arrayExam.printArrayValue03(sArray);

		System.out.println();

		arrayExam.printArrayValue01(bArray);
		arrayExam.printArrayValue02(bArray);
		arrayExam.printArrayValue03(bArray);
	}

	//�޼ҵ� : printArrayValue01	
	//���� �迭�鿡 �ڵ����� �ʱ�ȭ �Ȱ��� ����ϼ���
	public void printArrayValue01(int [] iArray) {
		System.out.println("int�� printArrayValue01");
		for(int i = 0; i < iArray.length; i++)
			System.out.print(iArray[i] + ", ");
		System.out.println();
	}

	public void printArrayValue01(double [] dArray) {
		System.out.println("double�� printArrayValue01");
		for(int i = 0; i < dArray.length; i++)
			System.out.print(dArray[i] + ", ");
		System.out.println();
	}

	public void printArrayValue01(char [] cArray) {
		System.out.println("char�� printArrayValue01");
		for(int i = 0; i < cArray.length; i++) {
			System.out.print(cArray[i] + ", ");
		}
		System.out.println();
	}

	public void printArrayValue01(String [] sArray) {
		System.out.println("String�� printArrayValue01");
		for(int i = 0; i < sArray.length; i++)
			System.out.print(sArray[i] + ", ");
		System.out.println();
	}

	public void printArrayValue01(boolean [] bArray) {
		System.out.println("boolean�� printArrayValue01");
		for(int i = 0; i < bArray.length; i++)
			System.out.print(bArray[i] + ", ");
		System.out.println();
	}

	//�޼ҵ� : printArrayValue02	
	//���� 5���� �迭���� ���� ������ ������ data�� �Ҵ��ϼ���.
	public void printArrayValue02(int [] iArray) {
		for(int i = 0; i < iArray.length; i++)
			iArray[i] = (int)(Math.random() * 10) + 1;
	}

	public void printArrayValue02(double [] dArray) {
		for(int i = 0; i < dArray.length; i++)
			dArray[i] = (Math.random() * 10) + 1;
	}

	public void printArrayValue02(char [] cArray) {
		for(int i = 0; i < cArray.length; i++)
			cArray[i] = (char)(int)('A' + i);
	}

	public void printArrayValue02(String [] sArray) {
		for(int i = 0; i < sArray.length; i++)
			sArray[i] = "sArray" + i;
	}

	public void printArrayValue02(boolean [] bArray) {
		for(int i = 0; i < bArray.length; i++) {
			if((int)(Math.random() * 2) == 1)
				bArray[i] = true;
			else
				bArray[i] = false;

		}
	}

	//�޼ҵ� : printArrayValue03	
	//���Ӱ� �Ҵ�Ȱ��� ����ϼ���
	public void printArrayValue03(int [] iArray) {
		System.out.println("int�� printArrayValue03");
		this.printArrayValue01(iArray);
	}

	public void printArrayValue03(double [] dArray) {
		System.out.println("double�� printArrayValue03");
		this.printArrayValue01(dArray);
	}

	public void printArrayValue03(char [] cArray) {
		System.out.println("char�� printArrayValue03");
		this.printArrayValue01(cArray);
	}

	public void printArrayValue03(String [] sArray) {
		System.out.println("String�� printArrayValue03");
		this.printArrayValue01(sArray);
	}

	public void printArrayValue03(boolean [] bArray) {
		System.out.println("boolean�� printArrayValue03");
		this.printArrayValue01(bArray);
	}
}